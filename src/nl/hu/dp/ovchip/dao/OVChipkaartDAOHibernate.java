package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.OVChipkaart;
import nl.hu.dp.ovchip.domein.Reiziger;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class OVChipkaartDAOHibernate extends BaseDAOHibernate implements OVChipkaartDAO{
    public OVChipkaartDAOHibernate(Session sess) {
        super(sess);
    }

    @Override
    public void save(OVChipkaart ovChipkaart) {
        sess.save(ovChipkaart);
    }

    @Override
    public void update(OVChipkaart ovChipkaart) {
        sess.update(ovChipkaart);
    }

    @Override
    public void delete(OVChipkaart ovChipkaart) {
        sess.delete(ovChipkaart);
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
