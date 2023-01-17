package es.studium.ejercicio6;

import java.time.LocalDateTime;

public class Principal
{

	public static void main(String[] args)
	{
		Pedido pedido1 = new Pedido(LocalDateTime.now(), "423857");
		
		Factura factura1 = new Factura(1, "2345G", pedido1);
		
		System.out.println("La fecha del pedido es: " + factura1.getPedido().getFecha() + " con referencia " + factura1.getPedido().getReferencia() + " cuyo número de factura es " + factura1.getNumeroFactura());
	}

}
