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


@Entity
public class Tva implements Serializable {
  
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "taux", unique = true, updatable = true)
    private float taux;
    
    
    
    

    public Long getId() {
        return id;
    }

 

    public Tva() {
      
    }
    
    public Tva(float taux) {
        this.taux = taux;
    }


    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    

    @Override
    public String toString() {
        return "entites.Tva[ id=" + id + " ]";
    }
    
}
