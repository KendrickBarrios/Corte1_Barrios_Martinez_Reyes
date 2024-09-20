package org.kkbp.models;

import org.kkbp.interfaces.Interface;

import java.util.ArrayList;
import java.util.Objects;

public class Oficinist extends Employee implements Interface {
    private String charge;
    public Oficinist(String id, String names, String lastNames, int edad, double base_salary, String charge) {
        super(id, names, lastNames, edad, base_salary);
        this.charge = charge;
        this.raiseSalary();
    }

    public void raiseSalary(){
        double base_salary = getBase_salary();
        if (Objects.equals(charge, "Manager")){
            setBase_salary(base_salary + INCENTIVE *0.20);
        }
        else{
            setBase_salary(base_salary + INCENTIVE * 0.80);
        }
    }
    public double calculateNetSalary(){
        double base_salary = getBase_salary();
        return base_salary + (base_salary * 0.93);
    }
    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    @Override
    public void add() {

    }

    @Override
    public void print() {

    }
}
