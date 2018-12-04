package HibernateBasic;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Model {
    public static void main(String[] args) {

        //Create typesafe ServiceRegistry object
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Student s1 = new Student();
        s1.setId(101);
        s1.setFirstName("Cameron");
        s1.setLastName("Milstead");

        session.save(s1);
        t.commit();
        System.out.println("Data committed successfully");
        factory.close();
        session.close();

    }
}