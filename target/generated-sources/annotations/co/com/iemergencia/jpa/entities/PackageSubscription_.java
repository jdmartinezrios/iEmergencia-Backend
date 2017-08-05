package co.com.iemergencia.jpa.entities;

import co.com.iemergencia.jpa.entities.GetSubscription;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-31T14:35:28")
@StaticMetamodel(PackageSubscription.class)
public class PackageSubscription_ { 

    public static volatile SingularAttribute<PackageSubscription, String> monthsDuration;
    public static volatile SingularAttribute<PackageSubscription, Long> price;
    public static volatile ListAttribute<PackageSubscription, GetSubscription> getSubscriptionList;
    public static volatile SingularAttribute<PackageSubscription, String> name;
    public static volatile SingularAttribute<PackageSubscription, Integer> id;

}