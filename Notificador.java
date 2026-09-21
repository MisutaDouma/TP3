package tienda.notificacion;

import tienda.modelo.Cliente;

public interface Notificador {
    public void notificar(Cliente cliente, String mensaje);
}
