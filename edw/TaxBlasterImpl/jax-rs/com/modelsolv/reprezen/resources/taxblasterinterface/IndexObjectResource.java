/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.modelsolv.reprezen.resources.taxblasterinterface;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.IndexObject;

@Path("index")
public interface IndexObjectResource {

    @GET
    @Produces("application/xml")
    IndexObject getIndexObject();

}