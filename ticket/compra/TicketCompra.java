/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket.compra;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class TicketCompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner producto=new Scanner(System.in);
        System.out.println("escriba el numero de unidades que va a comprar");
        float unidades=producto.nextFloat();
        System.out.println("escriba el precio de cada unidad");
     float precio=producto.nextFloat();
     float total=unidades*precio;
     System.out.println("el total de la compra es "+ total);
     System.out.println("escriba lo que paga en caja");
     float importe=producto.nextFloat();
     float devolucion=importe-total;
     System.out.println("ESTABLECIMIENTO");
     System.out.println("nº unidades "+unidades+"\n"+"precio unidade "+precio+"\n"+"total "+total+"\n"+"recibo "+importe+"\n"+"devolvo "+devolucion+"\n"+"Grazas por su visita");
     
             
        
        // TODO code application logic here
    }
    
}
