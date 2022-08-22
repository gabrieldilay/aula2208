package aula2208;

public class financeiro {
	protected double totalbonus;
	public void registraFuncionario(funcionario f) {
		this.totalbonus += f.getBonificacao();
	}
	
	public double getTotalBonus () {
		return this.totalbonus;
	}
	
}
