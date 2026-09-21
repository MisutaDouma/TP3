package tienda.envio;

public class EnvioDomicilio extends Envio {
    private String domicilio;

    public EnvioDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public double calcularCosto() {
        return 2500;
    }

    @Override
    public String definirEntrega() {
        return domicilio;
    }
}
