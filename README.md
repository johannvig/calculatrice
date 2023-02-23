# calculatrice


Ce programme est une calculatrice simple en Java utilisant une pile pour stocker les valeurs et effectuer des opérations arithmétiques de base. Le programme utilise la classe "Pile" pour créer une pile et stocker les valeurs entrées par l'utilisateur. Le programme permet à l'utilisateur d'entrer autant de valeurs qu'il le souhaite, y compris des opérateurs et des nombres.

Instructions d'utilisation:


Pour utiliser le programme, exécutez le fichier "calculatrice.java" à partir d'un environnement de développement Java. Lorsque le programme est exécuté, l'utilisateur est invité à entrer le nombre total de valeurs qu'il souhaite entrer, y compris les opérateurs. L'utilisateur est ensuite invité à entrer chaque valeur un par un, soit un opérateur (+, -, /, *), soit un nombre entier.

Fonctionnement du programme:


Le programme utilise une pile pour stocker les valeurs entrées par l'utilisateur. Lorsque l'utilisateur entre un nombre, le programme l'empile sur la pile. Lorsque l'utilisateur entre un opérateur, le programme dépile les deux dernières valeurs de la pile et effectue l'opération correspondante (+, -, /, *), puis empile le résultat sur la pile.

Si l'utilisateur entre un opérateur et qu'il n'y a pas au moins deux valeurs sur la pile, le programme affiche un message d'erreur. Si l'utilisateur entre une valeur et que la pile est pleine, le programme affiche également un message d'erreur.

Exemples d'utilisation:

Entrer 3 valeurs: 5, 3, +
Résultat attendu: 8
Entrer 4 valeurs: 2, 3, 4, *
Résultat attendu: 24
Entrer 5 valeurs: 4, 2, 5, *, -
Résultat attendu: 6
