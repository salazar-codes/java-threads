package com.jsalazar.threads.examples;

import com.jsalazar.threads.examples.thread.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("Jimmy");
        hilo.start(); // Se levanta con start no con run.

        // Thread.sleep(1); // Esta es una pausa en el método MAIN. Se ejecuta 1ms después de ejecutar el thread hilo

        Thread hilo2 = new NombreThread("Salz");
        hilo2.start();

        Thread hilo3 = new NombreThread("Pepe");
        hilo3.start();

        System.out.println("state= " + hilo.getState()); // NEW: Solo se ha creado la instancia, pero no se ha ejecutado
    }
}
