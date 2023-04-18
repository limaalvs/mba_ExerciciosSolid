package com.exercicio01.solid;

public interface EmployeeStore {
    public Employee getEmployeeById(Long id);

    public void addEmployee(Employee employee);

}
