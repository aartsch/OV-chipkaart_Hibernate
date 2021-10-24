package nl.hu.dp.ovchip.dao;

import nl.hu.dp.ovchip.domein.OVChipkaart;
import nl.hu.dp.ovchip.domein.Product;
import nl.hu.dp.ovchip.domein.Reiziger;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public class ProductDAOHibernate extends BaseDAOHibernate implements ProductDAO {
    public ProductDAOHibernate(Session sess) {
        super(sess);
    }

    @Override
    public void save(Product product) {
        sess.save(product);
    }

    @Override
    public void update(Product product) {
        sess.update(product);
    }

    @Override
    public void delete(Product product) {
        sess.delete(product);
    }

    @Override
    public List<Product> findByOvchipkaart(OVChipkaart ovChipkaart) {
        Product producten = (Product) sess.get(Product.class, (Serializable) ovChipkaart);
        return (List<Product>) producten;
    }

    @Override
    public List<Product> findAll() {
        List<Product> producten = (List<Product>)  sess.createQuery("from Product").list();
        return producten;
    }
}
