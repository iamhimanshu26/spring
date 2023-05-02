package springmvcsearch.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearch.Entity.Student;

@Controller
public class FormController {
	
	@RequestMapping(path="/form")
	public String showForm() {
		System.out.println("form url is hit with showForm().");
		return "complex_form";
	}
	
	// Getting the data on the view with @ModelAttribute to autobinding --
	@RequestMapping(path="/handleForm", method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("Student") Student student, BindingResult result) {
		System.out.println("handleFrom url is hit with formHandler().");
		if(result.hasErrors()) {
			return "complex_form";
		}
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}

}
