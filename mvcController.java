package SpringMvcController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mvcController {
    @GetMapping(value="/")
	public String getHome() {
		return "Home.jsp";
	}
	
}	
