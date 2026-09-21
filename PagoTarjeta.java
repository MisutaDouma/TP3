package tienda.Pago;

public class PagoTarjeta implements TipoPago{

    @Override
    public double calcularMonto(double monto) {
        return monto;
    }
    
}
