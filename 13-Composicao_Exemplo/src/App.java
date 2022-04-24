import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.*;
import entities.enums.TrabalhadorNivel;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Dados do trabalhador:");
		System.out.print("Nome: ");
		String trabalhadorNome = sc.nextLine();
		System.out.print("Nivel: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Base Salarial: ");
		double baseSalarial = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(trabalhadorNome, TrabalhadorNivel.valueOf(nivelTrabalhador), baseSalarial, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos tem esse trabalhador? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Entre com um contrato #" + i);
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duracao (horas): ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com mês e ano para calcular o lucro (MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departmento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda para " + mesEAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
		
		sc.close();
    }
}
