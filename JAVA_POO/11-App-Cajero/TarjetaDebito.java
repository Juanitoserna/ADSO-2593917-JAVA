
public class TarjetaDebito{

	// Atributos
	private String numero;
	private String titular;
	private String password;
	private int saldo;


	// Metodos
	public TarjetaDebito(String numero, String titular, String password, int saldo){
		this.numero = numero;
		this.titular = titular;
		this.password = password;
		this.saldo = saldo;
	}

	public boolean disminuirSaldo(int valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// registrar en log de tarjeta
			return true;
		}else{
			// registrar en log de la tarjeta
			return false;
		}
	}
	public boolean cambiarClave(String nueva_clave){
		if(this.password.equals(nueva_clave)){
			return false;
		}else{
			this.password = nueva_clave;
			return true;
		}
	}

	public int getSaldo(){
		return this.saldo;
	}

	public void setSaldo(int saldo){
		this.saldo = saldo;
	}

	public String getNumero(){
		return this.numero;
	}

	public boolean verificarPassword(String password){
		return this.password.equals(password);
	}



}