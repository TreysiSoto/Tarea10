package Clase10;

public class ProductoControlador {

    private Producto producto[];

    private int contador;

    public ProductoControlador(int size) {

        this.producto = new Producto[size];

        this.contador = 0;
    }

    public void crear(int codigo, String nombre, double precio) {

        this.producto[this.contador] = new Producto(codigo, nombre, precio);

        this.contador++;
    }

    public void listar() {

        for (Producto p : producto) {

            p.listarProducto();
        }
    }

    public Producto buscar(int codigo) {
        int i;

        for (i = 0; i < this.contador; i++) {

            if (this.producto[i].getCodigo() == codigo) {

                break;
            }
        }

        if (i == this.contador) {

            return null;

        } else {

            return this.producto[i];
        }
    }
}
