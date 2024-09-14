package com.mycompany.fullstack1;

import java.util.Scanner;

/**
 *
 * @author marvinmazariegos
 */
public class Fullstack1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //tipo number valor
        String nombre = "Nombre";
        String Nombre = "Hola";
        int numero = 47933133;
        
        
        Telefono telefono = new Telefono();
        telefono.enviarMensaje();
        
        
        Casa casa = new Casa();
        casa.abrirPuerta();
        casa.encenderLuces();

        // Aquí ejecutamos los ejercicios
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }
    
    public static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        
        System.out.println("Los números introducidos son: " + numero1 + " y " + numero2);
    }
    
    public static void ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Buenos días " + nombre);
    }
    
    public static void ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        System.out.println("El doble de " + numero + " es " + (numero * 2));
        System.out.println("El triple de " + numero + " es " + (numero * 3));
    }
    
    public static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce los grados centígrados: ");
        double centigrados = scanner.nextDouble();
        
        double fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println(centigrados + " grados centígrados son " + fahrenheit + " grados Fahrenheit.");
    }
    
    public static void ejercicio5() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);
    }
}

class Telefono {
    String nombre = "S24 Ultra";
    int numero = 47933133;
    
    public void enviarMensaje() {
        System.out.println("Mensaje enviado desde el teléfono " + nombre);
    }
}

class Casa {
    int numeroHabitaciones = 4;
    double tamano = 250.5;
    
    public void abrirPuerta() {
        System.out.println("Puerta abierta");
    }

    public void encenderLuces() {
        System.out.println("Luces encendidas");
    }
}
