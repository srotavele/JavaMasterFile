package srotavele.displaydate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/date")
	public String date(Model model) {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, 'the' d 'of' MMMM, y");
	    String text = date.format(formatter);
		model.addAttribute("text", text);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter tFormatter = DateTimeFormatter.ofPattern("h:m a");
		String newText = time.format(tFormatter);
		model.addAttribute("newText", newText);
		return "time.jsp";
	}
}
