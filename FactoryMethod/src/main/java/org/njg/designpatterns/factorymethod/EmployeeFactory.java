package org.njg.designpatterns.factorymethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class EmployeeFactory {
    private List<String> types = new ArrayList<>();

    private EmployeeFactory(){
        types.add(Manager.class.getSimpleName());
    }

    public static EmployeeFactory getInstance(){
        return new EmployeeFactory();
    }


}
