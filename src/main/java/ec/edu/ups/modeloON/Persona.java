/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modeloON;

/**
 *
 * @author Darwin
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    
    public Persona(){
    
    }

    public Persona(String cedula, String nombre,String apellido,String genero){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona {"+" cedula: "+cedula+" nombre:"+nombre+" apellido: "+apellido+" genero: "+genero+" }";
    }
    
}
