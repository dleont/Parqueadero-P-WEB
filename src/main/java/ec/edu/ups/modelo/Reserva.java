/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Darwin
 */
public class Reserva {
    private int cod;
    private Date fechaS;
    private int horaS;
    private int minS;
    private int segS;
    private Ticket ticket;
    private Persona p;
    
    public Reserva(){
        
    }
    
    public Reserva(int cod, Date fechaS, int horaS, int minS, int segS, Ticket ticket, Persona p){
        this.cod=cod;
        this.fechaS=fechaS;
        this.horaS=horaS;
        this.minS=minS;
        this.segS=segS;
        this.ticket=ticket;
        this.p=p;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getFechaS() {
        return fechaS;
    }

    public void setFechaS(Date fechaS) {
        this.fechaS = fechaS;
    }

    public int getHoraS() {
        return horaS;
    }

    public void setHoraS(int horaS) {
        this.horaS = horaS;
    }

    public int getMinS() {
        return minS;
    }

    public void setMinS(int minS) {
        this.minS = minS;
    }

    public int getSegS() {
        return segS;
    }

    public void setSegS(int segS) {
        this.segS = segS;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Reserva{" + "cod=" + cod + ", fechaS=" + fechaS + ", horaS=" + horaS +
                ", minS=" + minS + ", segS=" + segS + ", ticket=" + ticket + ", p=" + p + '}';
    }
    
    
}
