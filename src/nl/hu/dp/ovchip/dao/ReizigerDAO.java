package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.Reiziger;

import java.sql.Date;
import java.util.List;

public interface ReizigerDAO {

    public boolean save(Reiziger reiziger);
    public boolean update(Reiziger reiziger);
    public boolean delete(Reiziger reiziger);
    public Reiziger findById(int id);
    public List<Reiziger> findByGbdatum(Date datum);
    public List<Reiziger> findAll();

}
