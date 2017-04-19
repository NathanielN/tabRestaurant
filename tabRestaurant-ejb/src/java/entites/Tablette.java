
package entites;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Tablette implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numSerie;
    private String model;
    @ManyToOne
    private Statut statut;
    @ManyToOne
    private TableClient tableClient;

    public Tablette() {
    }


    public Tablette(String numSerie, String model) {
        this.numSerie = numSerie;
        this.model = model;
        
    }

    
    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public TableClient getTableClient() {
        return tableClient;
    }

    public void setTableClient(TableClient tableClient) {
        this.tableClient = tableClient;
    }

    



    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    public String getSta() {
        String sta = this.getStatut().getIntitule();
        return sta;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tablette)) {
            return false;
        }
        Tablette other = (Tablette) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entites.Tablette[ id=" + id + " ]";
    }
    
}
