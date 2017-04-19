
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


@Entity
public class Option implements Serializable {
   
    @Id    
    @Column(nullable = false)
    private String nom;
    
    
    @ManyToMany(mappedBy = "Option")
    private Collection<CaracteristiqueOption> lCaracOption;
    ////////////


    public Option() {
        lCaracOption=new ArrayList();
    }

    public Option(String nom) {
        super();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    

    public Collection<CaracteristiqueOption> getlCaracOption() {
        return lCaracOption;
    }

    public void setlCaracOption(Collection<CaracteristiqueOption> lCaracOption) {
        this.lCaracOption = lCaracOption;
    }
    
    

   

    @Override
    public String toString() {
        return "entites.Option[ id=" + nom + " ]";
    }
    
}
