package PoryectoFinal;

import java.util.Scanner;

public class ProyectoFinal {
    public static void main(String[] args) {
    // Declarar variables
    int vt1,vt2,vt3,vt4;
    double sm,pt,c;
    String vendedor; 
    // Crear objeto de lectura de datos
    Scanner lectura=new Scanner(System.in);
    // Entrada de datos
    System.out.print("Nombre de vendedor: ");
    vendedor = lectura.next();  // Leer el nombre
    System.out.print("Sueldo mensual: ");
    sm=lectura.nextDouble();
    System.out.print("Venta 1: ");
    vt1 = lectura.nextInt();
    System.out.print("Venta 2: ");
    vt2 = lectura.nextInt();
    System.out.print("Venta 3: ");
    vt3 = lectura.nextInt();
    System.out.print("Venta 3: ");
    vt4 = lectura.nextInt();
    // Proceso de datos
    c=(vt1 + vt2 + vt3+ vt4) * 0.10;
    pt=sm+c;
    // Salida de datos
    System.out.print("La comisión de venta es: " + c);
    System.out.print("El sueldo neto del vendedor "+vendedor+ " es: " + pt);
    }    
}

    
    

