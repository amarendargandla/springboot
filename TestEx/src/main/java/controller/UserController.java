package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

	@RequestMapping("test")
	public String test() {
		return "test success";
	}
	
	@RequestMapping("changepwd")
	public boolean changePassword() {
		return true;
	}
	@RequestMapping("login")
	public boolean login() {
		return true;
	}
	
	@RequestMapping("changeRole")
	public boolean changeRole() {
		return true;
	}
}
