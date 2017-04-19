package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Ingredient implements Serializable {

   
    
    @Id
    @Column(name = "nom", length = 100, unique = true, updatable = true)
    private String nom;
    
    @Column(name = "description", length = 500, updatable = true, nullable = true)
    private String description;

    @ManyToOne
    private Statut statut;

    @ManyToMany
    private Collection<Produit> produits;
    
    
    
    public Ingredient() {
        this.produits = new ArrayList<>();
    }
    
    public Ingredient(String nom){
        super();
        this.nom = nom;
        
    }

    public Ingredient(String nom, String description) {
        super();
        this.nom = nom;
        this.description = description;
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   public void setSta(Statut s){
        this.statut = s;
    }
  
    public String getSta(){
        return this.statut.getIntitule();
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }
    
    

    @Override
    public String toString() {
        return "entites.Ingredient[ nom=" + nom + " ]";
    }

}
