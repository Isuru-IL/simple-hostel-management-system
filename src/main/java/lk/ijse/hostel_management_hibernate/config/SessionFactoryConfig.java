package lk.ijse.hostel_management_hibernate.config;

import lk.ijse.hostel_management_hibernate.entity.Reservation;
import lk.ijse.hostel_management_hibernate.entity.Room;
import lk.ijse.hostel_management_hibernate.entity.Student;
import lk.ijse.hostel_management_hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class SessionFactoryConfig {
    private static SessionFactoryConfig factoryConfig;
    private final SessionFactory sessionFactory;

    private SessionFactoryConfig(){
        Properties properties = new Properties();
        try {
            properties.load(SessionFactoryConfig.class.getResourceAsStream("/hibernate.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error encountered while loading the property file");
        }

        sessionFactory = new Configuration().setProperties(properties)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Room.class)
                .addAnnotatedClass(Reservation.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
    }
    public static SessionFactoryConfig getInstance(){
        return (null==factoryConfig) ? factoryConfig = new SessionFactoryConfig() : factoryConfig;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
