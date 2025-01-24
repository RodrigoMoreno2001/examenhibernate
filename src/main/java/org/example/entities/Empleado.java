package org.example.entities;

// Empleados (id_empleado, nombre, email, departamento)

import jakarta.persistence.*;

@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_empleado;

    private String nombre;

    private String email;
    private String departamento;

    public Empleado(){}

    public Empleado(Integer id_empleado, String departamento, String email, String nombre) {
        this.id_empleado = id_empleado;
        this.departamento = departamento;
        this.email = email;
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id_empleado=" + id_empleado +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}