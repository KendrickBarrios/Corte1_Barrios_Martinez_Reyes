package org.kkbp.dao;

import org.kkbp.interfaces.Interface;
import org.kkbp.models.Deliveryman;
import org.kkbp.models.Employee;

import java.util.ArrayList;

public class DeliverymanDAO implements Interface {
    private ArrayList<Deliveryman> deliverymenList = new ArrayList<>();

    @Override
    public void create(Object object) {
        try {
            Deliveryman deliveryman = (Deliveryman) object;
            deliverymenList.add(deliveryman);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Employee> read() {
        ArrayList<Employee> employeeList = (ArrayList<Employee>) deliverymenList.clone();
        return employeeList;
    }

    @Override
    public void update(Object object) {
        try {
            Deliveryman newDeliveryman = (Deliveryman) object;
            for (Deliveryman deliveryman : deliverymenList) {
                if (deliveryman.getId() == newDeliveryman.getId()) {
                    deliveryman.setNames(newDeliveryman.getNames());
                    deliveryman.setLastNames(newDeliveryman.getLastNames());
                    deliveryman.setAge(newDeliveryman.getAge());
                    deliveryman.setBase_salary(newDeliveryman.getBase_salary());
                    deliveryman.setZone(newDeliveryman.getZone());
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void delete(String id) {
        for (Deliveryman deliveryman : deliverymenList) {
            if (deliveryman.getId().equals(id)) {
                deliverymenList.remove(deliveryman);
                return;
            }
        }
    }

    @Override
    public Object search(String value) {
        for (Deliveryman deliveryman : deliverymenList) {
            if (deliveryman.getId().equals(value)) {
                return deliveryman;
            }
        }
        return null;
    }
}
