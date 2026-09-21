

import tienda.Pago.PagoEfectivo;
import tienda.envio.EnvioDomicilio;
import tienda.infra.PedidoRepository;
import tienda.modelo.Cliente;
import tienda.modelo.Pedido;
import tienda.modelo.Producto;
import tienda.notificacion.Notificador;
import tienda.notificacion.WspNotificador;
import tienda.servicio.PedidoService;
import tienda.Factura.*;
import tienda.infra.InMemoryPedidoRepository;


public class App {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                "Ana Lopez",
                "ana@correo.com",
                "11-5555-1234");

        EnvioDomicilio envio = new EnvioDomicilio(
                "Av. Siempre Viva 742");

        Pedido pedido = new Pedido(
                1001,
                cliente,
                new PagoEfectivo(),
                envio);

        pedido.agregarProducto(new Producto("Notebook", 850000));
        pedido.agregarProducto(new Producto("Mouse", 25000));
        
        GeneradorFactura factura = new FacturaTexto();

        Notificador notificador = new WspNotificador();

        PedidoRepository pedidoRepository = new InMemoryPedidoRepository();

        PedidoService servicio = new PedidoService(
        notificador,
        pedidoRepository,
        factura
        );

        servicio.procesarPedido(pedido);
        }
}
