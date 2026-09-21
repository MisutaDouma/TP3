package tienda.modelo;

import java.util.ArrayList;
import java.util.List;

import tienda.Pago.TipoPago;
import tienda.envio.Envio;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private List<Producto> productos;
    private TipoPago tipoPago;
    private Envio envio;

    public Pedido(int numero, Cliente cliente, TipoPago tipoPago, Envio envio) {
        this.numero = numero;
        this.cliente = cliente;
        this.tipoPago = tipoPago;
        this.envio = envio;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return List.copyOf(productos);
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public Envio getEnvio() {
        return envio;
    }
}
