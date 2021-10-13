package nl.hu.dp.ovchip.domein;

import javax.persistence.*;

@Entity
public class Adres {
    @Id
    @Column(name = "adres_id")
    private int id;
    private String postcode;
    private int huisnummer;
    private String  straat;
    private String woonplaats;
    @OneToOne
    @JoinColumn( name = "reiziger_id")
    private Reiziger reiziger;
}
