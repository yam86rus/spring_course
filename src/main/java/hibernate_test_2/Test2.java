package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession(); // получаем сессию
//            Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850);
//            Detail detail = new Detail("New Your", "123", "nik@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction(); // начинаем транзакцию
//            session.save(detail);
//            session.getTransaction().commit(); // комитит транзакцию
//            System.out.println("Done");

//            session = factory.getCurrentSession(); // получаем сессию
//
//            session.beginTransaction(); // начинаем транзакцию
//            Detail detail = session.get(Detail.class,4);
//            System.out.println(detail.getEmployee());
//
//
//            session.getTransaction().commit(); // комитит транзакцию
//            System.out.println("Done");

            session = factory.getCurrentSession(); // получаем сессию

            session.beginTransaction(); // начинаем транзакцию
            Detail detail = session.get(Detail.class,1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);


            session.getTransaction().commit(); // комитит транзакцию
            System.out.println("Done");

        } finally {
            session.close();
            factory.close();
        }

    }
}
