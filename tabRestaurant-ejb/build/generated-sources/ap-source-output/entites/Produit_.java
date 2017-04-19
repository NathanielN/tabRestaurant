package entites;

import entites.Ingredient;
import entites.Produit;
import entites.Statut;
import entites.Tva;
import javax.annotation.Generated;
import javax.persistence.EntityManager;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-19T12:05:23")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile ListAttribute<Produit, Produit> produit;
    public static volatile SingularAttribute<Produit, Float> prix;
    public static volatile SingularAttribute<Produit, EntityManager> em;
    public static volatile SingularAttribute<Produit, String> description;
    public static volatile ListAttribute<Produit, Ingredient> ingredients;
    public static volatile SingularAttribute<Produit, String> nom;
    public static volatile SingularAttribute<Produit, Statut> statut;
    public static volatile SingularAttribute<Produit, Tva> tva;

}