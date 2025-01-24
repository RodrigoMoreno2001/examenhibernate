package org.example.app;

import org.example.DAO.EmpleadoDAO;
import org.example.entities.Empleado;

public class Main {
    public static void main(String[] args) {
        EmpleadoDAO empleadoDAO=new EmpleadoDAO();
        insertarEmpleados(empleadoDAO);
        listarEmpleados(empleadoDAO);
    }

    private static void listarEmpleados(EmpleadoDAO empleadoDAO) {
        for(Empleado aux:empleadoDAO.mostrarEmpleados()) System.out.println(aux);
    }

    private static void insertarEmpleados(EmpleadoDAO empleadoDAO){
        empleadoDAO.insertarEmpleado(new Empleado(null,"DEPTO1","rodrigo@gmail.com","rodrigo"));
        empleadoDAO.insertarEmpleado(new Empleado(null,"DEPTO2","nicolas@gmail.com","nicolas"));
        empleadoDAO.insertarEmpleado(new Empleado(null,"DEPTO3","antonio@gmail.com","antonio"));
    }
}