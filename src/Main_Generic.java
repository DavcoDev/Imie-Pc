
public class Main_Generic {

	
	public static void main(String[] args) {
		
		Cpile<String>cpil = new Cpile<>();
		System.out.println(cpil.estVide());
		cpil.empile("david");
		cpil.empile("12");
		System.out.println(cpil.estVide());
		System.out.println(cpil.nbElements());
		cpil.depile();
		System.out.println(cpil.nbElements());
		
		cpil.empile("david");
		cpil.empile("12");
		cpil.empile("david");
		cpil.empile("12");
		
		System.out.println(cpil.nbElements());
		cpil.depile();
		System.out.println(cpil.sommet());
		System.out.println();
		cpil.afficherPile();
		
		
	}

	
}
