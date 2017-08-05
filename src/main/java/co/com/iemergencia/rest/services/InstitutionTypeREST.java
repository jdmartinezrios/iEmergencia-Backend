package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.InstitutionType;
import co.com.iemergencia.jpa.sessions.InstitutionTypeFacade;
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
@Path("institutions_types")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InstitutionTypeREST {
    
    @EJB
    private InstitutionTypeFacade institutionTypeEJB;
    
    @GET
    public List<InstitutionType> findAll(){
        return institutionTypeEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public InstitutionType findById(@PathParam("id") Integer id){        
        return institutionTypeEJB.find(id);
    }
    
    @POST
    public void Ciudad(InstitutionType institutionType){
        institutionTypeEJB.create(institutionType);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, InstitutionType institutionType){
        institutionTypeEJB.edit(institutionType);
    }
        
}

