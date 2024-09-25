package org.kkbp.dao;

import org.kkbp.interfaces.Interface;
import org.kkbp.models.Commercial;
import org.kkbp.models.Deliveryman;
import org.kkbp.models.Employee;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CommercialDAO implements Interface {
    private ArrayList<Commercial> commercialList = new ArrayList<>();

    @Override
    public void create(Object object) {
        try {
            Commercial commercial = (Commercial) object;
            commercialList.add(commercial);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Employee> read() {
        ArrayList<Employee> employeeList = (ArrayList<Employee>) commercialList.clone();
        return employeeList;
    }

    @Override
    public void update(Object object) {
        try{
            Commercial commercial = (Commercial) object;
            for (Commercial cm : commercialList) {
                if (cm.getId() == commercial.getId()) {
                    cm.setNames(commercial.getNames());
                    cm.setLastNames(commercial.getLastNames());
                    cm.setAge(commercial.getAge());
                    cm.setBase_salary(commercial.getBase_salary());
                    cm.setCommission(commercial.getCommission());
                    return;
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    @Override
    public void delete(String id) {
        for (Commercial commercial : commercialList) {
            if (commercial.getId().equals(id)) {
                commercialList.remove(commercial);
                return;
            }
        }

    }

    @Override
    public Object search(String value) {
        for (Commercial commercial : commercialList) {
            if (commercial.getId().equals(value)) {
                return commercial;
            }
        }
        return null;
    }
}
