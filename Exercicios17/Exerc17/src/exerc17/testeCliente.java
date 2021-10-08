package exerc17;

public class testeCliente {

	public static void main(String[] args) {
		
		Cliente[] lista = new Cliente[4];
		
		lista[0] = new Cliente("Paulo Silva", 1001,"Reservado");
		lista[1] = new Cliente("Paulo Silva", 1002,"Não Reservado");
		lista[2] = new Cliente("Paulo Silva", 1003,"Não Reservado");
		lista[3] = new Cliente("Paulo Silva", 1004,"Reservado");
		
		for(Cliente roda:lista) {
			roda.imprimir();
		}
		System.out.println("\n------------------------------");
		for(Cliente roda:lista) {
			//roda.confirmarReserva(0);
			roda.imprimir();
		}
	}
}
