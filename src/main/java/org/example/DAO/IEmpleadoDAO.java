package org.example.DAO;

import org.example.entities.Empleado;

import java.util.Set;

public interface IEmpleadoDAO {

    void insertarEmpleado(Empleado empleado);
    Set<Empleado> mostrarEmpleados();

}
