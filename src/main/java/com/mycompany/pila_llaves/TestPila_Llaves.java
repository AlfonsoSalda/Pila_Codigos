package com.mycompany.pila_llaves;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestPila_Llaves {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int capacidad, opcion;
        char c,cc;
        
        System.out.println("Capacidad de la pila: ");
        capacidad = s.nextInt();
        
        Pila_Llaves miPila = new Pila_Llaves(capacidad);
        FileReader correcto,incorrecto;
        BufferedReader lectorc = null,lectori= null;
        String lector;
        char p1,p2,p3,p4;
        char[]lec;
        p1='(';
        p2=')';
        p3='{';
        p4='}';
        
        try {
            correcto=new FileReader("correcto.txt");
            incorrecto=new FileReader("incorrecto.txt");
            
            lectorc=new BufferedReader(correcto);
            lectori=new BufferedReader(incorrecto);
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
        do { 
            System.out.println("\n\t1.-Codigo Correcto\n\t2.-Codigo Incorrecto\n\t3.-Salir");
            opcion = s.nextInt();
            
            switch (opcion) {
                case 1:
                    try {
                        while((lector=lectorc.readLine())!=null){
                            lec=lector.toCharArray();
                            for (int i = 0; i < lec.length; i++) {
                                c=lec[i];
                                if (lec[i]==p1||lec[i]==p3) {
                                    miPila.apilar(c);

                                    miPila.mostrar();
                                } else{
                                    if (lec[i]==p2||lec[i]==p4) {
                                       
                                        miPila.desapilar();
                                        
                                        miPila.mostrar();
                                    }
                                }
                            }
                            
                        }
                      
                    } catch (IOException ex) {
                        System.out.println("Error: "+ex.getMessage());
                    }
                    
                    
                    break;

                case 2:
                    try {
                        while((lector=lectori.readLine())!=null){
                            lec=lector.toCharArray();
                            for (int i = 0; i < lec.length; i++) {
                                cc=lec[i];
                                if (lec[i]==p1||lec[i]==p3) {
                                    
                                    miPila.apilar(cc);
                                    
                                    miPila.mostrar();
                                } else{
                                    if (lec[i]==p2||lec[i]==p4) {
                                        
                                        miPila.desapilar();
                                        
                                        miPila.mostrar();
                                    }
                                }
                            }
                            
                        }
                      
                    } catch (IOException ex) {
                        System.out.println("Error: "+ex.getMessage());
                    }
                    
                    break;
                case 3:
                    System.out.println("\n\tBuen dia");
                    break;
                default:
                    System.out.println("\n\tError");
            }
            
        } while (opcion!=3);
    
    }
    
}
