/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.trabajo2.archivos.operaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.trabajo2.archivos.clasesBase.Alumno;

/**
 *
 * @author mario
 */
public class Lectura {
    
    public LinkedList<Alumno> leerAlumnos(String nombreArchivo){
        String cadenaLeida = ""; 
        FileReader fr ;
        BufferedReader archivoLectura; 
        LinkedList<Alumno> alumnos = new LinkedList<>();    
        OperacionesLista opLista = new OperacionesLista();
        try { 
            fr = new FileReader(nombreArchivo);
            archivoLectura = new BufferedReader(fr);
            
            cadenaLeida = archivoLectura.readLine(); 
            while(cadenaLeida != null){
                //cada cadena leida contiene un alumno con sus datos separados por coma 
                StringTokenizer st = new StringTokenizer(cadenaLeida,",");
                //creamos un nuevo alumno 
                Alumno alumno = new Alumno(); 
                alumno.setMatricula(st.nextToken());
                alumno.setNombre(st.nextToken());
                alumno.setPrimerApellido(st.nextToken());
                alumno.setSegundoApellido(st.nextToken());
                alumno.setClaveLicenciatura(st.nextToken());
                alumno.setGenero(st.nextToken());
                alumnos = opLista.insertarAlumno(alumnos, alumno); 
                cadenaLeida = archivoLectura.readLine(); 
            }
            archivoLectura.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumnos; 
    }
    
}
