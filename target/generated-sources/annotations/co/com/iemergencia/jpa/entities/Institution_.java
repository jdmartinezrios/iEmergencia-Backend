package co.com.iemergencia.jpa.entities;

import co.com.iemergencia.jpa.entities.GetAdvertisement;
import co.com.iemergencia.jpa.entities.GetSubscription;
import co.com.iemergencia.jpa.entities.InstitutionType;
import co.com.iemergencia.jpa.entities.Notification;
import co.com.iemergencia.jpa.entities.Publication;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-31T14:35:28")
@StaticMetamodel(Institution.class)
public class Institution_ { 

    public static volatile ListAttribute<Institution, Publication> publicationList;
    public static volatile SingularAttribute<Institution, String> password;
    public static volatile SingularAttribute<Institution, String> address;
    public static volatile ListAttribute<Institution, Notification> notificationList;
    public static volatile ListAttribute<Institution, GetSubscription> getSubscriptionList;
    public static volatile SingularAttribute<Institution, String> name;
    public static volatile SingularAttribute<Institution, String> nit;
    public static volatile SingularAttribute<Institution, String> telephone;
    public static volatile SingularAttribute<Institution, InstitutionType> institutionType;
    public static volatile SingularAttribute<Institution, Integer> id;
    public static volatile ListAttribute<Institution, GetAdvertisement> getAdvertisementList;

}