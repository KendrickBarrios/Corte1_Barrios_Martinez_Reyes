package org.kkbp;

import org.kkbp.dao.CommercialDAO;
import org.kkbp.dao.DeliverymanDAO;
import org.kkbp.dao.OficinistDAO;
import org.kkbp.models.Commercial;
import org.kkbp.models.Deliveryman;
import org.kkbp.models.Employee;
import org.kkbp.models.Oficinist;

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

        //Use example of Commercial and CommerciaDAO classes
        Commercial commercial1 = new Commercial("402", "Miguel", "Centeno", 32, 8500, 1.2);
        Commercial commercial2 = new Commercial("333", "Hubert", "Palacios", 20, 6000, 3.4);
        Commercial commercial3 = new Commercial("567", "Orlando", "Noguera", 28, 7000, 7.9);

        CommercialDAO commercialDAO = new CommercialDAO();

        commercialDAO.create(commercial1);
        commercialDAO.create(commercial2);
        commercialDAO.create(commercial3);

        System.out.println("\nOrginal list of commercials");
        ArrayList<Employee> commercialList = commercialDAO.read();
        for (Employee employee : commercialList) {
            System.out.println(employee);
        }

        Commercial modifyCommercial3 = new Commercial("567", "Anibal", "Duarte", 34, 9000, 5.9);
        commercialDAO.update(modifyCommercial3);

        commercialDAO.delete("333");

        System.out.println("\nUpdated list of commercials");
        commercialList.clear();
        commercialList = commercialDAO.read();
        for (Employee employee : commercialList) {
            System.out.println(employee);
        }
        //Example using Oficinist and OficinistDAO
        Oficinist oficinist1 = new Oficinist("111","Johan Enrique","Reyes",18,
                9000,"Manager");
        Oficinist oficinist2 = new Oficinist("222","Pedro Jorge", "Sandoval", 45,
                15000,"Oficinist");
        Oficinist oficinist3 = new Oficinist("333","Jose Rodrigo", "Dinarte",24,
                5000,"Manager");

        OficinistDAO oficinistDAO = new OficinistDAO();
        oficinistDAO.create(oficinist1);
        oficinistDAO.create(oficinist2);
        oficinistDAO.create(oficinist3);
        System.out.println("\nOriginal list of oficinists: ");
        oficinistDAO.read().forEach(System.out::println);

        Oficinist modifiedOficinist1 = new Oficinist("111","Johan Enrique", "Reyes Rojas",
                21, 9500,"Manager");
        oficinistDAO.update(modifiedOficinist1);
        System.out.println("\nUpdated list of oficinists");
        oficinistDAO.read().forEach(System.out::println);
    }
}