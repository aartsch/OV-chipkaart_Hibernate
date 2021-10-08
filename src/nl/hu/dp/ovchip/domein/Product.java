package nl.hu.dp.ovchip.domein;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import java.util.List;

public class Product {
    @Id
    @Column(name = "product_nummer")
    private int productNummer;
    private String naam;
    private String beschrijving;
    private int prijs;
    @ManyToMany(mappedBy = "product")
    private List<OVChipkaart> ovChipkaarten;
}
