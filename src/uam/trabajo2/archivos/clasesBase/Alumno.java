/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.trabajo2.archivos.clasesBase;

/**
 *
 * @author mario
 */
public class Alumno {
    private String nombre; 
    private String primerApellido; 
    private String segundoApellido; 
    private String matricula; 
    private String claveLicenciatura; 
    private String genero; 

    public Alumno() {
    
    }
    
    
    public Alumno(String nombre, String primerApellido, String segundoApellido, String matricula, String claveLicenciatura, String genero) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.matricula = matricula;
        this.claveLicenciatura = claveLicenciatura;
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setClaveLicenciatura(String claveLicenciatura) {
        this.claveLicenciatura = claveLicenciatura;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getClaveLicenciatura() {
        return claveLicenciatura;
    }

    public String getGenero() {
        return genero;
    }
    
    @Override 
    public String toString(){
        return "\nNombre: " + this.nombre + "\nPrimer Apellido: " + this.segundoApellido + "\nMatricula: " + this.matricula +
                "\nClave Licenciatura: " + this.claveLicenciatura + "\nGenero: " + this.genero; 
    }
    
    
}
