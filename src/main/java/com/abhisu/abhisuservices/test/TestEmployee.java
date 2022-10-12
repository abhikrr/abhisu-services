package com.abhisu.abhisuservices.test;


public class TestEmployee {
    private String name;
    private Integer salary;

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public TestEmployee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public TestEmployee() {
    }

    @Override
    public String toString() {
        return "TestEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
