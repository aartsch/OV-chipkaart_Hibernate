package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.Adres;
import nl.hu.dp.ovchip.domein.Reiziger;
import org.hibernate.Session;

import java.util.List;

public class AdresDAOHibernate extends BaseDAOHibernate implements AdresDAO {
    public AdresDAOHibernate(Session sess) {
        super(sess);
    }

    @Override
    public boolean save(Adres adres) {
        sess.save(adres);
        return true;
    }

    @Override
    public boolean update(Adres adres) {
        sess.update(adres);
        return true;
    }

    @Override
    public boolean delete(Adres adres) {
        sess.delete(adres);
        return true;
    }

    @Override
    public Adres findByReiziger(Reiziger reiziger) {
        Adres adres = (Adres) sess.get(reiziger.class, id);
        return adres;
    }

    @Override
    public List<Adres> findAll() {
        List<Adres> adressen = (List<Adres>)  sess.createQuery("from Adres").list();
        return adressen;
    }
}
