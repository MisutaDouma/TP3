package tienda.notificacion;

import tienda.modelo.Cliente;

public class WspNotificador implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensaje) {
        System.out.println("Enviando mensaje de WhatsApp a " + cliente.getTelefono() + " con el mensaje: " + mensaje);
    }
    
}
