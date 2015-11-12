package Clases;
// Generated 12/11/2015 01:31:52 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Fallaarea generated by hbm2java
 */
public class Fallaarea  implements java.io.Serializable {


     private FallaareaId id;
     private Estudiante estudiante;
     private Profesor profesor;
     private Date fecha;
     private String hora;
     private short semana;

    public Fallaarea() {
    }

    public Fallaarea(FallaareaId id, Estudiante estudiante, Profesor profesor, Date fecha, String hora, short semana) {
       this.id = id;
       this.estudiante = estudiante;
       this.profesor = profesor;
       this.fecha = fecha;
       this.hora = hora;
       this.semana = semana;
    }
   
    public FallaareaId getId() {
        return this.id;
    }
    
    public void setId(FallaareaId id) {
        this.id = id;
    }
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Profesor getProfesor() {
        return this.profesor;
    }
    
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getHora() {
        return this.hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    public short getSemana() {
        return this.semana;
    }
    
    public void setSemana(short semana) {
        this.semana = semana;
    }




}

