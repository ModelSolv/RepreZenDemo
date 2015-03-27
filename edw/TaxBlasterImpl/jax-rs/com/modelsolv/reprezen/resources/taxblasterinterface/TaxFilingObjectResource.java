/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.modelsolv.reprezen.resources.taxblasterinterface;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.TaxFilingObject;

@Path("taxfilings/{id}")
public interface TaxFilingObjectResource {

    @GET
    @Produces("application/xml")
    TaxFilingObject getTaxFilingObject(@PathParam("id") long id);

}