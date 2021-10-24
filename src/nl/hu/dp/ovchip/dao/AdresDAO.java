package nl.hu.dp.ovchip.dao;


import nl.hu.dp.ovchip.domein.Adres;
import nl.hu.dp.ovchip.domein.Reiziger;

import java.util.List;

public interface AdresDAO {
    void save(Adres adres);
    void update(Adres adres);
    void delete(Adres adres);
    Adres findByReiziger(Reiziger reiziger);
    List<Adres> findAll();

}