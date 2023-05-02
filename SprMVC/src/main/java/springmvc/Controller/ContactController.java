package springmvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.Model.User;
import springmvc.Service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
// 7- Using @ModelAttribute on common method 
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "Welcome to our site");
		model.addAttribute("Desc", "Home for Learner");
		System.out.println("Common method is hit");
		
	}

// 6-	
//	@RequestMapping(path = "/contact")
//	public String showForm(Model model) {
//		model.addAttribute("Header", "Welcome to our site");
//		model.addAttribute("Desc", "Home for Learner");
//		return "contact";
//	}
	
// 1-
//	@RequestMapping("/contact")          This way and the below are the same.
	@RequestMapping(path = "/contact")
	public String showForm() {
		System.out.println("This is hit by contact url");
		return "contact";
	}
	
// 2- 
	// This was the older way to fetch the from UI to Backend.
//	@RequestMapping(path= "/processform", method = RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) {
//		String email = request.getParameter("UserEmail");
//		String name = request.getParameter("UserName");
//		String pw = request.getParameter("UserPassword");
//		
//		System.out.println("User Email is "+ email);
//		System.out.println("User name is "+ name);
//		System.out.println("User password is "+ pw);
//		
//		return " ";
//	}
	
	
// 3- 
	// Fetching the data from UI to Backedn using @RequestParam annotation
//	@RequestMapping(path= "/processform", method = RequestMethod.POST)
//	public String handleForm(
//			// @RequestParam(name= "UserEmail" , required = true) String email,
//			@RequestParam("UserEmail") String email, 
//			@RequestParam("UserName") String name, 
//			@RequestParam("UserPassword") String pw, Model model) {
//	System.out.println("User Email is "+ email);
//	System.out.println("User Name is "+ name);
//	System.out.println("User Password is "+ pw);
//	model.addAttribute("name", name);
//	model.addAttribute("email", email);
//	model.addAttribute("pw", pw);
//		return "success";
//	}
	
	
// 4-	
	// fetching the data using Entity Class 
//	@RequestMapping(path= "/processform", method = RequestMethod.POST)
//	public String handleForm(
//			@RequestParam("UserEmail") String email, 
//			@RequestParam("UserName") String name, 
//			@RequestParam("UserPassword") String pw, Model model) {
//
//		User user= new User();
//		user.setUserEmail(email);
//		user.setUserName(name);
//		user.setUserPassword(pw);
//		
//		System.out.println(user);
//		model.addAttribute("user", user);
//		return "success";
//	}
	
// 5-	
	// Fetching the data using @ModelAttribute annotation-
	@RequestMapping(path= "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		if(user.getUserName().isBlank()){
			System.out.println("You forgot to add Username, please enter it.");
			return "redirect:/contact";
			}
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg", "User has created successfully with id: "+ createdUser);
		return "success";
	}

	
	// Created USerservice object to call its createUser(). 
}
