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
    }

    @Override
    public boolean update(Reiziger reiziger) {
        sess.update(reiziger);
    }

    @Override
    public boolean delete(Reiziger reiziger) {
        sess.delete(reiziger);
        return true;
    }

    @Override
    public Reiziger findById(int id) {
        return null;
    }

    @Override
    public List<Reiziger> findByGbdatum(Date datum) {
        Reiziger reizigers = (Reiziger) sess.get(Reiziger.class, date);
        return (List<Reiziger>) reizigers;
    }

    @Override
    public List<Reiziger> findAll() {
        List<Reiziger> reizigers = (List<Reiziger>)  sess.createQuery("from Reiziger").list();
        return reizigers;
    }
}
