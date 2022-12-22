package pile;
	
public class PileParTableau implements Pile{
		private int TAILLEMAX = 100; 
		private int sommet; 
		private Object [] tabPile;
		
	//si on prend la taillemax de 100
	public PileParTableau(){
		sommet=-1;
		tabPile = new Object[TAILLEMAX];
	}
	
	//si on veut une taillemax personnalisée
	public PileParTableau(int max){
		TAILLEMAX=max;
		sommet=-1;
		tabPile = new Object[TAILLEMAX];
		
	}
	
	//retourne si la pile est vide ou pas 	
	public boolean pileVide(){	
		
		
		if (sommet == -1){
				return true;
			}
			return false;
			
		} 
	
	//retourne si la pile est pleine ou pas 
	public boolean pilePleine(){
		
		
		//si sommet est �gale � TAILLEMAX=1 alors la fonction retourne vraie
		if (sommet == TAILLEMAX+1){
			return true;
				}
		//sinon elle retorune faux
		return false;
		

	
		}
	
	//la fonction retourne le nombre d'�l�ments dans la pile
	//on fait sommet+1 car on part de 0
	public int longueur(){
	
		return (sommet+1);
			
	
		}
	
	//retourne le sommet de la pile
	public Object sommet(){
		
		//si la pile n'est pas vide alors la fonction retourne le sommet de la pile soit la valeur tout en haut
		if (! pileVide()) {
			return (tabPile[sommet]);
			}
		//sinon retourne le message "erreur"
		return "erreur";
		
			

		}
	
	//ajoute une valeur dans la pile en haut de celle-ci
	public void empiler(Object elem)throws pilePleineException{
		
		//si la pile n'est pas pleine alors on fait sommet+1
		//la fonction retorune la valeur que j'empile
		if (! pilePleine()){
			sommet++;
			tabPile[sommet]=elem;
			
			}
		
		//sinon lance la fonction pilePleineException
		else{
			throw new pilePleineException();
			}

	}
	
	//enl�ve la derni�re valeur de la pile soit celle en haut de la pile
	public Object depiler() throws pileVideException{
		
		//si la pile n'est pas vide alors on fait sommet-1 
		// la fonction retourne la valeur que je d�pile
		if (! pileVide()){
			sommet=sommet-1;
			return (tabPile[sommet+1]);
			
			}
		//sinon lance la focntion pileVideException
		else{
			throw new pileVideException();
			}

	}
	
}
	


