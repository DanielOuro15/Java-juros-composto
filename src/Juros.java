import java.text.DecimalFormat;
import java.util.Scanner;

public class Juros {
	
	
	
		public static void main(String[] args){
			
		String nome, cpf, rg, endereco, ec, data_nascimento, convenio;
		String numero_contrato, data_contrato;
		int mes;
		float juros, valor,residual;
		double dr, dv;
		
		Scanner ln = new Scanner(System.in);
		
//		System.out.println("----------Dados Pessoais----------");//Entrada de dados do cliente.
//		
//		System.out.print("Nome: ");
//		nome = ln.nextLine();
//		
//		System.out.print("CPF: ");
//		cpf = ln.nextLine();
//		
//		System.out.print("RG: ");
//		rg = ln.nextLine();
//		
//		System.out.print("Data de Nascimento: ");
//		data_nascimento = ln.nextLine();
//		
//		System.out.print("Endere�o: ");
//		endereco = ln.nextLine();
//		
//		System.out.print("Estado Civil: ");
//		ec = ln.nextLine();
//		
//		System.out.print("Conv�nio: ");
//		convenio = ln.nextLine();
		
		System.out.println("----------Contrato----------");//Entrada de dados do contrato.
		
		System.out.print("N�mero do Contrato: ");
		numero_contrato = ln.nextLine();
		
		System.out.print("Data do Contrato: ");
		data_contrato = ln.nextLine();
		
		System.out.println("----------C�lculos----------");//Entrada de dados dos calculos.
		
		System.out.print("Valor das Presta��es: R$");
		valor = ln.nextFloat();
		
		System.out.print("Quantas Presta��es: ");
		mes = ln.nextInt();
		
		System.out.print("Taxa de Juros: ");
		juros = ln.nextFloat();
		
		System.out.print("Residual: R$");
		residual = ln.nextFloat();
		
		System.out.print("Dias Vencidos: ");
		float dia = ln.nextInt();
		
		
		//C�lculos de juros composto.
		float t;
		double p, vl;
		t = valor * mes;
		juros = juros/100;
		dia = dia / 30;
		dr = Math.pow(juros+1, (dia))-1;

		
		p = (valor*((Math.pow(1 + juros, mes))-1)/(((Math.pow(1 + juros, mes)*juros))) + (residual/(Math.pow(1 + juros, mes))));
		dv = p * dr;
		vl = p + dv;

		System.out.println(" ");
		System.out.println("----------Dados Pessoais----------");//Saida de dados do cliente.
//		System.out.println("Nome: " + nome);
//		System.out.println("CPF: " + cpf);
//		System.out.println("RG: " + rg);
//		System.out.println("Data de Nascimento: " + data_nascimento);
//		System.out.println("Estado Civil " + ec);
//		System.out.println("Endere�o: " + endereco);
//		System.out.println("Conv�nio: " + convenio);
		System.out.println("----------Contrato----------");//Saida de dados do contrato.
		System.out.println("N�mero do Contrato: " + numero_contrato);
		System.out.println("Data do Contrato: " + data_contrato);
		System.out.println("----------C�lculos----------");//Saida de dados dos calculos.
		System.out.println("Valor � Vista: R$" + new DecimalFormat("#,##0.00").format(p));
		System.out.println("Valor Total: R$" + new DecimalFormat("#,##0.00").format(t));
		System.out.println("Valor da Quita��o: " + new DecimalFormat("#,##0.00").format(vl));

		
		}
}
