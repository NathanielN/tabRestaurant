
package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class SousCategorie implements Serializable {
    
    @Id
    @Column(nullable = false, length = 100, unique = true, updatable = true)
    private String nom;

    @OneToMany(mappedBy = "SousCategorie")
    private Collection<Produit> produits;
    
    @ManyToOne
    private Categorie categorie;
   
    @ManyToMany(mappedBy = "SousCategorie")
    private Collection<CaracteristiqueOption> caracteristiqueOptions;

    public SousCategorie() {
        this.caracteristiqueOptions = new ArrayList<>();
        this.produits = new ArrayList<>();
    }

    public SousCategorie(String nom) {
        super();
        this.nom = nom;
    }
    
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Collection<CaracteristiqueOption> getCaracteristiqueOptions() {
        return caracteristiqueOptions;
    }

    public void setCaracteristiqueOptions(Collection<CaracteristiqueOption> caracteristiqueOptions) {
        this.caracteristiqueOptions = caracteristiqueOptions;
    }
    
    
    
    @Override
    public String toString() {
        return "entites.SousCategorie[ nom=" + nom + " ]";
    }
    
}
