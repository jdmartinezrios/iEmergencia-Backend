package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.Publication;
import co.com.iemergencia.jpa.sessions.PublicationFacade;
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
@Path("publications")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PublicationREST {
    
    @EJB
    private PublicationFacade PublicationEJB;
    
    @GET
    public List<Publication> findAll(){
        return PublicationEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public Publication findById(@PathParam("id") Integer id){        
        return PublicationEJB.find(id);
    }
    
    @POST
    public void Ciudad(Publication Publication){
        PublicationEJB.create(Publication);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Publication Publication){
        PublicationEJB.edit(Publication);
    }
        
}
