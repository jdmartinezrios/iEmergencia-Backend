package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.PackageAdvertisement;
import co.com.iemergencia.jpa.sessions.PackageAdvertisementFacade;
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
@Path("packages_advertisements")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PackageAdvertisementREST {
    
    @EJB
    private PackageAdvertisementFacade packageAdvertisementEJB;
    
    @GET
    public List<PackageAdvertisement> findAll(){
        return packageAdvertisementEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public PackageAdvertisement findById(@PathParam("id") Integer id){        
        return packageAdvertisementEJB.find(id);
    }
    
    @POST
    public void Ciudad(PackageAdvertisement packageAdvertisement){
        packageAdvertisementEJB.create(packageAdvertisement);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, PackageAdvertisement packageAdvertisement){
        packageAdvertisementEJB.edit(packageAdvertisement);
    }
        
}
