package springMvcOrm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping(path= "/page")
	public String myPage() {
		System.out.println("This is page url hit from controller");
		return "page";
	}

}
