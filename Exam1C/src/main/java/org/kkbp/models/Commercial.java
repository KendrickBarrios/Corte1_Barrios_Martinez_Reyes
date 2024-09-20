package org.kkbp.models;

public class Commercial extends Employee {
    private double commision;

    public Commercial(String id, String name, String lastNames, int age, double base_salary, double commision) {
        super(id, name, lastNames, age, base_salary);
        this.commision = commision;
    }

    public double getCommision() {
        return commision;
    }

    public void applyIncentive() {
        if (super.getAge() > 30 && this.commision < 500) {
            double newSalary = super.getBase_salary() + (INCENTIVE * 0.5);
            super.setBase_salary(newSalary);
            System.out.println("The incentive has been applied. New Salary: " + newSalary);
        } else {
            System.out.println("Does not meet the requirements for the incentive.");
        }
    }
}
