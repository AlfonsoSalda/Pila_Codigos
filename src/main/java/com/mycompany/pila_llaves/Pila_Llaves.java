package com.mycompany.pila_llaves;

public class Pila_Llaves {
    private int capacidad;
    private int cima;
    private char vector[];
    
    public Pila_Llaves(int capacidad){
        this.capacidad = capacidad;
        vector = new char[capacidad];
        cima = -1;
    }
    
    public boolean esVacia(){
        if(cima == -1)
            return true;
        else
            return false;
    }
    
    public boolean esLlena(){
        if(cima == capacidad-1)
            return true;
        else 
            return false;
    }
    
    public void apilar(char elemento){
        if(!esLlena()){   // if(esLlena()== false)
            cima = cima+1;
            vector[cima]= elemento;
        }
        else
            System.out.println("Pila llena. ");
    }
    
    public void desapilar(){
        if(!esVacia())
            cima = cima-1;
        else
            System.out.println("Pila vacia.");
    }
    
    public void obtenerCima(){
        if(!esVacia())
            System.out.println("Cima: "+vector[cima]);
        else
            System.out.println("Pila vacia.");
    }
    
    public void mostrar(){
        if(!esVacia()){
            System.out.println("------- PILA --------");
            for(int i=cima; i>=0; i--)
                System.out.println(vector[i]);
        }
        else
           System.out.println("Pila vacia.");        
    } 

}
