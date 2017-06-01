/**
 * Miguel Created: 2017/06/01
 */
package com.cicha.example;

import com.cicha.example.base.domain.Entidad;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Miguel
 */
@Stateless
@LocalBean
public class EntidadController {

    @PersistenceContext(unitName = "base_persistence_unit")
    protected EntityManager em = null;

    public EntidadController() {
    }

    public Entidad create(String name) {
        Entidad entidad = new Entidad();
        entidad.setUsername(name);
        em.persist(entidad);
        return entidad;
    }

}
