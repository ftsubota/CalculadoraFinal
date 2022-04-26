package programa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import interfaces.ICalculadora;

public class ExemploPrograma {	
	
	public static void main(String args[]) {
				
		Integer opc = 0;
		do {
			opc = menu();
			ArrayList<Double> entrada = menuEntradaDados();
			
			switch (opc) {
			case 1:
				Double data[] = new Double[entrada.size()];
				
				for (int i = 0; i < entrada.size(); i++) {
					data[i] = entrada.get(i);
				}
				
				System.out.println(verificaTipoEntrada(data));				
				
				Divisao d1 = new Divisao();
				System.out.println(d1.calcula(data));
				
				break;
			case 2:
				
				break;
			case 3:
				Double data3[] = new Double[entrada.size()];
				
				for (double i = 0; i < entrada.size(); i++) {
					for (double i3 = 0; i3 < entrada.size(); i3++) {
						data3[(int) i3] = entrada.get((int) i3 );
				}
				
				System.out.println(verificaTipoEntrada(data3));				
				
				Divis�o d3 = new Divis�o();
				System.out.println(d3.calcula(data3));
				break;
				}
			case 4:
				
				break;
			default:
				System.out.println("Finalizando a aplicação...");
				System.exit(0);
				break;
			}
		} while (opc != 0);
		
//		Exemplo das chamadas que deverão ser feitas
//		ICalculadora calculadora = new Soma();
//		ICalculadora calculadora = new Subtracao();
//		ICalculadora calculadora = new Divisao();
//		ICalculadora calculadora = new Multiplicacao();
//		
//		calculadora.calcular(null);
		
		
	}
	
	public static Integer menu() {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("=========  CALCULADORA   ==========\n");
		sb.append("===================================\n");
		sb.append("Digite 1 para realizar SOMA \n");
		sb.append("Digite 2 para realizar SUBTRAÇÃO \n");
		sb.append("Digite 3 para realizar DIVISÃO \n");
		sb.append("Digite 4 para realizar MULTIPLICAÇÃO \n");
		sb.append("Digite 0 para encerrar \n");
		
		System.out.println(sb.toString());
		Integer opc = scan.nextInt();
		return opc;
	}
	
	public static ArrayList<Double> menuEntradaDados() {
		ArrayList<Double> entrada = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("=========  Entrada de Dados   =====\n");
		sb.append("===================================\n");
		
		Integer usuarioQuerContinuar = 0;
		do {			
			System.out.println("Digite o número:");
			if (scan.hasNextDouble()) {
				entrada.add(scan.nextDouble());
			}			
			if (entrada.size() >= 2) {
				System.out.println("Você deseja iserir mais número? [0 - SIM | 1 - NÃO]");
				usuarioQuerContinuar = scan.nextInt();
			}
			
		} while (entrada.size() < 2 || usuarioQuerContinuar == 0);
	
		return entrada;
	}
	
	public static String verificaTipoEntrada(Double[] entrada) {
		// se todos forem inteiros deve retornar inteiro
		// se todos forem float devem retornar float
		// todos os outros casos devem retornar double
		Integer numeroEntradaInteiros = 0;
		Integer numeroEntradaFloat = 0;
		Integer numeroEntradaDouble = 0;
		for (int i = 0; i < entrada.length; i++) {
			
			double n = entrada[i];
			
			if ((int) n == n) {
				numeroEntradaInteiros++;
			} else if (Double.toString(n).split("\\.")[1].length() < 7) {
				numeroEntradaFloat++;
			} else {
				numeroEntradaDouble++;
			}			
		}
		
		if (numeroEntradaInteiros > 0 && numeroEntradaFloat == 0 && numeroEntradaDouble == 0) {
			return "inteiro";
		}
		
		if ((numeroEntradaInteiros > 0 || numeroEntradaInteiros == 0) && numeroEntradaFloat > 0 && numeroEntradaDouble == 0) {
			return "float";
		}
		
		return "double";
	}
}