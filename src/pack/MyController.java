package pack;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value = "/")
	public ModelAndView openHomePage() {
		ModelAndView mav = new ModelAndView("home","obj",new Date());
		return mav;
		
	}
	@RequestMapping (value = "/login")
	public ModelAndView openLoginPage() {
		ModelAndView mav = new ModelAndView("UserLogin","greet","Welcome to Login Page");
		return mav;
	}
}
 