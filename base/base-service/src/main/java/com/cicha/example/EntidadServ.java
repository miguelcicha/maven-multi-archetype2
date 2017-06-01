/**
 * Miguel Created: 2017/06/01
 */
package com.cicha.example;

import com.cicha.example.base.domain.Entidad;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Miguel
 */
@RequestScoped
@Path("/entidad")
public class EntidadServ {

    @EJB
    EntidadController entidadController;

    @GET
    public String create() {
        Entidad entidad = entidadController.create("entidad nombre");
        return entidad.getUsername();
    }
}
