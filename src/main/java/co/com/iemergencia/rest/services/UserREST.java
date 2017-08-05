package co.com.iemergencia.rest.services;

import co.com.iemergencia.jpa.entities.Usuario;
import co.com.iemergencia.jpa.sessions.UsuarioFacade;
import co.com.iemergencia.rest.auth.DigestUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Juan David Martinez
 */
@Path("users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserREST {

    @EJB
    private UsuarioFacade userEJB;

    @GET
    //@RolesAllowed({"ADMIN"})
    public List<Usuario> findAll() {
        return userEJB.findAll();
    }

    @GET
    @Path("{id}")
    public Usuario findById(@PathParam("id") Integer id) {
        return userEJB.find(id);
    }

    @POST
    public Response create(Usuario usuario) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        try {
            if (userEJB.findUsuarioByDocumentNumber(usuario
                    .getDocumentNumber()) == null) {
                usuario.setPassword(DigestUtil.cifrarPassword(usuario.getPassword()));
                userEJB.create(usuario);
                return Response.status(Response.Status.CREATED)
                        .entity(gson.toJson("El usuario se registró correctamente"))
                        .build();
            } else {
                return Response.status(Response.Status.BAD_REQUEST)
                        .entity(gson.toJson("El Número de documento ya éxiste!."))
                        .build();
            }

        } catch (Exception e) {
            System.out.println("Err: " + e);
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(gson.toJson("Error al registrar el usuario!."))
                    .build();
        }

    }

    @PUT
    @Path("{id}")
    public Response edit(@PathParam("id") Integer id, Usuario usuario) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        try {
            usuario.setPassword(DigestUtil.cifrarPassword(usuario.getPassword()));
            userEJB.edit(usuario);
            return Response.status(Response.Status.CREATED)
                    .entity(gson.toJson("El usuario se actualizo correctamente"))
                    .build();

        } catch (Exception e) {
            System.out.println("Err: " + e);
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(gson.toJson("Error al actualizar el usuario!."))
                    .build();
        }
    }

}
