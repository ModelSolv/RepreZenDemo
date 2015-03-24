/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.modelsolv.reprezen.resources.taxblasterinterface;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.PersonCollection;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.PersonObject;

@Path("people")
public interface PersonCollectionResource {

    @GET
    @Produces("application/xml")
    PersonCollection getPersonCollection();

    @POST
    @Consumes("application/xml")
    @Produces("application/xml")
    PersonObject postPersonCollection(PersonObject personobject);

}