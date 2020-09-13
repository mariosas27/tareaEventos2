/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.trabajo2.archivos.principal;

import java.util.LinkedList;
import java.util.Scanner;
import uam.trabajo2.archivos.clasesBase.Alumno;
import uam.trabajo2.archivos.operaciones.Lectura;
import uam.trabajo2.archivos.operaciones.OperacionesLista;

/**
 *
 * @author mario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Alumno> listaAlumnos;
        listaAlumnos = cargarAlumnos(); 

        
        int op; 
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\n\n----------------------------- MENU --------------------------------");
            System.out.println("1.- Buscar alumno por matricula");
            System.out.println("2.- Buscar alumnos por licenciatura");
            System.out.println("3.- Buscar alumnos por genero");
            System.out.println("4.- Borrar alumno por matricula");
            System.out.println("5.- Salir");

            System.out.println("Escribe tu opcion: ");
            op = sc.nextInt();
            
            switch(op){
                case 1: {
                    busquedaAlumno(listaAlumnos); 
                    break; 
                }
                case 2: {
                    busquedaAlumnosLic(listaAlumnos);
                    break; 
                }
                case 3: {
                    busquedaAlumnosGenero(listaAlumnos);
                    break;
                }
                case 4: {
                    borraAlumno(listaAlumnos); 
                    break; 
                }
                case 5: {
                    System.out.println("salida del programa");
                    break; 
                }
            }
        }while(op != 5);       
        
      
    }
    
    public static LinkedList<Alumno> cargarAlumnos(){
        Lectura lectura = new Lectura(); 
      
        return lectura.leerAlumnos("alumnos.dat");
    }
    

    public static void busquedaAlumno(LinkedList listaAlumnos){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n----------------- BUSQUEDA DE ALUMNO POR MATRICULA --------------");
        System.out.println("Escribe la matricula: ");
        String matricula = sc.next();
     
        OperacionesLista opLista = new OperacionesLista();
       
        Alumno alumno = opLista.buscarAlumno(listaAlumnos, matricula);
        
        if(alumno != null){
            System.out.println("\n********** ALUMNO ENCONTRADO ***********");
            System.out.println(alumno.toString());
        }else{
            System.out.println("\n********** ALUMNO NO ECNCONTRADO ************");
        }
        
    }
    public static void busquedaAlumnosLic(LinkedList listaAlumnos){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n----------------- BUSQUEDA DE ALUMNOS POR LICENCIATURA --------------");
        System.out.println("Escribe la clave de la licenciatura: ");
        String claveLicenciatura = sc.next();
     
        OperacionesLista opLista = new OperacionesLista();
       
        LinkedList<Alumno> listaBusqueda = opLista.buscarAlumnosLic(listaAlumnos, claveLicenciatura);
        
        if(listaBusqueda.size() > 0){
            System.out.println("\n********** ALUMNOS ENCONTRADOS ***********");
            opLista.mostrarLista(listaBusqueda);
        }else{
            System.out.println("\n********** ALUMNOS NO ECNCONTRADOS ************");
        }
        
    }
    public static void busquedaAlumnosGenero(LinkedList listaAlumnos){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n----------------- BUSQUEDA DE ALUMNOS POR GENERO --------------");
        System.out.println("Escribe el genero:  ");
        String genero = sc.next();
     
        OperacionesLista opLista = new OperacionesLista();
       
        LinkedList<Alumno> listaBusqueda = opLista.buscarAlumnosGenero(listaAlumnos, genero);
        
        if(listaBusqueda.size() > 0){
            System.out.println("\n********** ALUMNOS ENCONTRADOS ***********");
            opLista.mostrarLista(listaBusqueda);
        }else{
            System.out.println("\n********** ALUMNOS NO ECNCONTRADOS ************");
        }
        
    }
    public static void borraAlumno(LinkedList listaAlumnos){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n----------------- BUSQUEDA DE ALUMNOS POR LICENCIATURA --------------");
        System.out.println("Escribe la matricula: ");
        String matricula = sc.next();
     
        OperacionesLista opLista = new OperacionesLista();
       
        boolean resultadoRemove = opLista.borrarALumno(listaAlumnos, matricula);
        
        if(resultadoRemove){
            System.out.println("\n********** ALUMNO BORRADO ***********");
            
        }else{
            System.out.println("\n********** ALUMNOS NO ECNCONTRADOS ************");
        }
        
    }
    
}
