/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modeloON;

//import java.util.Calendar;
import java.util.Date;
//import java.util.GregorianCalendar;

/**
 *
 * @author Darwin
 */
public class Ticket {
    private int cod;
    private Date fecha;
    private int hora;
    private int min;
    private int seg;
    private Auto auto;
    
    private Ticket(){
        
    }
    
    private Ticket(int cod, Date fecha, int hora, int min, int seg, Auto auto){
        this.cod=cod;
        this.fecha=fecha;
        this.hora=hora;
        this.min=min;
        this.seg=seg;
        this.auto=auto;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Ticket{" + "cod=" + cod + ", fecha=" + fecha + ", hora=" + hora + 
                ", min=" + min + ", seg=" + seg + ", auto=" + auto + '}';
    }
    
    
}
