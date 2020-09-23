package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
         double[] array = new double[5] ;
         String nombre;
         double promedio;
         String calificacion;
        Scanner leer = new Scanner(System.in);



        System.out.println("Promedios del alumnos :::");
        System.out.println("Ingresa el nombre del participante");
        nombre = leer.nextLine();
        System.out.println("ingresa las calificaciones");

        for (int i=0;i<5;i++){
            System.out.println("Ingresa Calificacion : "+ i);
            array[i]=leer.nextDouble();
        }
        Calificacion alumno = new Calificacion(nombre,array);
        promedio = alumno.promedio(array);
        calificacion = alumno.calificacion(promedio);

       alumno.imprimirDatos(nombre,promedio,array,calificacion);
    }
}
 class Calificacion{

    public String nombre;
    public double calificaciones[];


    public Calificacion(String nombre,double array[]){
        this.nombre=nombre;
        this.calificaciones=array;

    }

    public double promedio(double array[]){
        double sumatoria=0;
        for (int i=0;i<array.length;i++){
            sumatoria+=array[i];
        }
        return sumatoria/(5);
    }

    public String calificacion(double promedio){

        if (promedio <= 50){
            return "F";
        }else if(promedio > 51 && promedio <= 60){
            return "E";
        }else if(promedio >=61 && promedio <= 70){
            return "D";
        }else if(promedio >=71 && promedio <= 80){
            return "C";
        }else if(promedio >=81 && promedio <=90){
            return "B";
        }else{
            return "A";
        }
    }
    public void imprimirDatos(String nombre,double promedio,double array[],String calificacion){
        System.out.println("Nombre del estudiante : "+ nombre);
        for(int i=0;i< array.length;i++){
            System.out.println("Calificacion "+ i +" : " + array[i]);
        }
        System.out.println("Promedio : "+promedio);
        System.out.println("Calificacion : "+calificacion);
    }


}
