package co.com.iemergencia.jpa.entities;

import co.com.iemergencia.jpa.entities.Citie;
import co.com.iemergencia.jpa.entities.DocumentType;
import co.com.iemergencia.jpa.entities.Notification;
import co.com.iemergencia.jpa.entities.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-31T14:35:28")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> lastName;
    public static volatile SingularAttribute<Usuario, String> address;
    public static volatile ListAttribute<Usuario, Notification> notificationList;
    public static volatile SingularAttribute<Usuario, DocumentType> documentType;
    public static volatile SingularAttribute<Usuario, String> documentNumber;
    public static volatile SingularAttribute<Usuario, String> firtsName;
    public static volatile SingularAttribute<Usuario, Boolean> active;
    public static volatile SingularAttribute<Usuario, String> telephone;
    public static volatile SingularAttribute<Usuario, Citie> citie;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile ListAttribute<Usuario, Rol> rolesList;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, String> email;

}