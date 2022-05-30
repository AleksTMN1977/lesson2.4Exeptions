package pro.sky.jawa.course2.houmwork.lessonexeptions;


import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Иван", "Иванов"),
            new Employee("Петр", "Петров"),
            new Employee("Василий", "Васильев"),
            new Employee("Борис", "Борисов"),
            new Employee("Андрей", "Андреев")
    ));

    public Employee addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employees.add() = employee;
        return employee;
    }


    public Employee removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.size(); i++) {
            if (employee.equals(employees[i])) {
                employees[i] = null;
                return employee;

            }
        }
        throw new NotFoundEmployeeException();

    }

    public Employee findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < employees.length; i++) {
            if (employee.equals(employees[i])) {
                return employee;
            }
        }
        throw new NotFoundEmployeeException();
    }

}
