/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.trabajo2.archivos.operaciones;

import java.util.LinkedList;
import uam.trabajo2.archivos.clasesBase.Alumno;

/**
 *
 * @author mario
 */
public class OperacionesLista {
    
    public LinkedList<Alumno> insertarAlumno(LinkedList<Alumno> listaAlumnos, Alumno alumno){
        listaAlumnos.add(alumno); 
        return listaAlumnos; 
    }
    //busqueda por matricula 
    public Alumno buscarAlumno(LinkedList<Alumno> listaAlumnos, String matricula){
        Alumno alumnoBusqueda = null; 
        for(Alumno alumno : listaAlumnos){
            if(alumno.getMatricula().compareTo(matricula) == 0){
                alumnoBusqueda = alumno; 
                break; 
            }
        }
        return alumnoBusqueda; 
    }
    
    //busqueda de alumnos por licenciatura

    public LinkedList<Alumno> buscarAlumnosLic(LinkedList<Alumno> listaAlumnos, String claveLicenciatura){
        LinkedList<Alumno> listaBusqueda = new LinkedList<>(); 
        OperacionesLista opLista = new OperacionesLista(); 
        for(Alumno alumno : listaAlumnos){
            if(alumno.getClaveLicenciatura().compareTo(claveLicenciatura) == 0){
                listaBusqueda = opLista.insertarAlumno(listaBusqueda, alumno); 
            }
        }
        return listaBusqueda; 
    }
    
    //busqueda de alumnos por licenciatura

    public LinkedList<Alumno> buscarAlumnosGenero(LinkedList<Alumno> listaAlumnos, String genero){
        LinkedList<Alumno> listaBusqueda = new LinkedList<>(); 
        OperacionesLista opLista = new OperacionesLista(); 
        for(Alumno alumno : listaAlumnos){
            if(alumno.getGenero().compareTo(genero) == 0){
                listaBusqueda = opLista.insertarAlumno(listaBusqueda, alumno); 
            }
        }
        return listaBusqueda; 
    }
    
    //borrar alumno por matricula
    
    public boolean borrarALumno(LinkedList<Alumno> listaAlumno, String matricula){
        boolean existe = false; 
        
        for(Alumno alumno : listaAlumno){
            if(alumno.getMatricula().compareTo(matricula) == 0){
                listaAlumno.remove(alumno);
                existe = true; 
                break; 
            }
        }
        return existe; 
    }
    
    public void mostrarLista(LinkedList<Alumno> listaAlumno){
        System.out.println("Alumnos: ");
        for(Alumno alumno : listaAlumno){
            System.out.println("----------------------------");
            System.out.println(alumno.toString());
        }
    }
         
    
}
