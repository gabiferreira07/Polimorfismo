package Polimorfismo;

public class ConsultorPj extends Funcionario{

	public ConsultorPj (int id, String nome, String telefone, int matricula, String endereco){
		super(id,nome, telefone, matricula, endereco);
	}

	@Override
	public double calcularSalario(double valorTotal, double imposto) {
		return valorTotal - imposto;
	}
}