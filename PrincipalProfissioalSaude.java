package Polimorfismo;

public class PrincipalProfissioalSaude {

	public static void main(String[] args) {
		
		ProfissionalSaude medico = new Medico("Dr. João", "Cardiologista", 300, "123456");
		ProfissionalSaude dentista = new Dentista("Dra. Ana", "Ortodontista", 200, "654321");
		ProfissionalSaude fisioterapeuta = new Fisioterapeuta("Dr. Pedro", "Fisioterapia Esportiva", 250, "987654");

		medico.agendarConsulta();        
		dentista.agendarConsulta();      
		dentista.agendarConsulta(); 

	}
}