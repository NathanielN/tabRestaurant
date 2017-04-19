
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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class LigneCommande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Produit produit;
    
    @Column(nullable = false)
    @ManyToOne
    private Commande Cmd;
    
    @ManyToMany(mappedBy = "LigneCommande")
    private Collection<CaracteristiqueOption> caracOption;
    
    @ManyToMany//reflexive
    private Collection<LigneCommande> sousLigne;
    
    
    @ManyToOne
    private Statut statut;
    ////////////////////////
    @Column(nullable = false)
    private Float prixLC;
    private Float tva;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePreparation;
    

    public LigneCommande() {
        caracOption=new ArrayList();
        sousLigne=new ArrayList();
    }

    public LigneCommande(Float prixLC, Float tva, Date datePreparation) {
        super();
        this.prixLC = prixLC;
        this.tva = tva;
        this.datePreparation = datePreparation;
    }



    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCmd() {
        return Cmd;
    }

    public void setCmd(Commande Cmd) {
        this.Cmd = Cmd;
    }

    public Collection<CaracteristiqueOption> getCaracOption() {
        return caracOption;
    }

    public void setCaracOption(Collection<CaracteristiqueOption> caracOption) {
        this.caracOption = caracOption;
    }



    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public LigneCommande(Statut statut) {
        this.statut = statut;
    }

    public Float getPrixLC() {
        return prixLC;
    }

    public void setPrixLC(Float prixLC) {
        this.prixLC = prixLC;
    }

    public Float getTva() {
        return tva;
    }

    public void setTva(Float tva) {
        this.tva = tva;
    }

    public Date getDatePreparation() {
        return datePreparation;
    }

    public void setDatePreparation(Date datePreparation) {
        this.datePreparation = datePreparation;
    }

    public Collection<LigneCommande> getSousLigne() {
        return sousLigne;
    }

    public void setSousLigne(Collection<LigneCommande> sousLigne) {
        this.sousLigne = sousLigne;
    }

   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LigneCommande{" + "id=" + id + '}';
    }
   
}
