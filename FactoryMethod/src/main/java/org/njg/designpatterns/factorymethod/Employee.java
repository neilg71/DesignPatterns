package org.njg.designpatterns.factorymethod;

public abstract class Employee {

    public static Employee getInstance(String type){
        Employee employee = null;
        System.out.println("type is:" + type);

        switch (type){
            case "Manager":
                employee = new Manager();
                break;
        }
        return employee;

    }

    public static Employee getInstanceFromClas(Class clazz){
        Employee employee = null;
        try {
            employee = (Employee) clazz.getDeclaredConstructor().newInstance();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return employee;

    }

}
