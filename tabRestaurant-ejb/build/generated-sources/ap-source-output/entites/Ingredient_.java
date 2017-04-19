package entites;

import entites.Produit;
import entites.Statut;
import javax.annotation.Generated;
import javax.persistence.EntityManager;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-19T12:05:23")
@StaticMetamodel(Ingredient.class)
public class Ingredient_ { 

    public static volatile ListAttribute<Ingredient, Produit> produits;
    public static volatile SingularAttribute<Ingredient, EntityManager> em;
    public static volatile SingularAttribute<Ingredient, String> description;
    public static volatile SingularAttribute<Ingredient, String> nom;
    public static volatile SingularAttribute<Ingredient, Statut> statut;

}