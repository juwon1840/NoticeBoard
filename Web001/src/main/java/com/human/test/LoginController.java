package com.human.test;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.human.service.IF_Member04_service;
import com.human.vo.Member04VO;

@Controller
public class LoginController {
	@Inject
	IF_Member04_service memberservice;
	
	@RequestMapping(value = "/signpro", method = RequestMethod.POST)
	public String singpro(Locale locale, Model model, @ModelAttribute Member04VO mvo) throws Exception{ 
		memberservice.insert(mvo);
		return "home";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String bbsWrite(Locale locale, Model model) {
		//System.out.println("컨트폴러 호출 되는가? signup");
		return "signupForm";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Locale locale, Model model, HttpServletRequest req, HttpSession session) throws Exception {
		String username = req.getParameter("username"); // 왜 받았는가?
		String pwd = req.getParameter("pwd");  // 왜 받았는가?
		
		Member04VO loginUser = memberservice.login(username, pwd);
		//System.out.println(loginUser +"로그인");
		
		// 로그인을 세션으로 처리 하겠습니다...
		// home.jsp    bbsList.jsp  이 두개의 뷰에
		// home.jsp는 로그인 유무에 따라 로그인창 또는 정보가 보이게 하고 싶고
		// List.jsp에는 맨 위에 로그인 한 사람의 정보를 보여 주고 싶다...
		// model로 보낼 때는 둘 중 한 곳의 뷰만 선택을 해야 합니다..
		// 그런데 세션이라는 공간은 모든 뷰가 접근할 수 있는 공간으므로 세션이라는 공간에 로그인 정보를 저장하겠다. 
		if(loginUser != null) {  // 로그인이 성공했다는 의미
			// 세션처리를 어떤 정보를 할 것인가는 개발자가 결정하는데
			// 지금 예제는 아이디만 세션으로 처리하겠다.
			// 세션에 nowUser라는 변수가 있다면..  로그인했다는 의미로 해석할 수 있다. 
			session.setAttribute("nowUser", loginUser.getId());
		}else {
			model.addAttribute("err", "로그인 실패");
		}
		return "home";
		
		
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Locale locale, HttpSession session) {
		session.invalidate(); //세션지우기
		return "home";
		
	}
	
	

}




