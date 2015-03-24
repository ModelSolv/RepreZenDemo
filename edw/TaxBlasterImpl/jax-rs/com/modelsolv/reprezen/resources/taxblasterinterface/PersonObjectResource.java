/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.modelsolv.reprezen.resources.taxblasterinterface;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.PersonObject;

@Path("people/{id}")
public interface PersonObjectResource {

    @GET
    @Produces("application/xml")
    PersonObject getPersonObject(@PathParam("id") long id);

    @PUT
    @Consumes("application/xml")
    @Produces("application/xml")
    PersonObject putPersonObject(@PathParam("id") long id, PersonObject personobject);

}