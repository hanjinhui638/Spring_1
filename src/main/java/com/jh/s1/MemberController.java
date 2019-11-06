package com.jh.s1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/**")

public class MemberController {
	
	
	
	
	
	
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public String memberJoin() {
		return "redirect:./memberJoin";
	}
	
	


	
	
	@RequestMapping(value = "memberLogin", method = RequestMethod.GET)
	public void memberLogin() {
		
	}

}
