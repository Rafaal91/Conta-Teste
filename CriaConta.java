package conta;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta contaRafael = new Conta();
		contaRafael.saldo = 200;
		
		System.out.println(contaRafael.saldo);
		contaRafael.saldo += 100;
		
		System.out.println(contaRafael.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
	segundaConta.deposita(50);
	segundaConta.sacar(25);
	System.out.println(segundaConta.saldo);
		
	}

}
