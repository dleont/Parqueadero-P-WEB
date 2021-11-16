/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controladorDAO;

import java.util.Set;
import ec.edu.ups.modelo.Auto;
import java.util.HashSet;

/**
 *
 * @author Darwin
 */
public class AutoDAO {
    
    private Set<Auto> list;
    
    public AutoDAO(){
        list = new HashSet<>();
    }
    
    /*
    Metodo para crear una persona
    */
    public void crear(Auto a){
        list.add(a);
        System.out.println("auto: "+a);
    }
    
    /*
    Metodo para buscar una persona por la cedula
    */
    public Auto buscar (String matri){
        for (Auto per: list){
            if (per.getMatricula().equals(matri)){
                return per;
            }
        }
        return null;
    }
    
    /*
    Metodo para actualizar una persona
    */
    public void update (Auto p){
        if (list.contains(p)){
            list.remove(p);
            list.add(p);
        }
    }
    
    /*
    Metodo para eliminar una persona
    */
    public void delete (Auto p){
        if (list.contains(p)){
            list.remove(p);
        }
    }
    
    /*
    Metodo para listar las personas registradas
    */
    public Set<Auto> getList(){
        return list;
    }
}
