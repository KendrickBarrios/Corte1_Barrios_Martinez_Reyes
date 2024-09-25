package org.kkbp.models;

public class Commercial extends Employee {

    private double commission;

    public Commercial(String id, String name, String lastNames, int age, double base_salary, double commision) {
        super(id, name, lastNames, age, base_salary);
        this.commission = commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void applyIncentive()  {
        if (super.getAge() > 30 && this.commission < 500) {
            double newSalary = super.getBase_salary() + (INCENTIVE * 0.5);
            super.setBase_salary(newSalary);
            System.out.println("The incentive has been applied. New Salary: " + newSalary);
        } else {
            System.out.println("Does not meet the requirements for the incentive.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", "+
                "commission=" + commission +
                '}';
    }
}
