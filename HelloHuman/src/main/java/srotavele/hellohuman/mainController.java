package srotavele.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
public class mainController {
	@RequestMapping("/")
	public String index(@RequestParam(value = "name", required = false) String searchQuery,
			@RequestParam(value = "lname", required = false) String lname) {
		if (searchQuery == null) {
			return "<div><h2> Hello, Human!</h2> <h3>Welcome to SpringBoot!</h3></div>";
		} else {
			return "<div><h2> Hello " + searchQuery + " " + lname
					+ "!</h2><h2> Welcome to SpringBoot!</h2><a href ='/'>Home</ahref>";
		}
	}

}
