/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Darwin
 */
public class Auto {
    private String matricula;
    private String marca;
    private String modelo;
    private int año;
    
    public Auto(){
        
    }
    
    public Auto(String matricula, String marca, String modelo, int año){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Auto{" + "matricula= " + matricula + ", marca= " + marca + ", modelo= " + modelo + ", año=" + año + '}';
    }
    
    
}
