/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Jean Pierre Perez
 */
public class Buss {
    private String destino;
    private int[] cantidadPasajero;
    
    public Buss(){}
    
    public Buss(String destino, int[] cantidadPasajero) {
        this.destino = destino;
        this.cantidadPasajero = cantidadPasajero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int[] getCantidadPasajero() {
        return cantidadPasajero;
    }

    public void setCantidadPasajero(int[] cantidadPasajero) {
        this.cantidadPasajero = cantidadPasajero;
    }
    
    // Metodo que retorna la cantidad de dias que el bus viajo vacio
    
    public int contarDiasSinPasajeros(){
        int cantidad = 0;
        
        for (int i=0;i<this.cantidadPasajero.length; i++){
            if(this.cantidadPasajero[i] == 0)
                cantidad ++;
        }
        
        return cantidad;
    }
    
    public int[] diasSinPasajero(){
        int cantDiasVacios = contarDiasSinPasajeros();
        if (cantDiasVacios ==0){
            return null;
        }else{
            int[] diasVacios = new int[cantDiasVacios];
            int x =0;
            
            for (int i=0; i<this.cantidadPasajero.length; i++){
                if (cantidadPasajero[i]==0){
                    diasVacios[x] = (i+1);
                    x++;
                }
            }
            return diasVacios;
        }
    }
    
    
    //toatl ganado por dias que viajaron mas de 20 personas
    
    
    public int calcularDineto(int precioPasajero){
        int suma=0;
        for (int i=0; i<this.cantidadPasajero.length;i++){
            if (this.cantidadPasajero[i]>20){
                suma+=cantidadPasajero[i];
                
            }
        }
        return suma*precioPasajero;
    }
}
