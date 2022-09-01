/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JP
 */
public class ClienteController {
      Alumno[] tablaAlumno;
    int indiceArray;
    
    public ClienteController(){
        this.tablaAlumno = new Alumno[100];
        this.indiceArray=0;
    }
    
     public void guardarAlumno(Alumno alumno){
        this.tablaAlumno[this.indiceArray]=alumno;  
        this.indiceArray=this.indiceArray+1;
    }
    
    public Alumno[] getAlumnos(){
        return this.tablaAlumno;
    }
    
}

