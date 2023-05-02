package springmvc.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {

//	@RequestMapping("/home")
//	public String home() {
//		System.out.println("This is hit by home url");
//		return "index";
//	}
	
	// When sending the data directly from controller to view. Need to use the Model object 
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Himanshu Sharma");
		model.addAttribute("Id", 26);
		
		// passing the collection value
		List<String> friends= new ArrayList<String>();
		friends.add("Raman Singh");
		friends.add("Sujit Kumat");
		friends.add("Varun Gupta");
		friends.add("Mani Sharma");
		friends.add("Vikas Shukla");
		
		model.addAttribute("f", friends);
		
		System.out.println("This is hit by home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is hit by about url from controller");
		return "about";
	}
	
//	@RequestMapping("/help")
//	public String help() {
//		System.out.println("This is hit by help url from controller");
//		return "help";
//	}
	
	
	
	// With the help of ModelAndView-
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help section");
		ModelAndView modelAndview = new ModelAndView();
		modelAndview.addObject("Contact", "9650192368");  // Passing the data from controller to view.\
		
		LocalDateTime currentDnT = LocalDateTime.now();
		modelAndview.addObject("DAndT", currentDnT);
	
//		// Storing the collection values.
		List<Integer> list= new ArrayList<Integer>();
		list.add(67);
		list.add(76);
		list.add(57);
		list.add(86);
		list.add(93);
		
		modelAndview.addObject("marks", list);
		modelAndview.setViewName("help");     // setting the view name which will work as suffix for viewResolver 
		                                      // /WEB-INF/views/help.jsp
		return modelAndview;
	}

}
