
package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Type implements Serializable {
    
    @Id
    @Column(nullable = false)
    private String nom;
    
    private String description;
    
    @OneToMany(mappedBy = "Type")
    private Collection<Formule> formules;

    public Type() {
        formules=new ArrayList();
    }

    public Type(String nom, String description) {
        super();
        this.nom = nom;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Formule> getFormules() {
        return formules;
    }

    public void setFormules(Collection<Formule> formules) {
        this.formules = formules;
    }
    
    
  
    @Override
    public String toString() {
        return "entites.Type[ id=" + nom + " ]";
    }
    
}
