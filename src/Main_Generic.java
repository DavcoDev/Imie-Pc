
public class Main_Generic {

	
	public static void main(String[] args) {
		
		try
		{
			System.out.println("ok");
			int a = 5/0;
			System.out.println("ko");
		}
		
		catch (ArithmeticException e) {
			System.out.println("on ne peut diviser pas 0 !");
		}

//		System.out.println(a);
		
//		Cpile<String>cpil = new Cpile<>();
//		System.out.println(cpil.estVide());
//		cpil.empile("david");
//		cpil.empile("12");
//		System.out.println(cpil.estVide());
//		System.out.println(cpil.nbElements());
//		cpil.depile();
//		System.out.println(cpil.nbElements());
//		
//		cpil.empile("david");
//		cpil.empile("12");
//		cpil.empile("david");
//		cpil.empile("12");
//		
//		System.out.println(cpil.nbElements());
//		cpil.depile();
//		System.out.println(cpil.sommet());
//		System.out.println();
//		cpil.afficherPile();
//		
//		
//		FileAttente<Personne> file1 = new FileAttente<>();
//		Personne p1 = new Personne("dav", 20);
//		Personne p2 = new Personne("Mig", 50);
//		Personne p3 = new Personne("Al", 10);
//		Personne p4 = new Personne("Doug", 30);
//		Personne p5 = new Personne("Kev", 60);
//		System.out.println(file1.estVide());
//		file1.entre(p1);
//		
		
	}

	
}
