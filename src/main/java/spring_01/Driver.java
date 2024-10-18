package spring_01;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Student s = (Student) ac.getBean("myStudent");
		System.out.println(s.getName());
		Trainer t = (Trainer) s.getT();
		System.out.println(t.getName());
		System.out.println(s.getSubs());
		System.out.println(s.getSubMarks());
	}

}
