package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.Notification;
import co.com.iemergencia.jpa.sessions.NotificationFacade;
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
@Path("notifications")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class NotificationREST {
    
    @EJB
    private NotificationFacade notificationEJB;
    
    @GET
    public List<Notification> findAll(){
        return notificationEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public Notification findById(@PathParam("id") Integer id){        
        return notificationEJB.find(id);
    }
    
    @POST
    public void Ciudad(Notification notification){
        notificationEJB.create(notification);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Notification notification){
        notificationEJB.edit(notification);
    }
        
}

