package org.kkbp.dao;

import org.kkbp.interfaces.Interface;
import org.kkbp.models.Commercial;
import org.kkbp.models.Employee;
import org.kkbp.models.Oficinist;

import java.util.ArrayList;
import java.util.Objects;

public class OficinistDAO implements Interface {
    private ArrayList<Oficinist> oficinistList = new ArrayList<>();
    @Override
    public void create(Object object) {
        try{
            Oficinist oficinist = (Oficinist)object;
            oficinistList.add(oficinist);
        } catch (Exception e) {
            System.out.printf("Error: %s",e.getMessage());
        }
    }

    @Override
    public ArrayList<Employee> read() {
        ArrayList<Employee> employeeList = (ArrayList<Employee>) oficinistList.clone();
        return employeeList;
    }

    @Override
    public void update(Object object) {
        try{
            Oficinist oficinist = (Oficinist) object;
            for (Oficinist of : oficinistList) {
                if (Objects.equals(of.getId(), oficinist.getId())) {
                    of.setNames(oficinist.getNames());
                    of.setLastNames(oficinist.getLastNames());
                    of.setAge(oficinist.getAge());
                    of.setBase_salary(oficinist.getBase_salary());
                    of.setCharge(oficinist.getCharge());
                    return;
                }

            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.getMessage());
        }
    }

    @Override
    public void delete(String id) {
        for(Oficinist oficinist: oficinistList){
            if(oficinist.getId().equals(id)){
                oficinistList.remove(oficinist);
                return;
            }
        }
    }

    @Override
    public Object search(String value) {
        return oficinistList.stream().
                filter(oficinist -> oficinist.getId().equals(value))
                .findFirst()
                .orElse(null);
    }
}
