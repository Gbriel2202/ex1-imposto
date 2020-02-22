package Ex1Imposto;

import java.util.Scanner;

public class CalculadoraManual {

	public static void main(String[] args) {
		double salarioLiquido = 0.0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite seu salário");
		double salarioBruto = Double.parseDouble(keyboard.nextLine());
		keyboard.close();
		// Implemente aqui
		Inss inss = new Inss(salarioBruto);
		double descontoInss = inss.calcularDesconto();
		Irpf irpf = new Irpf(salarioBruto - descontoInss);
		double descontoIrpf = irpf.calcularDesconto();
		salarioLiquido = salarioBruto - descontoInss - descontoIrpf;	
		System.out.println("Desconto INSS: " + descontoInss);
		System.out.println("Desconto IRPF: " + descontoIrpf);
		System.out.println("Salario Liquido: " + salarioLiquido);
	}
	
}
