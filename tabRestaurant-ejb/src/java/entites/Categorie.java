package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
    @Id
    @Column(name = "nom",unique = true,length = 100,updatable = true)
    private String nom;
    
    @OneToMany
    private Collection<SousCategorie> sousCategories;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection<SousCategorie> getSousCategories() {
        return sousCategories;
    }

    public void setSousCategories(Collection<SousCategorie> sousCategories) {
        this.sousCategories = sousCategories;
    }

    public Categorie() {
        this.sousCategories = new ArrayList<>();
    }
    
    public Categorie(String nom){
        super();
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "entites.Categorie[ nom=" + nom + " ]";
    }
    
}
