package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.OVChipkaart;
import nl.hu.dp.ovchip.domein.Reiziger;
import org.hibernate.Session;

import java.util.List;

public class OVChipkaartDAOHibernate extends BaseDAOHibernate implements OVChipkaartDAO{
    public OVChipkaartDAOHibernate(Session sess) {
        super(sess);
    }

    @Override
    public boolean save(OVChipkaart ovChipkaart) {
        sess.save(ovChipkaart);
        return true;
    }

    @Override
    public boolean update(OVChipkaart ovChipkaart) {
        sess.update(ovChipkaart);
        return true;
    }

    @Override
    public boolean delete(OVChipkaart ovChipkaart) {
        sess.delete(ovChipkaart);
        return true;
    }

    @Override
    public List<OVChipkaart> findByReiziger(Reiziger reiziger) {
        return null;
    }

    @Override
    public List<OVChipkaart> findAll() {
        List<OVChipkaart> Ovchipkaarten = (List<OVChipkaart>)  sess.createQuery("from OVChipkaart").list();
        return Ovchipkaarten;
    }
}
