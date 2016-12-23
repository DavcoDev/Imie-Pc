
public interface IPile <A>{

	
	
	public abstract boolean estVide() ;
	
	public abstract void empile(A a) ;
	
	public abstract A depile() ; 
	//retourne l'élément en sommet de la pile et dépile
	
	 int nbElements();
	
	 A sommet() ; 
	//retourne l'élément au sommet de la pile mais ne le retire pas
	
	public abstract void afficherPile();
}
