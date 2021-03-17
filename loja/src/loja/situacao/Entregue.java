package loja.situacao;

import loja.Pedido;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("abrindo chamado para pos venda");
	}

}
