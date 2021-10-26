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
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn( name = "reiziger_id")
    private Reiziger reiziger;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public Reiziger getReiziger() {
        return reiziger;
    }

    public void setReiziger(Reiziger reiziger) {
        this.reiziger = reiziger;
    }
}
