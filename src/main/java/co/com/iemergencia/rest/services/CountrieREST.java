package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.Countrie;
import co.com.iemergencia.jpa.sessions.CountrieFacade;
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
@Path("countries")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CountrieREST {
    
    @EJB
    private CountrieFacade countrieEJB;
    
    @GET
    public List<Countrie> findAll(){
        return countrieEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public Countrie findById(@PathParam("id") Integer id){        
        return countrieEJB.find(id);
    }
    
    @POST
    public void Ciudad(Countrie countrie){
        countrieEJB.create(countrie);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Countrie countrie){
        countrieEJB.edit(countrie);
    }
        
}

