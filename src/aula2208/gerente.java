package aula2208;

public class gerente extends funcionario {
	
	protected double adicional;
	@Override
	public double getBonificacao() {
		return this.salario*0.15 + this.adicional;
	}
}
                                          