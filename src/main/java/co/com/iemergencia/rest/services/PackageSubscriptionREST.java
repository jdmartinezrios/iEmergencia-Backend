package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.PackageSubscription;
import co.com.iemergencia.jpa.sessions.PackageSubscriptionFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Juan David Martinez
 */
@Path("packages_subscriptions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PackageSubscriptionREST {
    
    @EJB
    private PackageSubscriptionFacade PackageSubscriptionEJB;
    
    @GET
    public List<PackageSubscription> findAll(){
        return PackageSubscriptionEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public PackageSubscription findById(@PathParam("id") Integer id){        
        return PackageSubscriptionEJB.find(id);
    }
    
    @POST
    public void Ciudad(PackageSubscription PackageSubscription){
        PackageSubscriptionEJB.create(PackageSubscription);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, PackageSubscription PackageSubscription){
        PackageSubscriptionEJB.edit(PackageSubscription);
    }
        
}
