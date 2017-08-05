package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.GetAdvertisement;
import co.com.iemergencia.jpa.sessions.GetAdvertisementFacade;
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
@Path("gets_advertisements")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GetAdvertisementREST {
    
    @EJB
    private GetAdvertisementFacade getAdvertisementEJB;
    
    @GET
    public List<GetAdvertisement> findAll(){
        return getAdvertisementEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public GetAdvertisement findById(@PathParam("id") Integer id){        
        return getAdvertisementEJB.find(id);
    }
    
    @POST
    public void Ciudad(GetAdvertisement getAdvertisement){
        getAdvertisementEJB.create(getAdvertisement);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, GetAdvertisement getAdvertisement){
        getAdvertisementEJB.edit(getAdvertisement);
    }
        
}

