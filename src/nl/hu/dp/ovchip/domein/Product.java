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

    public int getProductNummer() {
        return productNummer;
    }

    public void setProductNummer(int productNummer) {
        this.productNummer = productNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public List<OVChipkaart> getOvChipkaarten() {
        return ovChipkaarten;
    }

    public void setOvChipkaarten(List<OVChipkaart> ovChipkaarten) {
        this.ovChipkaarten = ovChipkaarten;
    }
}
