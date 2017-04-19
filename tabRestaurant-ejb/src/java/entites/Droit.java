package entites;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Droit implements Serializable {
    
    @Id
    @Column(nullable = false)
    private String intitule;
    
    @ManyToOne
    private Code code;
    
    public Droit() {
    }

    public Droit(String intitule) {
        this.intitule = intitule;
        
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    
    
    
   

    @Override
    public String toString() {
        return "entites.Droit[ id=" + intitule+ " ]";
    }
    
}
