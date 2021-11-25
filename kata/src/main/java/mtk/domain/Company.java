package mtk.domain;

import java.util.ArrayList;
import java.util.List;

public class Company
{
    private String name = "No name";

    private List<Employee> employees = new ArrayList<>();

    public Company(String newName)
    {
        this.setName(newName);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addEmployee(Employee newEmployee)
    {
        this.employees.add(newEmployee);
    }

    /**
     * Increase every employee's salary by the specified fraction
     * @param incrementAsFraction salary increase as a fraction of the original salary. e.g. if the value of the
     *                            parameter is 0.1, everyone at the company gets a 10% raise
     */
    public void everybodyGetsRaiseBy(double incrementAsFraction)
    {
        this.employees.forEach(e -> e.setSalary(e.getSalary() * incrementAsFraction));
    }

    /**
     * Finds an employee by their id
     * @param id the id of the employee to be found
     * @return the employee with the id passed as the parameter or null if no such employee exists
     */
    public Employee findEmployeeById(String id)
    {
        Integer foundIndex = null;
        for (int i = 0; i < this.employees.size(); i++)
        {
            if (this.employees.get(i).getId().equals(id))
            {
                foundIndex = i;
                break;
            }
        }
        return foundIndex == null ? null : this.employees.get(foundIndex);
    }

    public int numberOfEmployees()
    {
        return 7;
    }

    public Employee employeeWithLargestSalary()
    {
        Employee found = this.employees.get(0);

        for (Employee employee : employees) {
            if (employee.getSalary() > found.getSalary()) {
                found = employee;
            }
        }

        return found;
    }
}
