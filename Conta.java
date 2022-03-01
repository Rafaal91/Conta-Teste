package conta;

public class Conta {
	
		
		double saldo; 
		int agencia; 
		int numero; 
		String titular; 
		

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("foi depositado o valor de:" + valor);
		
	}
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
		System.out.println("foi sacado o valor de:" + valor);
		
	}
	

}
