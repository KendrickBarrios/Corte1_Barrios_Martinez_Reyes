package org.kkbp;

import org.kkbp.dao.DeliverymanDAO;
import org.kkbp.models.Deliveryman;
import org.kkbp.models.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Deliveryman and DeliverymanDAO use example
        Deliveryman deliveryman1 = new Deliveryman("001", "Luis", "Parrales", 25, 9500, "Ciudad Sandino");
        Deliveryman deliveryman2 = new Deliveryman("002", "Ronny", "Valles", 29, 8250, "Ticuantepe");
        Deliveryman deliveryman3 = new Deliveryman("003", "Jorge", "Balladares", 31, 10500, "Tipitapa");

        DeliverymanDAO deliverymanRegister = new DeliverymanDAO();

        // use of DAO Interface methods
        deliverymanRegister.create(deliveryman1);
        deliverymanRegister.create(deliveryman2);
        deliverymanRegister.create(deliveryman3);

        System.out.println("Original list of deliverymen");
        ArrayList<Employee> deliverymenList = deliverymanRegister.read();
        for (Employee employee : deliverymenList) {
            System.out.println(employee);
        }

        Deliveryman updatedDeliveryman2 = new Deliveryman("002", "Fernando", "Carballo", 24, 10000, "Nindiri");
        deliverymanRegister.update(updatedDeliveryman2);

        deliverymanRegister.delete("001");

        // modified list after deleting deliveryman1 and updating deliveryman2
        System.out.println("\nUpdated list of deliverymen");
        deliverymenList.clear();
        deliverymenList = deliverymanRegister.read();
        for (Employee employee : deliverymenList) {
            System.out.println(employee);
        }
    }
}