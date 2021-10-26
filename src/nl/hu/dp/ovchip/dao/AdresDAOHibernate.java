package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.Adres;
import nl.hu.dp.ovchip.domein.OVChipkaart;
import nl.hu.dp.ovchip.domein.Reiziger;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class AdresDAOHibernate extends BaseDAOHibernate implements AdresDAO {
    public AdresDAOHibernate(Session sess) {
        super(sess);
    }

    @Override
    public boolean save(Adres adres) {
        sess.save(adres);
        if(sess.get(Adres.class, adres.getId()) == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean update(Adres adres) {
        sess.update(adres);
        if(sess.get(Adres.class,adres.getId()) != adres) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Adres adres) {
        sess.delete(adres);
        if(sess.get(Adres.class, adres.getId()) == null) {
            return true;
        }
        else {
            return true;
        }
    }

    @Override
    public Adres findByReiziger(Reiziger reiziger) {
        List<Adres> adres = (List<Adres>) sess.get(Reiziger.class, (Serializable) reiziger);
        return (Adres) adres;
    }

    @Override
    public List<Adres> findAll() {
        List<Adres> adressen = (List<Adres>)  sess.createQuery("from Adres").list();
        return adressen;
    }
}
