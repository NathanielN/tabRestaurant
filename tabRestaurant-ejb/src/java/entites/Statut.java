package entites;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Statut implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String Intitule;
   /* @OneToMany
    private Produit produit;
    @OneToMany
    private Formule formule;
    @OneToMany
    private Employe employe;
    @OneToMany
    private LigneCommande ligneCommande;
    @OneToMany
    private Commande commande;
    @OneToMany
    private TableClient tableClient;
    @OneToMany
    private Tablette tablette;*/

    public Statut() {
    }

    public Statut(String Intitule) {
        this.Intitule = Intitule;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return Intitule;
    }

    public void setIntitule(String Intitule) {
        this.Intitule = Intitule;
    }

    
   

    @Override
    public String toString() {
        return "entites.Statut[ id=" + id + " ]";
    }
    

}
