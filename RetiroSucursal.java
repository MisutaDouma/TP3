package tienda.envio;

public class RetiroSucursal extends Envio {
    private String sucursal;

    public RetiroSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public double calcularCosto() {
        return 0;
    }

    @Override
    public String definirEntrega() {
        return "Retiro en sucursal: " + sucursal;   
    }

    public String getSucursal() {
        return sucursal;
    }
}
