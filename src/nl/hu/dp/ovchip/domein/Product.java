package nl.hu.dp.ovchip.domein;

import javax.persistence.*;
import java.util.List;

@Entity
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
