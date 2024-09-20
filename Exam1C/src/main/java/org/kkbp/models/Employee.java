package org.kkbp.models;

public class Employee {
    private String id;
    private String names;
    private String lastNames;
    private int age;
    private double base_salary;
    static int INCENTIVE = 300;


    public Employee(){

    }

    public Employee(String id, String names, String lastNames, int age, double base_salary) {

        this.id = id;
        this.names = names;
        this.lastNames = lastNames;
        this.age = age;
        this.base_salary = base_salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }
}
