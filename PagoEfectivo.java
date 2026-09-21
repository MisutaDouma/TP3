package tienda.Pago;

public class PagoEfectivo implements TipoPago{

    @Override
    public double calcularMonto(double monto) {
        return monto;
    }
    
}
