package Polimorfismo;

public class PricipalFuncionario {

	public static void main(String[] args) {
		
		Funcionario fun = new Funcionario(1, "João", "(15)998801-2344", 123, "Rua Z");
		System.out.println(fun.getNome());
		System.out.println(fun.calcularSalario(10000.00, 1000));

		Horista hor = new Horista(2, "Pedro", "(15)998854-3210", 1234, "Rua X");
		System.out.println(hor.getNome());
		System.out.println(hor.calcularSalario(100, 200));
		
		Jornada jor = new Jornada(3, "Marcondes", "(15)998876-8324", 1432, "Rua Y");
		System.out.println(jor.getNome());
		System.out.println(jor.calcularSalario(150, 220));
		
		ConsultorPj con = new ConsultorPj(4, "Ribeiro", "(15)998863-7321", 1324, "Rua D");
		System.out.println(con.getNome());
		System.out.println(con.calcularSalario(40000, 5000));
	}

}
