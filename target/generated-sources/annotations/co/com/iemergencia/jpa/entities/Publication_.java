package co.com.iemergencia.jpa.entities;

import co.com.iemergencia.jpa.entities.Institution;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-31T14:35:28")
@StaticMetamodel(Publication.class)
public class Publication_ { 

    public static volatile SingularAttribute<Publication, byte[]> image;
    public static volatile SingularAttribute<Publication, Institution> institution;
    public static volatile SingularAttribute<Publication, String> urlVideo;
    public static volatile SingularAttribute<Publication, Boolean> active;
    public static volatile SingularAttribute<Publication, Integer> id;

}