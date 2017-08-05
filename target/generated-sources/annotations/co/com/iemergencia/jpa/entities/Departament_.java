package co.com.iemergencia.jpa.entities;

import co.com.iemergencia.jpa.entities.Citie;
import co.com.iemergencia.jpa.entities.Countrie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-31T14:35:28")
@StaticMetamodel(Departament.class)
public class Departament_ { 

    public static volatile SingularAttribute<Departament, String> name;
    public static volatile SingularAttribute<Departament, Integer> id;
    public static volatile SingularAttribute<Departament, Countrie> countrie;
    public static volatile ListAttribute<Departament, Citie> citieList;

}