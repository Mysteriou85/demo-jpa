package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "elements_chimiques")
public class ElementChimique {

    @Id
    private long elId;

    @Column(name = "elNom", length = 20, nullable = false)
    private String elNom;

    @Column(name = "elSymbole", length = 20, nullable = false)
    private String elSymbole;

    @Column(name = "elNumAtomique")
    private int elNumAtomique;

    @Column(name = "elMasseAtomique")
    private double elMasseAtomique;

    // Constructor
    public ElementChimique() {

    }

    // Getter
    public long getElId() {
        return elId;
    }

    public String getElNom() {
        return elNom;
    }

    public String getElSymbole() {
        return elSymbole;
    }

    public int getElNumAtomique() {
        return elNumAtomique;
    }

    public double getElMasseAtomique() {
        return elMasseAtomique;
    }

    // Setter
    public void setElId(long elId) {
        this.elId = elId;
    }

    public void setElNom(String elNom) {
        this.elNom = elNom;
    }

    public void setElSymbole(String elSymbole) {
        this.elSymbole = elSymbole;
    }

    public void setElNumAtomique(int elNumAtomique) {
        this.elNumAtomique = elNumAtomique;
    }

    public void setElMasseAtomique(double elMasseAtomique) {
        this.elMasseAtomique = elMasseAtomique;
    }
}
