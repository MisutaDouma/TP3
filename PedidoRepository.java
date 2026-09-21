package tienda.infra;

import tienda.modelo.Pedido;

public interface PedidoRepository {
    public void guardar(Pedido pedido);
}
