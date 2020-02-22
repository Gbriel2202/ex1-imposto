package Ex1Imposto;

public class Inss {
	private double salarioBruto;
	
	public Inss(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double calcularDesconto() {
		if(salarioBruto <= 1693.72) 
		{
			return this.salarioBruto*0.08;
		}else if(salarioBruto <= 2822.90 || salarioBruto >= 1696.73){
			return this.salarioBruto*0.09;
		}else if(salarioBruto <= 5645.80  || salarioBruto >= 2822.91){
			return this.salarioBruto*0.11;
		}else if(salarioBruto >= 5645.81){
			return 621.04;
		}
		return 0.0;
	}
}
