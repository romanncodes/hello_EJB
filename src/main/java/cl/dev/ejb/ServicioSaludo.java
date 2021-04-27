/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.dev.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author roman
 */
@Stateless
public class ServicioSaludo implements ServicioSaludoLocal {

    
   @Override
   public String hello(){
       return "Hola desde un EJB";
   }
   
   @Override
   public String hello(String name){
       return "Hola "+name+" este es un saludo de un EJB";
   }
   
   @Override
   public String hello(String name, int age){
       return "Hola "+name+" este es un saludo de un EJB y tu edad es "+age;
   }
   
    
}
