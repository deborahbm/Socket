/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3_ejerc1_dbm;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author dealm
 */
public class Servidor {
    
    public static void main(String[] args) throws IOException {
     
        // Creación y asignación de dirección
        ServerSocket servidor= new ServerSocket (9999); 
        
        // Aceptación de la conexión
        Socket misocket=servidor.accept(); 
        
        //Creación del canal para recibir datos
        DataInputStream flujo_entrada= new DataInputStream(misocket.getInputStream());
        
        //Lectura del mensaje entrante
        String mensaje_texto=flujo_entrada.readUTF();
        
        //Muestra en pantalla el mensaje entrante
        System.out.print ("Soy el servidor y acabo de recibir del cliente: ");
        System.out.print (mensaje_texto);
        
        //cierra el canal
        flujo_entrada.close(); 
        
        //cierra el socket
        misocket.close(); 
       
    } 
}
