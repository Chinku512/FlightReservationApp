package com.example.Flight.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Flight.Entity.User;
import com.example.Flight.Repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/showReg")
	public String showReg() {
		return "showReg";
	}
	@RequestMapping("/saveReg")
	public String showReg(@ModelAttribute("user")User user) {
		userRepo.save(user);
		return "login";
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("emailId") String emailId,@RequestParam("password")String password, ModelMap model) {
		User user = userRepo.findByEmail(emailId);
			if(user!=null) {
				if(user.getEmail().equals(emailId) && user.getPassword().equals(password)) {
					return "findFlight";
				}else {
					model.addAttribute("error", "Invalid Username/password");
					return "login";
				}
			}else {
				model.addAttribute("error", "Invalid Username/password");
				return "login";
			}
	}
}
