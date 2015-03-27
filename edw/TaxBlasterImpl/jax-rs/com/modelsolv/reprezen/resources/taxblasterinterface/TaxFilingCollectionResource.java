/**
 * Created by Apache CXF WadlToJava code generator
**/
package com.modelsolv.reprezen.resources.taxblasterinterface;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.TaxFilingCollection;
import com.modelsolv.reprezen.schemas.taxblaster.taxblasterinterface.TaxFilingObject;

@Path("taxfilings")
public interface TaxFilingCollectionResource {

    @GET
    @Produces("application/xml")
    TaxFilingCollection getTaxFilingCollection();

    @POST
    @Consumes("application/xml")
    @Produces("application/xml")
    TaxFilingObject postTaxFilingCollection(TaxFilingObject taxfilingobject);

}