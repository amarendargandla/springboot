package testcases;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sprinng.app.Example;

import controller.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Example.class)
public class LoginTestCases {
	
	@Autowired UserController userController;
	
	@Test
	public void test(){
		String test = userController.test();
		Assert.assertNotNull(test);
	}
	
	@Test
	public void loginTest() {
		boolean login = userController.login();
		Assert.assertTrue(login);
	}
	
	@Test
	public void chagePwd() {
		boolean b = userController.changePassword();
		Assert.assertTrue(b);
	}
	
	@Test
	public void chageRole() {
		boolean b = userController.changeRole();
		Assert.assertTrue(b);
	}
	
}
