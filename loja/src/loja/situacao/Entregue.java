package loja.situacao;

import loja.PedidoInterface;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado(PedidoInterface pedido) {
		System.out.println("abrindo chamado para pos venda");
	}

}
