package srotavele.ninjagold;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if(session.getAttribute("actions") == null) {
			ArrayList<String> actions = new ArrayList<String>();
			session.setAttribute("actions", actions);
		}
		
		return "index.jsp";
	}

	@RequestMapping(value = "/location", method = RequestMethod.POST)
	public String option(@RequestParam(name = "Doug") String Doug, HttpSession session) {
		System.out.println(Doug);

		if (Doug.equals("farm")) {
			Random rando = new Random();
			int dlog = rando.nextInt(10) + 10;
			int newDlog = (int) session.getAttribute("gold") + dlog;
			session.setAttribute("gold", newDlog);

			ArrayList<String> actions = (ArrayList<String>) session.getAttribute("actions");
			actions.add("You visited a Farm and earned " + dlog + " Gold! " + LocalDateTime.now());
			session.setAttribute("actions", actions);
			System.out.println(session.getAttribute("actions"));

		} else if (Doug.equals("cave")) {
			Random rando = new Random();
			int dlog = rando.nextInt(5) + 5;
			int newDlog = (int) session.getAttribute("gold") + dlog;
			session.setAttribute("gold", newDlog);

			ArrayList<String> actions = (ArrayList<String>) session.getAttribute("actions");
			actions.add("You visited a Cave and earned " + dlog + " Gold! " + LocalDateTime.now());
			session.setAttribute("actions", actions);
			System.out.println(session.getAttribute("actions"));

		} else if (Doug.equals("house")) {
			Random rando = new Random();
			int dlog = rando.nextInt(2) + 3;
			int newDlog = (int) session.getAttribute("gold") + dlog;
			session.setAttribute("gold", newDlog);

			ArrayList<String> actions = (ArrayList<String>) session.getAttribute("actions");
			actions.add("You visited a House and earned " + dlog + " Gold! " + LocalDateTime.now());
			session.setAttribute("actions", actions);
			System.out.println(session.getAttribute("actions"));

		} else {
			Random rando = new Random();
			int dlog = rando.nextInt(51 - (-50)) + (-50);
			if (dlog < 0) {
				int newDlog = (int) session.getAttribute("gold") + dlog;
				session.setAttribute("gold", newDlog);
				ArrayList<String> actions = (ArrayList<String>) session.getAttribute("actions");
				actions.add("You visited a Casino and LOST " + dlog + " Gold! " + LocalDateTime.now());
				
			} else if (dlog > 0) {
				int newDlog = (int) session.getAttribute("gold") + dlog;
				session.setAttribute("gold", newDlog);
				ArrayList<String> actions = (ArrayList<String>) session.getAttribute("actions");
				actions.add("You visited a Casino and WON " + dlog + " Gold! " + LocalDateTime.now());
				System.out.println(session.getAttribute("actions"));
			}
		}
		return "redirect:/";

	}

}
