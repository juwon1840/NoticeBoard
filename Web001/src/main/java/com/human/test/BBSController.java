package com.human.test;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.human.dao.IF_BBS04DAO;
import com.human.service.IF_BBS04_service;
import com.human.vo.BBSVO;

@Controller
public class BBSController {
//	@Inject
//	IF_BBS04DAO bbsdao;
	@Inject
	IF_BBS04_service bbsService;
	
	@RequestMapping(value = "/bbsinput", method = RequestMethod.POST)   // @ModelAttribute
	public String bbsinput(@ModelAttribute BBSVO bbsvo) throws Exception{
	/*	if(bbsvo.getScheck() == null) {
			bbsvo.setScheck("2");
		}
		bbsdao.insert(bbsvo);*/
		bbsService.insert(bbsvo);
		return "redirect:/bbslist";
	}
	
	@RequestMapping(value = "/bbslist", method = RequestMethod.GET)
	public String bbsList(Locale locale, Model model) throws Exception{
		List<BBSVO> bbslist = bbsService.selectAll();
		//System.out.println(bbslist.size()+"건을 데이터베이스로 부터 가져왔습니다.");
		model.addAttribute("bbsList",bbslist); // bbslist의 타입을 분석해 놓는게 좋다. 
		return "bbsList";
	}	
	@RequestMapping(value = "/bbsWrite", method = RequestMethod.GET)
	public String bbsWrite(Locale locale, Model model) {
		return "bbsWriteForm";
	}
/*	@RequestMapping(value = "/bbsinput", method = RequestMethod.POST)
	public String bbsinput(Locale locale, Model model, @RequestParam("user") String user,     //-2번
			 @RequestParam("pass") String pass,
			 @RequestParam("title") String title,
			 @RequestParam("memo") String memo,
			 @RequestParam("s_check") String[] schk) {
		System.out.println(schk[0]);
		System.out.println(schk[1]);
		return null;
	}*/
	
	
	@RequestMapping(value = "/delno", method = RequestMethod.GET)   // @ModelAttribute
	public String delno(@RequestParam("no") String no) throws Exception{
		//System.out.println("삭제번호 "+no);
		
		bbsService.deleteOne(no);
		return "redirect:/bbslist";
	}
	@RequestMapping(value = "/view", method = RequestMethod.GET)   // @ModelAttribute
	public String viewno(@RequestParam("no") String no,Locale locale, Model model) throws Exception{
		//System.out.println("자세히 보고 싶은 글 번호 "+no);
		
		BBSVO bbsvo = bbsService.viewDetail(no);
		model.addAttribute("bbsvo",bbsvo);
		return "detailBBS";
	}
	@RequestMapping(value = "/bbsmod", method = RequestMethod.GET)   // @ModelAttribute
	public String bbsmod(@RequestParam("no") String no,Locale locale, Model model) throws Exception{
		//System.out.println(no +" 번 수정합니다. get");  // 확인용
		
		BBSVO bbsvo = bbsService.mod(no);
		model.addAttribute("bbsvo", bbsvo);
		return "bbsModForm";
	}
	@RequestMapping(value = "/bbsmod", method = RequestMethod.POST)   // @ModelAttribute
	public String bbsmodinput(@ModelAttribute BBSVO bbsvo,Locale locale, Model model) throws Exception{
		//System.out.println(bbsvo.getNo() +" 수정합니다. post");
		//System.out.println(bbsvo.getScheck() +" 비밀글 정보");
		
		bbsService.update(bbsvo);
		return "redirect:/view?no="+bbsvo.getNo();
	}
}
