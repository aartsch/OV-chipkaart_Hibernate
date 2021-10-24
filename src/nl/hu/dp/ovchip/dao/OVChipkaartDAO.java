package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.OVChipkaart;
import nl.hu.dp.ovchip.domein.Reiziger;

import java.util.List;

public interface OVChipkaartDAO {
    public void save(OVChipkaart ovChipkaart);
    public void update(OVChipkaart ovChipkaart);
    public void delete(OVChipkaart ovChipkaart);
    public List<OVChipkaart> findByReiziger(Reiziger reiziger);
    public List<OVChipkaart> findAll();
}

