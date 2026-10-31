package com.example;

public class Main {
    public static void main(String[] args) {

        // Instancia 1: Usando el constructor por defecto
        barberia barberiaDefecto = new barberia();

        // Instancia 2: Usando el constructor parametrizado
        barberia barberiaParametrizada = new barberia(
                "Barberia Don Juan",
                "Calle 10 # 43-12",
                5,
                14,
                22000.0,
                308000.0,
                true,
                true,
                "3109876543",
                'M'
        );

        // Imprimir ambos objetos mediante toString()
        System.out.println("=== OBJETO CREADO CON CONSTRUCTOR POR DEFECTO ===");
        System.out.println(barberiaDefecto);

        System.out.println("\n=== OBJETO CREADO CON CONSTRUCTOR PARAMETRIZADO ===");
        System.out.println(barberiaParametrizada);

        // Prueba de modificacion y validacion en Setters
        System.out.println("\n=== PROBANDO MODIFICACIONES Y VALIDACIONES ===");
        
        // Modificacion correcta
        barberiaDefecto.setNombreBarberia("Nueva Barberia Centro");
        System.out.println("Nuevo nombre asignado: " + barberiaDefecto.getNombreBarberia());

        // Prueba de error: valor negativo en precio
        System.out.print("Intento con precio negativo: ");
        barberiaDefecto.setPrecioCorteBasico(-15000.0);

        // Prueba de error: tipo de servicio invalido
        System.out.print("Intento con servicio invalido: ");
        barberiaDefecto.setTipoServicio('Z');
    }
}