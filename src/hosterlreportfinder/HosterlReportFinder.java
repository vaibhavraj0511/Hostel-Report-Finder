package hosterlreportfinder;

import static java.lang.System.out;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import HRF.dto.Admin;


public class HosterlReportFinder {

    public static void main(String...args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Admin ref = new Admin("vrs","vrs");
        session.save(ref);
        tx.commit();
        session.close();
        out.println("Register Successfully!!");
    }
    
}
