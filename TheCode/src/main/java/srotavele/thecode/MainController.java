package srotavele.thecode;

import org.springframework.stereotype.Controller;
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
	@RequestMapping(value = "/code", method =RequestMethod.POST)
	public String code(@RequestParam(value="code") String code, RedirectAttributes wrong) {
		if(code.equals("Bushido")) {
			return "code.jsp";
		} else {
			wrong.addFlashAttribute("error", "You must train harder!!");
		}
		return "redirect:/";
	}
	
	

}
