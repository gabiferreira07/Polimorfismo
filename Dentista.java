package Polimorfismo;

public class Dentista extends ProfissionalSaude{

	private String cro;

	public Dentista(String nome, String especialidade, int valorConsulta, String cro) {
		super(nome, especialidade, valorConsulta);
		this.cro = cro;
	}

	@Override
	public void agendarConsulta() {
		System.out.println("Consulta agendada com o dentista: " + nome + " (CRO: " + cro + ")");
	}

}
