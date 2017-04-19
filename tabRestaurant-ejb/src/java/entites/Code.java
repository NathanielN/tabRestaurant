package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Code implements Serializable {
    
    @Id
    @Column(nullable = false)
    private String code;
        
    @OneToMany(mappedBy = "code") 
    private Collection<Droit> droits;
    @OneToOne
    private Employe employe;

    public Code() {
        droits = new ArrayList<>();
    }

    public Code(String code) {
        super();
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Collection<Droit> getDroits() {
        return droits;
    }

    public void setDroits(Collection<Droit> droits) {
        this.droits = droits;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    
    
    

  

    @Override
    public String toString() {
        return "entites.Code[ id=" + code + " ]";
    }
    
}
