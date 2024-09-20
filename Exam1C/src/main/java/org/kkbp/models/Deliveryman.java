package org.kkbp.models;

public class Deliveryman extends Employee {
    private String zone;

    public Deliveryman(String id, String names, String lastNames, int edad, double base_salary, String zone) {
        super(id, names, lastNames, edad, base_salary);
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public boolean completeIncentive() {
        if (this.getEdad() < 25 && zone.equals("Ciudad Sandino")) {
            System.out.println("The deliveryman will get full incentive.");
            return true;
        }
        System.out.println("The deliveryman won't get full incentive.");
        return false;
    }

    // 10% of base salary is discounted
    public double getNeatSalary () {
        return this.getBase_salary() * 0.9;
    }
}
