/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import src.*;

/**
 *
 * @author trabajo
 */
public class Aplicacion {
    public static void main(String[] args){
        
        String destino;
        int[] cantPasajeros = new int[15];
        Buss trans = null;
        int opMenu=0;
        
        do{
            System.out.println("\nbuses\n******");
            System.out.println("1. Crear Bus");
            System.out.println("2.Mostrar Informacion");
            System.out.println("3.Cantidad de dias en que no hubo Pasajero");
            System.out.println("4.Dias en que el bus no tuvo pasajero");
            System.out.println("5.Total Ganado en dias mayor a 20");
            System.out.println("6.Salir");
            opMenu = Leer.datoInt();
            
            switch (opMenu){
                case 1:
                    System.out.println("Cual es el destino?");
                    destino = Leer.dato();
                    
                    for (int i=0; i<cantPasajeros.length; i++){
                        do{
                            System.out.println("Cauntos pasajeros viajaron el dia "+(i+1)+"? (de 0 a 40)");
                            cantPasajeros[i] = Leer.datoInt();
                            
                        }while(cantPasajeros[i]<0 || cantPasajeros[i]>40);
                    }
                    trans = new Buss(destino, cantPasajeros);
                    break;
                    
                case 2:
                    if (trans == null){
                        System.out.println("No has creado el objeto");
                    }else{
                        System.out.println("\n Destino : "+trans.getDestino());
                        cantPasajeros = trans.getCantidadPasajero();
                        System.out.println(" Cantidad de pasajeros  diario : ");
                        for (int i=0; i<cantPasajeros.length;i++){
                            System.out.println("    "+cantPasajeros[i]);
                        }
                    }
                    break;
                    
                case 3:
                    if (trans.contarDiasSinPasajeros()==0){
                        System.out.println("Todos los dias hubieron pasajeros");
                    }else{
                        System.out.println("la cantidad de dias sin pasajeros fueron "+ trans.contarDiasSinPasajeros());
                    }
                    
                    
                    break;
                    
                case 4:
                    int[] diasSin = trans.diasSinPasajero();
                    System.out.println("Los dias que no hubieron pasajeros fueron\n");
                    for (int i=0; i<diasSin.length;i++){
                        System.out.println("    "+diasSin[i]);
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("total ganado $ "+ trans.calcularDineto(700));
                    break;
            }
        }while(opMenu !=6);
    }
    
}
