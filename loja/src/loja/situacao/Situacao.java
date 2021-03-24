package loja.situacao;

import loja.PedidoInterface;

public abstract class Situacao{
	
	public abstract void abrirChamado(PedidoInterface pedido);
	
	public void pagar(PedidoInterface pedido) {
		throw new StateException("não pode transitar para pago");
	}
	
	public void entregar(PedidoInterface pedido) {
		throw new StateException("não pode transitar para entregue");
	}
	
	public void cancelar(PedidoInterface pedido) {
		throw new StateException("não pode transitar para cancelado");
	}
	
	public void reabrir(PedidoInterface pedido) {
		throw new StateException("não pode transitar para aberto");
	}
	
}
