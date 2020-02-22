package Ex1Imposto;

public class Irpf {
	private double salarioBruto;
	
	public Irpf(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double calcularDesconto() {
		if(salarioBruto <= 1903.98) 
		{
			return 0.0;
		}else if(salarioBruto <= 2826.65 || salarioBruto >= 1903.99){
			return this.salarioBruto*0.075+142.80;
		}else if(salarioBruto <= 3751.05  || salarioBruto >= 2826.66){
			return this.salarioBruto*0.15+354.80;
		}else if(salarioBruto <= 4664.68  || salarioBruto >= 3751.06){
			return this.salarioBruto*0.225+636.13;
		}else if(salarioBruto >= 4664.69){
			return this.salarioBruto*0.275+869.36;
		}
		return 0.0;
	}
}
