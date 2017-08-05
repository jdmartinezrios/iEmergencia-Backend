package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.Rol;
import co.com.iemergencia.jpa.sessions.RolFacade;
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
@Path("roles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RolREST {
    
    @EJB
    private RolFacade rolEJB;
    
    @GET
    public List<Rol> findAll(){
        return rolEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public Rol findById(@PathParam("id") Integer id){        
        return rolEJB.find(id);
    }
    
    @POST
    public void Ciudad(Rol rol){
        rolEJB.create(rol);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Rol rol){
        rolEJB.edit(rol);
    }
        
}
