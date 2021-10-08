package exerc17;

public class Cliente {

	//public static void main(String[] args) {
	
		private String nome;
		private int codigo;
		private String reserva;
		
		public Cliente(String n, int c, String r) {
					this.setNome(n);
					this.setCodigo(c);
					this.setReserva(r);
				}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getReserva() {
			return reserva;
		}
		public void setReserva(String reserva) {
			this.reserva = reserva;
		}
		/*public void confirmarReserva(String reservado) { 
			reserva = reservado;
			return reservado;
		} */
		public void imprimir() {
			System.out.println("\t"+nome+"\t"+codigo+"\t"+reserva);
		//Reserva: "+this.confirmarReserva());
		}
}
