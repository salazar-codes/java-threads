package com.jsalazar.threads.examples.thread;

public class NombreThread extends Thread{
    // Podemos personalizar el nombre del hilo
    public NombreThread(String name) {
        super(name);
    }

    // Sobreescribimos el método Run -> Cuando empieza la ejecución de Run empieza el hilo, hasta que finaliza y se termina el hilo.
    @Override
    public void run() {
        System.out.println("Se inicia el método run del hilo:" + getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName());
        }

        System.out.println("Finaliza el hilo");
    }
}
