package tienda.Factura;

import tienda.modelo.Pedido;

public class FacturaTexto implements GeneradorFactura {

    @Override
    public void generar(Pedido pedido, double subtotal, double descuento, double costoEnvio, double total) {
        System.out.println("Factura para el pedido " + pedido.getNumero());
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Descuento: " + descuento);
        System.out.println("Costo de envío: " + costoEnvio);
        System.out.println("Total: " + total);
    }
    
}
