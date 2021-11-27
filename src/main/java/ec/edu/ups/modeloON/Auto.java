/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modeloON;

/**
 *
 * @author Darwin
 */
public class Auto {
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    
    public Auto(){
        
    }
    
    public Auto(String placa, String marca, String modelo, int año){
        this.placa=placa;
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
        return "Auto{" + "Placa= " + placa + ", marca= " + marca + ", modelo= " + modelo + ", año=" + año + '}';
    }
    
    
}
