/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.modelsolv.reprezen.resources.taxblasterinterface;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.PersonTaxFilingCollection;

@Path("people/{id}/taxfilings")
public interface PersonTaxFilingCollectionResource {

    @GET
    @Produces("application/xml")
    PersonTaxFilingCollection getPersonTaxFilingCollection();

    @PUT
    @Consumes("application/xml")
    Response putPersonTaxFilingCollection(PersonTaxFilingCollection persontaxfilingcollection);

}