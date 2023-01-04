package com.peaksoft;
import com.peaksoft.entity.Employee;
import com.peaksoft.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {Employee employee = new Employee();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        Employee employee6 = new Employee();
        Employee employee7 = new Employee();
        Employee employee8 = new Employee();
        Employee employee9 = new Employee();
        employee.setFirstName("Izat");
        employee.setLastName("Kydyrmyshev");
        employee.setAge(28);
        employee1.setFirstName("Azamat");
        employee1.setLastName("Muratbekov");
        employee1.setAge(27);
        creat(employee1);
        employee2.setFirstName("Kurmanbek");
        employee2.setLastName("Mambetomurov");
        employee2.setAge(30);
        creat(employee2);
        employee3.setFirstName("Aidai");
        employee3.setLastName("Mamatbekova");
        employee3.setAge(28);
        creat(employee3);
        employee4.setFirstName("Bekbol");
        employee4.setLastName("Jalilov");
        employee4.setAge(24);
        creat(employee4);
        employee5.setFirstName("Syimyk");
        employee5.setLastName("Jekowenov");
        employee5.setAge(20);
        creat(employee5);
        employee6.setFirstName("Anara");
        employee6.setLastName("Almazova");
        employee6.setAge(21);
        creat(employee6);
        employee7.setFirstName("ALbert");
        employee7.setLastName("Akiev");
        employee7.setAge(23);
        creat(employee7);
        employee8.setFirstName("Ibrahim");
        employee8.setLastName("Kalmamatov");
        employee8.setAge(26);
        creat(employee8);
        employee9.setFirstName("Dilnaz");
        employee9.setLastName("Tolubaikyzy");
        employee9.setAge(20);
        creat(employee9);
    }
    public static Long creat (Employee e){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();
        session.close();
        return e.getId();
    }
}
