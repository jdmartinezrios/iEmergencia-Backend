package co.com.iemergencia.jpa.entities;

import co.com.iemergencia.jpa.entities.Institution;
import co.com.iemergencia.jpa.entities.PackageAdvertisement;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-31T14:35:28")
@StaticMetamodel(GetAdvertisement.class)
public class GetAdvertisement_ { 

    public static volatile SingularAttribute<GetAdvertisement, Institution> institution;
    public static volatile SingularAttribute<GetAdvertisement, Date> dateStart;
    public static volatile SingularAttribute<GetAdvertisement, Integer> id;
    public static volatile SingularAttribute<GetAdvertisement, Date> dateEnd;
    public static volatile SingularAttribute<GetAdvertisement, PackageAdvertisement> packageAdvertisement;

}