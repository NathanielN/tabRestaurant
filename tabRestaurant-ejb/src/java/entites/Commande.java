
package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Commande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //@Column(name = "LigneCommande")
    @ManyToMany(mappedBy = "Commande")
    private Collection<LigneCommande> tabLC;
    
    @Column(nullable = false)
    @ManyToOne
    private Statut statut;
     
    @ManyToOne
    private Employe serveur;
    
    @Column(nullable = false)
    @ManyToMany(mappedBy = "Commande")
    private TableClient tableCmd;
    ////////////////////////    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateValidation;

    
    
    public Commande() {
        tabLC=new ArrayList();
    }

    public Commande(Date dateValidation) {
        super();
        this.dateValidation = dateValidation;
    }
    

    public Collection<LigneCommande> getTabLC() {
        return tabLC;
    }

    public void setTabLC(Collection<LigneCommande> tabLC) {
        this.tabLC = tabLC;
    }

    public TableClient getTableCmd() {
        return tableCmd;
    }

    public void setTableCmd(TableClient tableCmd) {
        this.tableCmd = tableCmd;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Employe getServeur() {
        return serveur;
    }

    public void setServeur(Employe serveur) {
        this.serveur = serveur;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setSta(Statut s){
        this.statut = s;
    }
  
    public String getSta(){
        return this.statut.getIntitule();
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Commande[ id=" + id + " ]";
    }
    
}
