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
    public boolean save(Product product) {
        sess.save(product);
        if(sess.get(Product.class, product.getProductNummer()) == null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public boolean update(Product product) {
        sess.update(product);
        if(sess.get(Product.class, product.getProductNummer()) != product) {
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Product product) {
        sess.delete(product);
        if(sess.get(Product.class, product.getProductNummer()) == null) {
            return true;
        }
        else {
            return true;
        }
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
