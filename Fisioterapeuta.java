package Polimorfismo;

public class Fisioterapeuta extends ProfissionalSaude {
	
	private String crefito;

	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.crefito = crefito;
	}
	@Override
	public void agendarConsulta() {
		System.out.println("Consulta agendada com o fisioterapeuta: " + nome + " (CREFITO: " + crefito + ")");
	}
}