/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controladorDAO;

import java.util.Set;
import ec.edu.ups.modeloON.Persona;
import java.util.HashSet;

/**
 *
 * @author Darwin
 */
public class PersonaDAO {
    private Set<Persona> list;
    
    public PersonaDAO(){
        list = new HashSet<>();
    }
    
    /*
    Metodo para crear una persona
    */
    public void crear(Persona p){
        list.add(p);
        System.out.println("cliente: "+p);
    }
    
    /*
    Metodo para buscar una persona por la cedula
    */
    public Persona buscar (String ced){
        for (Persona per: list){
            if (per.getCedula().equals(ced)){
                return per;
            }
        }
        return null;
    }
    
    /*
    Metodo para actualizar una persona
    */
    public void update (Persona p){
        if (list.contains(p)){
            list.remove(p);
            list.add(p);
        }
    }
    
    /*
    Metodo para eliminar una persona
    */
    public void delete (Persona p){
        if (list.contains(p)){
            list.remove(p);
        }
    }
    
    /*
    Metodo para listar las personas registradas
    */
    public Set<Persona> getList(){
        return list;
    }
    
}
