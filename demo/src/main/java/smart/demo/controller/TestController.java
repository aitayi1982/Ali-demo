package smart.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import smart.demo.dao.UserDAO;
import smart.demo.dao.UsrDAO;
import smart.demo.pojo.User;
import smart.demo.pojo.Usr;

@Controller
public class TestController {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private UsrDAO usrDAO;

	@RequestMapping("/hello")
	public String index(ModelMap model) {

		User user = userDAO.findUserById('1');
		System.out.println("------");
		System.out.println(user);
		System.out.println("------");

		model.addAttribute("name", "Test...." + user.getUsername());
		model.addAttribute("address", "Test...." + user.getAddress());
		// 设置视图名称
		return "hello";
	}

	@RequestMapping("/hello2")
	public String hello2(ModelMap model) {

		Usr usr = usrDAO.findUserById('1');
		System.out.println("------");
		System.out.println(usr);
		System.out.println(usr);
		System.out.println(usr.getAddress());
		System.out.println("------");

		model.addAttribute("name", "Test...." + usr.getUsername());
		model.addAttribute("address", "Test...." + usr.getAddress());
		// 设置视图名称
		return "hello2";
	}

	@RequestMapping("/newone")
	public String newone(ModelMap model) {

		Usr newusr = new Usr();
		newusr.setAddress("BeiJing");
		newusr.setBirthday(new Date());
		newusr.setSex("Femal");
		newusr.setUsername("Test03");
		usrDAO.insert(newusr);

		Usr usr = usrDAO.findUserById(1);
		System.out.println("------");
		System.out.println(usr);
		System.out.println("------");

		model.addAttribute("name", "Test...." + usr.getUsername());
		model.addAttribute("address", "Test...." + usr.getAddress());
		// 设置视图名称
		return "hello2";
	}
	@RequestMapping("/hello3")
	public String hello3(ModelMap model) {

		Usr usr = usrDAO.findUserById(3);
		System.out.println("------");
		System.out.println(usr);
		System.out.println(usr);
		System.out.println(usr.getAddress());
		System.out.println("------");

		model.addAttribute("name", "Test...." + usr.getUsername());
		model.addAttribute("address", "Test...." + usr.getAddress());
		// 设置视图名称
		return "hello2";
	}
	@RequestMapping("/hello4")
	public String hello4(ModelMap model) {

		Usr usr = usrDAO.findUserById(4);
		System.out.println("------");
		System.out.println(usr);
		System.out.println(usr);
		System.out.println(usr.getAddress());
		System.out.println("------");

		model.addAttribute("name", "Test...." + usr.getUsername());
		model.addAttribute("address", "Test...." + usr.getAddress());


		for (Usr usr2 : usrDAO.getAllusr()) {
			System.out.println(usr2.getUsername());
		}

		// 设置视图名称
		return "hello2";
	}
}
