package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.Citie;
import co.com.iemergencia.jpa.sessions.CitieFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Juan David Martinez
 */
@Path("cities")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CitieREST {
    
    @EJB
    private CitieFacade citieEJB;
    
    @GET
    public List<Citie> findAll(){
        return citieEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public Citie findById(@PathParam("id") Integer id){        
        return citieEJB.find(id);
    }
    
    @POST
    public void Ciudad(Citie citie){
        citieEJB.create(citie);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Citie citie){
        citieEJB.edit(citie);
    }
    
    @GET
    @Path("find")
    public List<Citie> findByName(
            @QueryParam("name") String nameCitie,
            @QueryParam("idDepartaments") Integer idDepartament) {
        return citieEJB.findCitieByName(nameCitie, idDepartament);
    }
}
