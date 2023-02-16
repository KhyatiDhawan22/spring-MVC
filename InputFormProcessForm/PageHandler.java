package co.ntien.SpringWebApp2.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageHandler {
	//1st method
	@RequestMapping(value="/input-form")
	public String showInputForm() {
		return "input-form";
	}
	//2nd method
	@RequestMapping(value="/process")
	//new changes 
	public String processInputForm(HttpServletRequest request, Model model) {
	String name=request.getParameter("studentName");
	String pass=request.getParameter("studentPass");

	
	String n=name.toLowerCase();
	String p=pass.toLowerCase();
	model.addAttribute("manipulateName",n);
	model.addAttribute("manipulatePass",p);
	//new changes 
	return "process-form";
	}
}
