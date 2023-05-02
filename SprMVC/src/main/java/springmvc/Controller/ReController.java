package springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping(path = "/one")
	public String first() {
		System.out.println("This is hit be one url");
		return "redirect:/two";
	}

	@RequestMapping(path= "/two")
	public RedirectView second() {
		System.out.println("This is hit be second url");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("contact");
		return redirectView;
	}
	
	@RequestMapping("/normal")
	public void another() {
		System.out.println("Hit by normal url with another method");
	}
	
}
