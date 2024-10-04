package Polimorfismo;

public class Medico extends ProfissionalSaude{

	private String crm;
	
	public Medico (String nome, String especialidade, int valorConsulta){
		super(nome, especialidade, valorConsulta);
		this.crm = crm;
	}
	@Override
	public void agendarConsulta() {
		System.out.println("Consulta agendada com o médico: " + nome + " (CRM: " + crm + ")");
	}
}
