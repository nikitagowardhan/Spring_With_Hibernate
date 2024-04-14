package asteric.in.Day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import asteric.in.Day1.model.Employee;
import asteric.in.Day1.model.EmployeeDao;

@SpringBootApplication
public class SpringHiberDay001Application {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao ed= (EmployeeDao) context.getBean("d");
		
		Employee e = new Employee();
		e.setId(101);
		e.setName("Nikita");
		e.setSalary(100000);
		
		ed.saveEmp(e);
		System.out.println("Data inserted !");

		
		ed.updateEmp(e);

	}

}
