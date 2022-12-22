package pile;

import pile.*;


public class calculatrice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//déclaration des variables
		String mot;
		

		System.out.print("nombre valeurs total comprenant les opératuers");
		int x = Clavier.lireInt();
		
		
		//créer un pile de dimension x
		Pile p = new PileParTableau(x);
		try {
			
			//fait autant de tour que le nombre de valeurs que l'utilisateur veut
			for (int i=0; i<x;i++){
				
				//entre chaque nombres et opérateurs un par un séparémment
				System.out.print("entre ta valeur");
				mot = Clavier.lireString();
				
				//si la valeur est un opérateur
				if (mot.equals("+")||mot.equals("-")||mot.equals("/")||mot.equals("*")){
					System.out.println("valeur = "+mot);
					
					//regarde s'il y a plus d'un nombre dans la pile pour faire l'opération
					if (p.longueur()>1){
						
						//si c'est + alors on dépile 2 fois et on additionne les 2 nombres désemplilés
						//et on empile le résultat
						if (mot.equals("+")){
							p.empiler((int)p.depiler()+(int)p.depiler());
							System.out.println("resultat = "+p.sommet());
						}
						
						// si c'est / alors on dépile 2 fois et on divise les 2 nombres désemplilés
						//et on empile le résultat
						else if (mot.equals("/")){
							p.empiler((int)p.depiler()/(int)p.depiler());
							System.out.println("resultat = "+p.sommet());
						}
						// si c'est * alors on dépile 2 fois et on multiplie les 2 nombres désemplilés
						//et on empile le résultat
						else if (mot.equals("*")){
							p.empiler((int)p.depiler()*(int)p.depiler());
							System.out.println("resultat = "+p.sommet());
						}
						// si c'est - alors on dépile 2 fois et on soustrait les 2 nombres désemplilés
						//et on empile le résultat
						else{
							p.empiler((int)p.depiler()-(int)p.depiler());
							System.out.println("resultat = "+p.sommet());
							
						}
					}
				}
				
				//si c'est un nombre alors on empile
				else{
	                System.out.println("Valeur empiler ="+mot);
	                p.empiler(Integer.parseInt(mot));}		
			}	
		}
			catch (pileVideException e1)
					{System.out.println(e1.message);
				
				}	
				
			catch (pilePleineException e2)
				{System.out.println(e2.message);
			}
			
			
			
		//affiche le résultat obtenu par la calculatrice
		System.out.println("resultat final = "+p.sommet());
		
		
	    }}
	
