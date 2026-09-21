package tienda.notificacion;

import tienda.modelo.Cliente;

public class PushNotificador implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensaje) {
        System.out.println("Notificación push enviada a " + cliente.getNombre() + ": " + mensaje);
    }
    
}
