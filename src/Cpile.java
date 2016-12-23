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

	//retourne l'élément en sommet de la pile et dépile
	@Override 
	public A depile() 
	{
		
		return list.pollLast();
	}

	//retourne l'élément au sommet de la pile mais ne le retire pas
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
