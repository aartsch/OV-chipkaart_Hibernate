package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.Reiziger;

import java.sql.Date;
import java.util.List;

public interface ReizigerDAO {

    public void save(Reiziger reiziger);
    public void update(Reiziger reiziger);
    public void delete(Reiziger reiziger);
    public Reiziger findById(int id);
    public List<Reiziger> findByGbdatum(Date datum);
    public List<Reiziger> findAll();

}
