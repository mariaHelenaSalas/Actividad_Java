package com.clasejava;

import java.util.Optional;

public class ejercicioFuncionOpcional {
    public static void saludar (Optional<String> nombre) {
        System.out.println("Hola, " + nombre.orElse("Invitado") + "!");
    }

    public static void main(String[] args) {
        saludar(Optional.of("Maria"));
        saludar(Optional.empty());
        
    }
    
}
