package tienda.infra;

import tienda.modelo.Pedido;

public class InMemoryPedidoRepository implements PedidoRepository {

    @Override
    public void guardar(Pedido pedido) {
        System.out.println("Pedido " + pedido.getNumero()
                + " guardado en memoria");
    }
    
}
