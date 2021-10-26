package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.Adres;
import nl.hu.dp.ovchip.domein.Reiziger;
import org.hibernate.Session;

import java.sql.Date;
import java.util.List;

public class ReizigerDAOHibernate extends BaseDAOHibernate implements ReizigerDAO {
    public ReizigerDAOHibernate(Session sess) {
        super(sess);
    }

    @Override
    public boolean save(Reiziger reiziger) {
        sess.save(reiziger);
        if(sess.get(Reiziger.class, reiziger.getId()) == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean update(Reiziger reiziger) {
        sess.update(reiziger);
        if(sess.get(Reiziger.class, reiziger.getId()) != reiziger) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Reiziger reiziger) {
        sess.delete(reiziger);
        if(sess.get(Reiziger.class, reiziger.getId()) == null) {
            return true;
        }
        else {
            return true;
        }
    }

    @Override
    public Reiziger findById(int id) {
        Reiziger reiziger = sess.get(Reiziger.class, id);
        return reiziger;
    }

    @Override
    public List<Reiziger> findByGbdatum(Date datum) {
        Reiziger reizigers = (Reiziger) sess.get(Reiziger.class, datum);
        return (List<Reiziger>) reizigers;
    }

    @Override
    public List<Reiziger> findAll() {
        List<Reiziger> reizigers = (List<Reiziger>)  sess.createQuery("from Reiziger").list();
        return reizigers;
    }
}
