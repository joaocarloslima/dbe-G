package loja.imposto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public abstract class Imposto {
	
	protected Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		super();
		this.outroImposto = outroImposto;
	}

	public abstract BigDecimal calcular(PedidoInterface pedido);
	
}
