package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession(); // получаем сессию
//            Employee employee = new Employee("Oleg","Smirnov","IT",700);
//            Detail detail = new Detail("Moscow","5454","oleg@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction(); // начинаем транзакцию
//            session.save(employee);
//
//
//            session.getTransaction().commit(); // комитит транзакцию
//            System.out.println("Done");


//            session = factory.getCurrentSession(); // получаем сессию
//            session.beginTransaction(); // начинаем транзакцию
//            Employee emp = session.get(Employee.class, 10);
//            System.out.println(emp.getEmpDetail());
//
//            session.getTransaction().commit(); // комитит транзакцию
//            System.out.println("Done");

            session = factory.getCurrentSession(); // получаем сессию
            session.beginTransaction(); // начинаем транзакцию
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit(); // комитит транзакцию
            System.out.println("Done");

        } finally {
            session.close();
            factory.close();
        }

    }
}
