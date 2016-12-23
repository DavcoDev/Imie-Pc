import java.util.LinkedList;

public class Cpile<A> implements IPile<A> {

//	public A a;
	public LinkedList<A> list = new LinkedList<A>();
	
	
	public Cpile() {
		
	}

	@Override
	public boolean estVide() 
	{
		boolean verif = false;
		
		if (list.size() == 0) verif = true ;
		
		return verif;
	}

	@Override
	public void empile(A a) 
	{
		list.add(a);
		
	}

	//retourne l'�l�ment en sommet de la pile et d�pile
	@Override 
	public A depile() 
	{
		
		return list.pollLast();
	}

	//retourne l'�l�ment au sommet de la pile mais ne le retire pas
	@Override
	public A sommet() 
	{
		
		return list.getLast();
	}


	@Override
	public int nbElements() 
	{
		return list.size();
	}

	@Override
	public void afficherPile() {
		
		for(A a : list)
		{
			System.out.println(a);
		}
	}

	
}
