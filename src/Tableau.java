import java.util.ArrayList;

public class Tableau<T extends Comparable<T>>
{

	public ArrayList<Comparable<T>> tab = new ArrayList<Comparable<T>>();
	
	public Tableau() 
	{
		
	}

	public void tri()
	{
		
		for (int i = 0 ; i < tab.size(); i++)
		{
			if (tab.get(i).compareTo((T) tab.get(i+1)) < 0)
			{
				
			}
			if (tab.get(i).compareTo((T) tab.get(i+1)) == 0)
			{
				
			}
			if (tab.get(i).compareTo((T) tab.get(i+1)) > 0)
			{
				
			}
		}
	}


		
	/* autre solution !!!
	 * 
	 * public class TabGenerique <A extends Comparable<A>>
	 * {
	 * 	private A[] tab;
	 * 
	 * TabGenerique();
	 * 
	 * public void tri()
	 * {
	 * 		if (tab[i].compareTo(tab[i]+1 >0)
	 * 		{
	 *      }
	 * }
	 * 
	 * public void afficher();
	 */


}
