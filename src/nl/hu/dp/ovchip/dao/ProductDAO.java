package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.OVChipkaart;
import nl.hu.dp.ovchip.domein.Product;

import java.util.List;

public interface ProductDAO {
    public boolean save(Product product);

    public boolean update(Product product);

    public boolean delete(Product product);

    public List<Product> findByOvchipkaart(OVChipkaart ovChipkaart);

    public List<Product> findAll();
}
