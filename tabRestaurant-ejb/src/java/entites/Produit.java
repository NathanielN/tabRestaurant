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
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    
   
    
    @Id
    @Column(nullable = false,name = "nom", updatable = true, length = 100)
    private String nom;
    @Column(nullable = true, name = "description",length = 500)
    private String description;
    @Column(nullable = true, updatable = true)
    private float prix;
    
    @ManyToOne
    private Statut statut;
    
    @ManyToMany
    private Collection<Produit> produits;
    
    @ManyToOne
    private Tva tva;
    
    @ManyToMany(mappedBy = "Produit")
    private Collection<Ingredient> ingredients;
    
    @ManyToOne
    private SousCategorie sousCategories;
    
    @OneToMany
    private Collection<LigneCommande> ligneCommandes;

    public Produit() {
        this.ingredients = new ArrayList<>();
        this.ligneCommandes = new ArrayList<>();
        this.produits = new ArrayList<>();
    }
    
    public Produit(String nom){
        super();
        this.nom = nom;
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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Collection<Produit> getProduit() {
        return produits;
    }

    public void setProduit(Collection<Produit> produit) {
        this.produits = produit;
    }

    public Tva getTva() {
        return tva;
    }

    public void setTva(Tva tva) {
        this.tva = tva;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public SousCategorie getSousCategories() {
        return sousCategories;
    }

    public void setSousCategories(SousCategorie sousCategories) {
        this.sousCategories = sousCategories;
    }

    public Collection<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(Collection<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }
    

    public void setSta(Statut s){
        this.statut = s;
    }
  
    public String getSta(){
        return this.statut.getIntitule();
    }
    
    @Override
    public String toString() {
        return "entites.Produit[ nom=" + nom + " ]";
    }

   
    
}
