package co.com.iemergencia.jpa.entities;

import co.com.iemergencia.jpa.entities.GetAdvertisement;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-31T14:35:28")
@StaticMetamodel(PackageAdvertisement.class)
public class PackageAdvertisement_ { 

    public static volatile SingularAttribute<PackageAdvertisement, String> monthsDuration;
    public static volatile SingularAttribute<PackageAdvertisement, Long> price;
    public static volatile SingularAttribute<PackageAdvertisement, String> name;
    public static volatile SingularAttribute<PackageAdvertisement, String> numberPublications;
    public static volatile SingularAttribute<PackageAdvertisement, Integer> id;
    public static volatile ListAttribute<PackageAdvertisement, GetAdvertisement> getAdvertisementList;

}