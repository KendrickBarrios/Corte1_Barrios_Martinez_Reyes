package org.kkbp.interfaces;

import org.kkbp.models.Employee;

import java.util.ArrayList;

public interface Interface {
    // CRUD
    public void create(Object object);

    public ArrayList<Employee> read();

    public void update(Object object);

    public void delete(String id);

    public Object search(String value);
}
