package srotavele.routingpractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	
	@RequestMapping("/{input}")
	public String index(@PathVariable("input") String input) {
		if(input.equals("dojo")) {
			return "The Dojo is awesome!";
		} else if (input.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		} else if (input.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		return "Quit while you're behind";
	}


}
