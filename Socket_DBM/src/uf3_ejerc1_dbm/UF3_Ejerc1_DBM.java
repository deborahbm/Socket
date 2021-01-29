/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3_ejerc1_dbm;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author dealm
 */
public class UF3_Ejerc1_DBM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //Creacion y conexión del socket
        Socket misocket =new Socket ("localhost", 9999); 
        
        //Muestra en pantalla los datos del socket
        System.out.println ("Los datos del socket son:");
        System.out.println ("Dirección: "+ misocket.getLocalAddress());
        System.out.println ("Puerto: "+ misocket.getPort());
        
        //Crea el canal para el envío de mensajes
        DataOutputStream flujo_salida= new DataOutputStream (misocket.getOutputStream());
        
        //Muestra en pantalla el mensaje que se envía
        System.out.println ("Soy el cliente y envío: Hola");
        
        //Mensaje del flujo de envío
        flujo_salida.writeUTF("Hola "); 
        
        //cierra el canal
        flujo_salida.close(); 
        
        //cierra el socket 
        misocket.close(); 
    }
}
