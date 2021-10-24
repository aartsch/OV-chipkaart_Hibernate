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
    public void save(Adres adres) {
        sess.save(adres);
    }

    @Override
    public void update(Adres adres) {
        sess.update(adres);
    }

    @Override
    public void delete(Adres adres) {
        sess.delete(adres);
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
