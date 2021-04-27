/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dev.ejb;

import javax.ejb.Local;

/**
 *
 * @author roman
 */
@Local
public interface ServicioSaludoLocal {
    String hello();
    String hello(String name);
    String hello(String name, int age);
    
}
