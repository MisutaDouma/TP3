package tienda.notificacion;

import tienda.modelo.Cliente;

public class EmailNotificador implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensaje) {
        System.out.println("Enviando correo a " + cliente.getEmail() + " con el mensaje: " + mensaje);
    }
    
}
