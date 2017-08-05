package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.Departament;
import co.com.iemergencia.jpa.sessions.DepartamentFacade;
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
@Path("departaments")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DepartamentREST {
    
    @EJB
    private DepartamentFacade departamentEJB;
    
    @GET
    public List<Departament> findAll(){
        return departamentEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public Departament findById(@PathParam("id") Integer id){        
        return departamentEJB.find(id);
    }
    
    @POST
    public void Ciudad(Departament departament){
        departamentEJB.create(departament);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Departament departament){
        departamentEJB.edit(departament);
    }
        
}


