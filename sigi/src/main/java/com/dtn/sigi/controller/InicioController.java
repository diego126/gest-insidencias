package com.dtn.sigi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {
	
	@RequestMapping(value= {"/","/inicio","/index"})
	public ModelAndView inicio()
	{
		ModelAndView mv=new ModelAndView("inicio");
		return mv;
	}
}
