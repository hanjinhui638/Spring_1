package com.jh.s1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/**")

public class MemberController {
	
	
	
	
	
	
	@RequestMapping(value = "memberJoin", method = {RequestMethod.GET, RequestMethod.POST})
	public String memberJoin() {
		return "redirect:./memberJoin";
	}
	

	
	
	@RequestMapping(value = "memberLogin", method = {RequestMethod.GET, RequestMethod.POST})
	public void memberLogin() {
		
	}

}
