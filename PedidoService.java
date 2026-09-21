package tienda.servicio;

import tienda.Factura.GeneradorFactura;
import tienda.infra.PedidoRepository;
import tienda.modelo.Pedido;
import tienda.modelo.Producto;
import tienda.notificacion.Notificador;

public class PedidoService {

    private Notificador notificador;
    private PedidoRepository pedidoRepository;
    private GeneradorFactura generadorFactura;

    public PedidoService(Notificador notificador, PedidoRepository pedidoRepository, GeneradorFactura generadorFactura) {
        this.notificador = notificador;
        this.pedidoRepository = pedidoRepository;
        this.generadorFactura = generadorFactura;
    }

    public void procesarPedido(Pedido pedido) {
        double subtotal = 0;

        for (Producto producto : pedido.getProductos()) {
            subtotal = subtotal + producto.getPrecio();
        }

        double descuento = 0;
        if (subtotal >= 100000) {
            descuento = subtotal * 0.10;
        }

        double costoEnvio = pedido.getEnvio().calcularCosto();
        double total = subtotal - descuento + costoEnvio;


        System.out.println("Preparando pedido " + pedido.getNumero() + " para el cliente "
                + pedido.getCliente().getNombre()+ "En:"+ pedido.getEnvio().definirEntrega());

        generadorFactura.generar(pedido, subtotal, descuento, costoEnvio, total);

        pedidoRepository.guardar(pedido);

        notificador.notificar(pedido.getCliente(), "Su pedido " + pedido.getNumero()
                + " fue procesado. Total: $" + total);  

    }
}
