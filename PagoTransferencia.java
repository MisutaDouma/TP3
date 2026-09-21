package tienda.Pago;

public class PagoTransferencia implements TipoPago{

    @Override
    public double calcularMonto(double monto) {
        return monto- (monto * 0.05);
    }
    
};
