package co.com.iemergencia.jpa.entities;

import co.com.iemergencia.jpa.entities.Departament;
import co.com.iemergencia.jpa.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-31T14:35:28")
@StaticMetamodel(Citie.class)
public class Citie_ { 

    public static volatile SingularAttribute<Citie, Integer> code;
    public static volatile ListAttribute<Citie, Usuario> userList;
    public static volatile SingularAttribute<Citie, String> name;
    public static volatile SingularAttribute<Citie, Integer> id;
    public static volatile SingularAttribute<Citie, Departament> departament;

}