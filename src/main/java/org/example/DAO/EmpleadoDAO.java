package org.example.DAO;

import org.example.entities.Empleado;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class EmpleadoDAO implements IEmpleadoDAO {
    @Override
    public void insertarEmpleado(Empleado empleado) {
        Transaction transaction=null;
        try(Session session = HibernateUtil.getSessionFactory().openSession();){

            transaction=session.beginTransaction();

            session.persist(empleado);

            transaction.commit();
        }catch(Exception e){
            if(transaction!=null){
                transaction.rollback();
            }
            e.printStackTrace();

        }
    }

    @Override
    public Set<Empleado> mostrarEmpleados() {

        Set<Empleado> empleados = null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()) {

            empleados = new HashSet<>(session.createQuery("from Empleado", Empleado.class).getResultList());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return empleados;
    }
}
