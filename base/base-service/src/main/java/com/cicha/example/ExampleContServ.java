/**
 * Miguel Created: 2017/06/01
 */
package com.cicha.example;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Miguel
 */
@RequestScoped
@Path("/examplecont")
public class ExampleContServ {

    @EJB
    ExampleController exampleController;

    @GET
    public String example() {
        return exampleController.businessMethod();
    }
}
