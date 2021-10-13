package nl.hu.dp.ovchip.domein;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class OVChipkaart {
    @Id
    @Column(name = "kaart_nummer")
    private int kaartNummer;
    @Column(name = "geldig_tot")
    private Date geldigTot;
    private int klasse;
    private double saldo;
    @ManyToOne
    @JoinColumn(name = "reiziger_id")
    private Reiziger reiziger;
    @ManyToMany
    @JoinTable(
            name = "ov_chipkaart_product",
            joinColumns = { @JoinColumn (name = "kaart_nummer") },
            inverseJoinColumns = { @JoinColumn (name = "product_nummer") }
    )
    private List<Product> producten;
}
