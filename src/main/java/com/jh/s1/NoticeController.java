package com.jh.s1;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jh.s1.notice.NoticeDTO;
import com.jh.s1.notice.NoticeService;

@Controller
@RequestMapping("/notice/**")

public class NoticeController {
	
	
	@Inject
	private NoticeService noticeService;

	
	
	
	// /notice/sub/noticeUpdate

	
	/*
	 * //noticeWrite Post(데이터전송)
	 * 
	 * @RequestMapping(value = "noticeWrite", method = RequestMethod.POST) 
	 * public String noticeWrite(NoticeDTO, noticeDTO) {  
	 * return "redirect:./noticeList";
	 */

	/*
	 * request.getSession(); request.getSession().getServletContext(); /*
	 * application
	 */

	/*
	 * newDTO System.out.println(noticeDTO.getNum()); num과 reg_date는 받아오지 않았기 때문에
	 * null값 System.out.println(noticeDTO.getTitle());
	 * System.out.println(noticeDTO.getWriter());
	 * System.out.println(noticeDTO.getContents());
	 * System.out.println(noticeDTO.getReg_date());
	 */
	/* return "notice/noticeList"; */
	//}

	// noticeWrite GET(페이지이동 글작성화면) 					
	@RequestMapping(value = "noticeWrite", method = RequestMethod.GET, params = {"num=1, name=iu, age"}) /* 이 주소가 올때 메서드 실행 */
	public String noticeWrite() {
		return "notice/noticeWrite";
	}
	
	//noticeWrite Post(데이터전송 글작성)		파라미터이름과noticeDTO이름 일치 getter setter있어야함  오버로딩
	@RequestMapping("noticeWrite")
	public ModelAndView noticeWrite(NoticeDTO noticeDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		int result = noticeService.noticeWrite(noticeDTO);
		
		
		
		return mv;
	}
	
	// selectone

	/*
	 * @RequestMapping(value = "noticeSelect", method = {RequestMethod.GET,RequestMethod.POST} ) 
	 * public Model noticeSelect(Model model,@RequestParam(value = "n", required = false, defaultValue = "1") int num) { 
	 * System.out.println(num); String data = "Notice Data";
	 * model.addAttribute("data", data);
	 * 
	 * 
	 * return model;
	 * 
	 * }
	 */

	// noticeselect

	@RequestMapping("noticeSelect")
	public ModelAndView noticeSelect(int num) throws Exception {
		NoticeDTO noticeDTO = noticeService.noticeSelect(num);
		ModelAndView mv = new ModelAndView();
		mv.addObject("noticeDTO", noticeDTO);
		mv.setViewName("notice/noticeSelect");
		return mv;
	}
	

	// list
	@RequestMapping("noticeList") /* 이주소가 오면 이 메소드 실행 */
	public ModelAndView noticeList() throws Exception {
		List<NoticeDTO> ar = noticeService.noticeList();
		// URL notice/notice.List
		// return notice/noticeList 자동으로 url주소로 return
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		return mv;

	}
}
