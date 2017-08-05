package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.DocumentType;
import co.com.iemergencia.jpa.sessions.DocumentTypeFacade;
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
@Path("documents_types")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DocumentTypeREST {
    
    @EJB
    private DocumentTypeFacade documentTypeEJB;
    
    @GET
    public List<DocumentType> findAll(){
        return documentTypeEJB.findAll();        
    }
    
    @GET 
    @Path("{id}")
    public DocumentType findById(@PathParam("id") Integer id){        
        return documentTypeEJB.find(id);
    }
    
    @POST
    public void Ciudad(DocumentType documentType){
        documentTypeEJB.create(documentType);
    }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, DocumentType documentType){
        documentTypeEJB.edit(documentType);
    }
        
}

