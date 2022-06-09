package Clase10;

public class Main {
    public static void main(String args[]) {
        ProductoControlador productoControlador = new ProductoControlador(4);

        System.out.println("----------Lista de Productos--------------");

        productoControlador.crear(345, "Fideo", 3.10);

        productoControlador.crear(124, "Leche", 4);

        productoControlador.crear(346, "Atun", 8.50);

        productoControlador.crear(875, "Detergente", 1.20);

        productoControlador.listar();

        System.out.println();

        System.out.println("------------- Buscar Codigo -------------");

        int codigo = 346;

        Producto encontrado;

        encontrado = productoControlador.buscar(codigo);

        if (encontrado != null) {
            System.out.println("Codigo encontrado: " + encontrado.getCodigo());

        } else {

            System.out.println("No se encontro el codigo: " + codigo);
        }
        System.out.println();

    }

}
