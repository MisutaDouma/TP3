package tienda.Factura;

import tienda.modelo.Pedido;

public interface GeneradorFactura {
    public void generar( Pedido pedido, double subtotal, double descuento, double costoEnvio, double total);
}
