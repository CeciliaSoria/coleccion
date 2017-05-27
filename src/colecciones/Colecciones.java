/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author educacionit
 */
public class Colecciones {

    public static void main(String[] args) {
       /* List <String> nombres = new ArrayList <> ();
        nombres.add ("Juan")
        nombres.add ("Fecha")
        nombres.add ("Juan")
                System.out.println (nombres.size());
                System.out.println(nombres.pet(0));
                
        nombres.remove(0);
        
        for (String: nombres); */
       
     /*Set<Persona> personas= new HashSet <> ();
     personas.add (new Persona ("Juan","10"));
     personas.add (new Persona ("Juan","11"));
     personas.add (new Persona ("Pedro","12"));
            System.out.println(personas.size());
                                                  */
                    
   
    /*SortedSet <Persona> persona = new TreeSet <Persona> ();
        persona.add (new Persona ("Ariel", "30"));
        persona.add (new Persona ("Raul", "42"));
        persona.add (new Persona ("Baltazar", "70"));
            
    for (Persona p: persona) {
            System.out.println(p);                   
                                                                   */
    Map <String,Persona> personaPorDni=new HashMap <>();
    
    personaPorDni.put("10", new Persona ("10","Juan"));
    Persona p2= new Persona ("20","Pedro");
    personaPorDni.put (p2.getDni(),p2);
    personaPorDni.put ("10",p2);
    Persona x= personaPorDni.get ("20");

      //Values ()
    for (Persona p: personaPorDni.values()){
        System.out.println (p2);
        
   }
    //KeySet()
    for (String k: personaPorDni.keySet()){
        System.out.println (k + ":" + personaPorDni.get(k));
     }
    //EntrySet
    for (Map.Entry <String,Persona> e: personaPorDni.entrySet()){
        System.out.println(e.getKey()+ ":" + e.getValue());
    }
    /*[para remover] (personaPorDni.remove("20")*/
    personaPorDni.containsKey ("20");
    personaPorDni.containsValue (p2);
        Persona x1 = personaPorDni.getOrDefault("30", x);
     /*[para agregar] (personaPorDniputifAbsent"40",p2);*/
     
    
    }
}

