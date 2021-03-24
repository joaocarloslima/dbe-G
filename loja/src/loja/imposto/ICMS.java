package loja.imposto;

import java.math.BigDecimal;

import loja.PedidoInterface;

public class ICMS extends Imposto{

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calcular(PedidoInterface pedido) {
		BigDecimal valorDoImposto = pedido.getValor().multiply(new BigDecimal("0.1"));
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO; 
		
		if (outroImposto != null) valorDoOutroImposto = outroImposto.calcular(pedido);
		
		return valorDoImposto.add(valorDoOutroImposto);
	}

}
