package test;

import employeejdbc.Employee;
import employeejdbc.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/applicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
        employeeDao.addEmployee(new Employee(3,"Rahul",25000));
        employeeDao.deleteEmployeeById(3);
        System.out.println(employeeDao.getAllEmployeesData());
    }
}
