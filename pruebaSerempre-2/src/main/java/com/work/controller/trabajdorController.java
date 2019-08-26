package com.work.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.work.entity.Trabajador;
import com.work.repository.trabajadorRepo;
import com.work.servicios.trabajadorServicios;

@Controller
@ComponentScan(basePackages = "com.work.servicios")
public class trabajdorController {
	
	@Autowired
	
	private trabajadorServicios tr;
	
	
	@RequestMapping( "/")
	public String viewHome(Model model) {
		List<Trabajador> listTrabajador = tr.listAll();
		model.addAttribute("listTareas", listTrabajador);		
		return "index";		
	}
	
	@RequestMapping("/new")
	public String showNewHomeWork(Model model){
		Trabajador homework = new Trabajador();
		model.addAttribute("homework", homework);
		return "new_homework";		
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveHomework(@ModelAttribute("homework") Trabajador trabajador){
		tr.save(trabajador);
		return "redirect:/";
		
	}
	
	@RequestMapping("/edit/{idTarea}")
	public ModelAndView showEditHomeworkform(@PathVariable(name = "idTarea")String id) {
		ModelAndView mav = new ModelAndView("addRealWork");
		
		Trabajador homework = tr.get(id);
		mav.addObject("homework", homework);
		return mav;
	}	
}
