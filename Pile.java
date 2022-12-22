package pile;

public interface Pile {
	
	// Savoir si une pile est vide
	public boolean pileVide();
	// Savoir si une pile est pleine
	public boolean pilePleine();
	// Obtenir la longueur d�une pile
	public int longueur();
	// D�terminer la valeur du sommet d�une pile
	public Object sommet();
	//
	// Modificateurs
	//
	// Empiler une valeur au sommet d�une pile
	public void empiler(Object element) throws pilePleineException;
	// D�piler la valeur au sommet d�une pile
	public Object depiler() throws pileVideException;

}
