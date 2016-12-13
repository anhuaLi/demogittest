package cqupt.lah.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cqupt.lah.dao.UserDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserDao user = (UserDao) ac.getBean("userDao");
		System.out.println(user.selectUser().size());
	}

}
