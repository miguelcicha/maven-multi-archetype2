/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cicha.example;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author martin
 */
@Stateless
@LocalBean
public class ExampleController {

    public String businessMethod() {
        return "ExampleController";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
