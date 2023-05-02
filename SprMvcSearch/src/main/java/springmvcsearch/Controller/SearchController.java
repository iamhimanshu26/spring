package springmvcsearch.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping(path="/home")
	public String home() {
		System.out.println("Home url is hit by home() hander method.");
		return "home";
	}

	// To fetch the store data present in the form, we are using here @RequestParam annotation,
	@RequestMapping(path="/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		String url="https://www.google.com/search?q="+ query;
		RedirectView redirectView = new RedirectView();
		
		if(query.isEmpty()) {
			System.out.println("You haven't enter anythings, please enter the keyword.");
			redirectView.setUrl("home");
			return redirectView;
		}
		
		redirectView.setUrl(url);
		return redirectView;
	}
}
