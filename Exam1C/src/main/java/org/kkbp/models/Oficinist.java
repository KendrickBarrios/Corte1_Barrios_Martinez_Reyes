package org.kkbp.models;

public class Oficinist extends Employee {
    private String charge;

    public Oficinist(String id, String names, String lastNames, int age, double base_salary, String charge) {
        super(id, names, lastNames, age, base_salary);
        this.charge = charge;
        this.applyIncentiveByCharge();
    }

    public String getCharge(){
        return this.charge;
    }
    public void setCharge(String charge){
        this.charge = charge;
    }

    public void applyIncentiveByCharge(){
        double salary = this.getBase_salary();
        if(this.charge.equals("Manager")){
            System.out.printf("Oficinist %s is a Manager, salary will be raised by 20%%\n",getNames());
            setBase_salary(salary+(INCENTIVE*0.20));
            return;
        }
        setBase_salary(salary+(INCENTIVE *0.80));
    }
    public double getNeatSalary(){
        return this.getBase_salary() *0.9;
    }

    @Override
    public String toString(){
        return super.toString() + ", " +
                "charge='" + this.charge + '\'' +
                '}';
    }
}
