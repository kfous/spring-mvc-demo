package src.com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
		
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model){

		//read the request parameter from the html form
		String theName = request.getParameter("studentName");

		// convert the data to all capitals
		theName = theName.toUpperCase();

		// create the message
		String result ="YO! " + theName;

		// add message to model
		model.addAttribute("message",result);

		return "helloworld";
	}
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, Model model){


		// convert the data to all capitals
		theName = theName.toUpperCase();

		// create the message
		String result ="Hey My Friend " + theName;

		// add message to model
		model.addAttribute("message",result);

		return "helloworld";
	}


}






