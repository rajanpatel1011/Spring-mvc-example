package pack;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@Autowired
	private Customer customer;
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
	@RequestMapping (value = "/customerRegistration")
	public ModelAndView openCustomerRegistration() {
		ModelAndView mav = new ModelAndView("RegistrationPage","cust",customer);
		return mav;
		
	}
	@RequestMapping (value = "storeCustomer", method = RequestMethod.POST)
	public ModelAndView readCustomerData(@ModelAttribute("cust")Customer customer) {
		/*Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String password = request.getParameter("pwd");
		Integer age = Integer.parseInt(request.getParameter("age"));
		Customer customer = new Customer(id,name,password,age);
		*/
		ModelAndView mav = new ModelAndView("RegistrationSuccess","customerObj",customer);
		return mav;
	}
}
 