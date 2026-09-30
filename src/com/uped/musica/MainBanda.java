package com.uped.musica;

import com.uped.musica.modelo.Bateria;
import com.uped.musica.modelo.Guitarra;
import com.uped.musica.modelo.Instrumento;
import com.uped.musica.modelo.Piano;

public class MainBanda {
    public static void main(String[] args) {
        Instrumento i = new Guitarra();

        System.out.println(i.tipo);
        System.out.println(i.identificar());
        i.mostrarTipo();
        i.tocar();

        System.out.println("--- banda completa ---");
        Instrumento[] banda = {
                new Guitarra(), new Piano(), new Bateria()
        };

        for (Instrumento instr : banda) {
            instr.tocar();
        }
    }
}