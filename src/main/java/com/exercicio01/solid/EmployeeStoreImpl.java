package com.exercicio01.solid;

public class EmployeeStoreImpl implements EmployeeStore {

    @Override
    public Employee getEmployeeById(Long id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("No name");

        return employee;
    }

    @Override
    public void addEmployee(Employee employee) {
        System.out.println("Adding Employee");
    }

}
