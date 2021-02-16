package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction(); // сессия открывается
//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1500);
            session.createQuery("update Employee set salary=1000 where name='Sergey'").executeUpdate();
            session.getTransaction().commit(); // сессия зарывается коммитом

        } finally {
            factory.close();
        }

    }
}
