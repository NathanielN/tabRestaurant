package entites;

import entites.LigneCommande;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-19T12:05:23")
@StaticMetamodel(LigneCommande.class)
public class LigneCommande_ { 

    public static volatile SingularAttribute<LigneCommande, LigneCommande> sousLigne;
    public static volatile SingularAttribute<LigneCommande, Long> id;
    public static volatile SingularAttribute<LigneCommande, Date> datePreparation;
    public static volatile SingularAttribute<LigneCommande, Float> prixLC;
    public static volatile SingularAttribute<LigneCommande, Float> tva;

}