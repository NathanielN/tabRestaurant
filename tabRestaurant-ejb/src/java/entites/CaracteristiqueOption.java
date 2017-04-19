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
public class CaracteristiqueOption implements Serializable {
    @Id
    @Column(nullable = false)
    private String nom;
    
    @ManyToMany(mappedBy = "Option")
    private Collection<Option> lOption; 
    //////////////
    
    
    


    public CaracteristiqueOption() {
        lOption=new ArrayList();
    }

    public CaracteristiqueOption(String nom) {
        super();
        this.nom = nom;
       
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Collection<Option> getlOption() {
        return lOption;
    }

    public void setlOption(Collection<Option> lOption) {
        this.lOption = lOption;
    }
    
    
   


    @Override
    public String toString() {
        return "carac :"+nom;
    }
    
}
