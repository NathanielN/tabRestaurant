package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class TableClient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int nbCouverts;
    @Column(nullable = false)
    private String code;
    @ManyToOne
    private Statut statut;
    
    @OneToMany(mappedBy = "tableClient")
    private Collection<Tablette> tablettes;

    @ManyToMany
    private Collection<Commande> commandes;
    
    public TableClient() {
        tablettes = new ArrayList<>();
        commandes = new ArrayList<>();
    }

    public TableClient(int nbCouverts, String code) {
        super();
        this.nbCouverts = nbCouverts;
        this.code = code;
        
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }


    public int getNbCouverts() {
        return nbCouverts;
    }

    public void setNbCouverts(int nbCouverts) {
        this.nbCouverts = nbCouverts;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Collection<Tablette> getTablettes() {
        return tablettes;
    }

    public void setTablettes(Collection<Tablette> tablettes) {
        this.tablettes = tablettes;
    }

    public Collection<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<Commande> commandes) {
        this.commandes = commandes;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    public String getSta() {
        String sta = this.getStatut().getIntitule();
        
        return sta;        
    }


    @Override
    public String toString() {
        return "entites.Table[ id=" + id + " ]";
    }
    
}
