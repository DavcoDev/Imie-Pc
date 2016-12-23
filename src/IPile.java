
public interface IPile <A>{

	
	
	public abstract boolean estVide() ;
	
	public abstract void empile(A a) ;
	
	public abstract A depile() ; 
	//retourne l'�l�ment en sommet de la pile et d�pile
	
	 int nbElements();
	
	 A sommet() ; 
	//retourne l'�l�ment au sommet de la pile mais ne le retire pas
	
	public abstract void afficherPile();
}
