package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.OVChipkaart;
import nl.hu.dp.ovchip.domein.Product;
import nl.hu.dp.ovchip.domein.Reiziger;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class OVChipkaartDAOHibernate extends BaseDAOHibernate implements OVChipkaartDAO{
    public OVChipkaartDAOHibernate(Session sess) {
        super(sess);
    }

    @Override
    public boolean save(OVChipkaart ovChipkaart) {
        sess.save(ovChipkaart);
        if(sess.get(OVChipkaart.class, ovChipkaart.getKaartNummer()) == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean update(OVChipkaart ovChipkaart) {
        sess.update(ovChipkaart);
        if(sess.get(OVChipkaart.class, ovChipkaart.getKaartNummer()) != ovChipkaart) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(OVChipkaart ovChipkaart) {
        sess.delete(ovChipkaart);
        if(sess.get(OVChipkaart.class, ovChipkaart.getKaartNummer()) == null) {
            return true;
        }
        else {
            return true;
        }
    }

    @Override
    public List<OVChipkaart> findByReiziger(Reiziger reiziger) {
        List<OVChipkaart> ovChipkaarten = (List<OVChipkaart>) sess.get(Reiziger.class, (Serializable) reiziger);
        return ovChipkaarten;
    }

    @Override
    public List<OVChipkaart> findAll() {
        List<OVChipkaart> Ovchipkaarten = (List<OVChipkaart>)  sess.createQuery("from OVChipkaart").list();
        return Ovchipkaarten;
    }
}
