
public class Personne implements ElementAvecPriorite
{
	private String nom ;
	private int priorite;
	private int age;

	
	public Personne()
	{
		
	}
	
	public Personne(String n, int a) 
	{
		nom = n ; 
		age = a;
		priorite = priorite();
	}
	
	
	public String toString() 
	{
		return nom + " " + age;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public int getPriorite() {
		return priorite;
	}

	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}

	@Override
	public int priorite() {
		
		if (this.age > 0 && this.age <=12) priorite = 1;
		
		else if (this.age >= 60) priorite = 2;
				
		else priorite = 3;
		
		return priorite;
	}
}
