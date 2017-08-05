package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.GetSubscription;
import co.com.iemergencia.jpa.sessions.GetSubscriptionFacade;
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
@Path("gets_subscriptions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GetSubscriptionREST {
    
    @EJB
    private GetSubscriptionFacade getSubscriptionEJB;
    
    @GET
    public List<GetSubscription> findAll(){
        return getSubscriptionEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public GetSubscription findById(@PathParam("id") Integer id){        
        return getSubscriptionEJB.find(id);
    }
    
    @POST
    public void Ciudad(GetSubscription getSubscription){
        getSubscriptionEJB.create(getSubscription);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, GetSubscription getSubscription){
        getSubscriptionEJB.edit(getSubscription);
    }
        
}
