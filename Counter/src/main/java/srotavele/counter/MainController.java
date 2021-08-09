package srotavele.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
//	
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		int count = 0;
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", count);
		} else {
//			count = 1;
			session.setAttribute("count", (int) session.getAttribute("count") + 1);
		}
		return "index.jsp";			
	}

	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		return "counter.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
}
