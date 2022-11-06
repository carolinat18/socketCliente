package co.edu.poli.dataCliente.model;
import java.io.*;
import java.net.*;
import java.util.Scanner;

import javax.swing.*;

import javax.swing.JOptionPane;
@SuppressWarnings("unused")
class cliente {
	Scanner teclado =new Scanner(System.in);

	static  String HOST;
	static  int PUERTO;
	static String nombre;
	String log;
	String mensaje;
	public cliente () { 
	
		try {
			System.out.print("Digite la IP del servidor: ");
			HOST=teclado.next();
		 System.out.print("Digite el puerto de la conexión: ");
		 PUERTO=teclado.nextInt();
		 System.out.print("Escriba su nombre: ");
		 nombre=teclado.next();
			
					
				Socket skCliente = new Socket (HOST,PUERTO);

				OutputStream stream_output = skCliente.getOutputStream();
				DataOutputStream data_output = new DataOutputStream(stream_output);
				
				data_output.writeUTF(String.valueOf("Servidor iniciado y contestando ok "+skCliente.getLocalAddress())+":"+String.valueOf(skCliente.getPort())+" Usuario: "+nombre+" conectado");
				
				
				InputStream stream_input = skCliente.getInputStream();
				DataInputStream data_input = new DataInputStream(stream_input);
			 System.out.print("Cliente conectado: "+data_input.read());
					//	JOptionPane.showMessageDialog(null,"El fibonacci del numero digitado es: "+data_input.readInt());	
			
				skCliente.close();
				
			 
			
		}	
		catch ( Exception e ) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String [] arg){
		new cliente();
	}
}