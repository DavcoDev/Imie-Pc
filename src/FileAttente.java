import java.util.ArrayList;
import java.util.Iterator;

public class FileAttente <T extends ElementAvecPriorite> 
{
	protected ArrayList<T> contenu = new ArrayList<T>() ;
	
	public FileAttente() 
	{
		
	}
	
	public void entre(T t) 
	{
		contenu.add(t);
		
	}
	
	public T sort() 
	{
		
		Iterator<T> it = contenu.iterator();
		boolean flag = false;
		T p = it.next() ;
		
		if(!contenu.isEmpty()) 
		{
			//p = contenu.get(contenu.size() - 1) ;
			//p = contenu.get(0);
//			Iterator<T> it = contenu.iterator();
//			boolean flag = false;
//			T p = it.next() ;
//			
			while(it.hasNext() && !flag)
			{

				if ( p.priorite() == 1)
				{
					contenu.remove(it.next()) ;
					flag = true;
				}
				else if ( p.priorite() == 2)
				{
					contenu.remove(it.next()) ;
					flag = true;
				}
				else 
				{
					contenu.remove(it.next()) ;
					flag = true;
				}
			}


		}
		return p ;
	}
	
	public boolean estVide() 
	{
		return contenu.isEmpty();
	}
	
	public String toString() 
	{
		return  " " + contenu;
	}

	
}
