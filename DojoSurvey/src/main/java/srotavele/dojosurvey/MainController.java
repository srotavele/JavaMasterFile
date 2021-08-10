package srotavele.dojosurvey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
		@RequestMapping("/")
		public String index() {
			return "index.jsp";
		}
		@RequestMapping(value="/form", method=RequestMethod.POST)
		public String form(@RequestParam("name") String name,
				@RequestParam("location") String location,
				@RequestParam("language") String language,
				@RequestParam("comment") String comment,
				RedirectAttributes redirectAttributes,
				HttpSession session) {
			if(name.equals("")) {
				redirectAttributes.addFlashAttribute("error", "Name is Required");
				return "redirect:/";
			}
			session.setAttribute("sessionName", name);
			session.setAttribute("sessionLocation", location);
			session.setAttribute("sessionLanguage", language);
			session.setAttribute("sessionComment", comment);
			return "redirect:/results";
		}
		@RequestMapping("/results")
		public String results(Model model, HttpSession session) {
			model.addAttribute("modelName", (String) session.getAttribute("sessionName"));
			model.addAttribute("modelLocation", (String) session.getAttribute("sessionLocation"));
			model.addAttribute("modelLanguage", (String) session.getAttribute("sessionLanguage"));
			model.addAttribute("modelComment", (String) session.getAttribute("sessionComment"));
			return "results.jsp";
			
		}
		

}
