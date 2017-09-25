package com.niit.OnlineShoppingFE.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{
	@RequestMapping("/")
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		//mv.addObject("greeting","Welcome to NIIT");
		return mv;
	}
	
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		
		ModelAndView mv=new ModelAndView("about");
		mv.addObject("title","About Us");
		
		mv.addObject("userClickAbout",true);
		
		return mv;
	}


}
