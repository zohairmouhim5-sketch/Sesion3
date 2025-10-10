package pkg;

public class Cuenta {

	private String numero;
	private Integer Saldo;
	private String titular;
	
	public Cuenta(int i)
	{
		Saldo = i;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Integer getSaldo() {
		return Saldo;
	}
	public void setSaldo(Integer saldo) {
		Saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void ingresar(int i) {
		Saldo+= i;
		
	}
	public boolean retirar(int i) {
		if (Saldo - i >= -500) {
            Saldo -= i;
            return true;
		
	}else {
		System.out.println("Fondos insuficientes (saldo " + Saldo + "€) en la cuenta " + numero + " para el reintegro de " + i + "€");
        return false;
	}
	
	}
}

