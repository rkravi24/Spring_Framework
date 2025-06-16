package in.springprogram.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.springprogram.beans.Student;
import in.springprogram.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = (Student) context.getBean("stdId");
		std.display();
	}

}
