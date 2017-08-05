package co.com.iemergencia.jpa.entities;

import co.com.iemergencia.jpa.entities.Institution;
import co.com.iemergencia.jpa.entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-31T14:35:28")
@StaticMetamodel(Notification.class)
public class Notification_ { 

    public static volatile SingularAttribute<Notification, Institution> institution;
    public static volatile SingularAttribute<Notification, Date> dateHour;
    public static volatile SingularAttribute<Notification, byte[]> photo;
    public static volatile SingularAttribute<Notification, Integer> id;
    public static volatile SingularAttribute<Notification, Usuario> user;

}