package com.jh.s1;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jh.s1.notice.NoticeDTO;
import com.jh.s1.notice.NoticeService;

@Controller
@RequestMapping("/notice/**")

public class NoticeController {
	
	private NoticeService noticeService;
	
	public NoticeController() {
		noticeService =new NoticeService();
	}
	// /notice/sub/noticeUpdate
	
	//noticeWrite Post
	@RequestMapping(value = "noticeWrite", method = RequestMethod.POST) /* 파라미터이름과 noticeDTO이름 일치 getter setter있어야함 */
	public String noticeWrite(NoticeDTO noticeDTO) { 					/* 오버로딩 */
		return "redirect:./noticeList"; 
			
		/*
		 * request.getSession(); 
		 * request.getSession().getServletContext(); /* application */
			
		/*														newDTO
		 * System.out.println(noticeDTO.getNum());				num과 reg_date는 받아오지 않았기 때문에  null값 
		 * System.out.println(noticeDTO.getTitle());
		 * System.out.println(noticeDTO.getWriter());
		 * System.out.println(noticeDTO.getContents());
		 * System.out.println(noticeDTO.getReg_date());
		 */
	/*	return "notice/noticeList";*/
		
	}
	
	
	//noticeWrite GET
	@RequestMapping(value = "noticeWrite", method = RequestMethod.GET) /* 이 주소가 올때 메서드 실행 */
	public String noticeWrite() {			
		return "notice/noticeWrite";
	}
	
	//selectone
	
	/*
	 * @RequestMapping(value = "noticeSelect", method = {RequestMethod.GET,
	 * RequestMethod.POST} ) public Model noticeSelect(Model
	 * model,@RequestParam(value = "n", required = false, defaultValue = "1") int
	 * num) {
	 * 
	 * 
	 * System.out.println(num); String data = "Notice Data";
	 * model.addAttribute("data", data);
	 * 
	 * 
	 * return model;
	 * 
	 * }
	 */
	
	//noticeWrite
	
	
	
	
	
	//noticeselect
	
	@RequestMapping("noticeSelect")
	public ModelAndView noticeSelect() throws Exception{
		NoticeDTO noticeDTO = noticeService.noticeSelect();
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", noticeDTO);
		mv.setViewName("notice/noticeSelect");
		return mv;
	}
	
		
	
	//list
	@RequestMapping("noticeList") /* 이주소가 오면 이 메소드 실행 */
	public ModelAndView noticeList() throws Exception{
		List<NoticeDTO> ar = noticeService.noticeList();
			//URL notice/notice.List
			// return notice/noticeList 자동으로 url주소로 return 
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		return mv;
		
	}
}
