package Polimorfismo;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Thor", "M", "Qualquer");
		lobo.emitirSom();
		
		Leao leao = new Leao("Lyon", "M", "Qualquer");
		leao.emitirSom();
		
		Tigre tigre = new Tigre("Tigresa", "F", "Qualquer");
		tigre.emitirSom();
		
		Cachorro cachorro = new Cachorro("Dog", "F", "Qualquer");
		cachorro.emitirSom();
	}

}
