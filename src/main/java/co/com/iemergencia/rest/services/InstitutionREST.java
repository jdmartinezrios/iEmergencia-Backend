package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.Institution;
import co.com.iemergencia.jpa.sessions.InstitutionFacade;
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
@Path("institutions")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InstitutionREST {
    
    @EJB
    private InstitutionFacade institutionEJB;
    
    @GET
    public List<Institution> findAll(){
        return institutionEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public Institution findById(@PathParam("id") Integer id){        
        return institutionEJB.find(id);
    }
    
    @POST
    public void Ciudad(Institution institution){
        institutionEJB.create(institution);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Institution institution){
        institutionEJB.edit(institution);
    }
        
}



