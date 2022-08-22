package aula2208;

public class teste {
	public static void main(String[] args) {
		porteiro f = new porteiro();
		gerente g = new gerente();
		
		f.salario =  1000;
		g.salario = 5000;
		g.adicional = 1000;
		
		financeiro fin = new financeiro();
		fin.registraFuncionario(g);
		System.out.println(fin.totalbonus);
		
		fin.registraFuncionario(f);
		System.out.println(fin.totalbonus);
		
	}
}
