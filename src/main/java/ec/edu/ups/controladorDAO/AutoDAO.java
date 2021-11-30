/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controladorDAO;

import java.util.Set;
import ec.edu.ups.modeloON.Auto;
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
    Metodo para crear un auto
    */
    public void crear(Auto a){
        list.add(a);
        System.out.println("auto: "+a);
    }
    
    /*
    Metodo para buscar una persona por la placa
    */
    public Auto buscar (String placa){
        for (Auto per: list){
            if (per.getPlaca().equals(placa)){
                return per;
            }
        }
        return null;
    }
    
    /*
    Metodo para actualizar un auto
    */
    public void update (Auto p){
        if (list.contains(p)){
            list.remove(p);
            list.add(p);
        }
    }
    
    /*
    Metodo para eliminar un auto
    */
    public void delete (Auto p){
        if (list.contains(p)){
            list.remove(p);
        }
    }
    
    /*
    Metodo para listar los autos registradas
    */
    public Set<Auto> getList(){
        return list;
    }
    
    public void limpiar(){
        
    }
}
