package co.com.iemergencia.rest.services;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;

/**
 *
 * @author Juan David Martinez
 */
@ApplicationPath("api")
public class AppConfig extends ResourceConfig {
  
    public AppConfig(){
         packages("co.com.iemergencia.rest.services,co.com.iemergencia.rest.auth");
         //register(RolesAllowedDynamicFeature.class);
    }
}
