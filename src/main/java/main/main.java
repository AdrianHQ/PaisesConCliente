
package main;


import entidades.Cliente;
import entidades.Pais;
import static main.main.sessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class main {
 
      static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
    static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente (0, "Adrian", "Holguin", "Quimi",0);
        IngresarCliente(cliente);
        
        
        Pais pais = new Pais(0, "Ecuador");
        IngresarPais(pais);
        
        
    }
    
        static void IngresarCliente(Cliente cliente) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(cliente);
		
        session.getTransaction().commit();
        session.close();

    }
        static void IngresarPais(Pais pais) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(pais);
		
        session.getTransaction().commit();
        session.close();
        
    }
}
        
