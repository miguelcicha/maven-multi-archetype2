/**
 * Miguel Created: 2017/06/01
 */
package com.cicha.example;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Miguel
 */
@RequestScoped
@Path("/example")
public class ExampleServ {

    @GET
    public String example() {
        return "example";
    }
}
