package com.human.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);		
		Date date = new Date();		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}	
	@RequestMapping(value = "/{passID}", method = RequestMethod.GET)
	public String test1(Locale locale, Model model, @PathVariable("passID") String p) {
		System.out.println(p+"path ");
		return null;
	}
	
	// 컨트롤러 클래스에 클라인언트 요청 처리 메서드..
	//파라미터를 받을 것이다. 첫번째 HttpServletRequest 객체 받는 법.
	@RequestMapping(value = "/kkk", method = RequestMethod.GET)
	public String test(Locale locale, Model model, HttpServletRequest req) {
		System.out.println("Test 요청 받음."); /* 클라이언트 요청이 정확하게 들어 오는지 확인 중 */
		String name = req.getParameter("userid");
		String pwd = req.getParameter("password");
		System.out.println(name +"/"+pwd+ "을 입력하였습니다.");
		model.addAttribute("mname", name);  //view에게 mname 이라는 변수를 보내자.   
		return "test";
	}
}
