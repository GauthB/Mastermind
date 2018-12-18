# Mastermind
Projet Java
Number MasterMind 

Membres du groupe

- Hermant Thibaut	2TL1
- Bohyn Gauthier	2TL1
- Meyers Humbert	3TL1 (2TL1 pour les cours de 2ème)

Choix technique 	Client / Serveur

Modes

Solo 

-	L’application génère aléatoirement la combinaison de 4 chiffres.
-	L’ordinateur corrige lui-même le joueur grâce aux résultats qu’il renvoi, il répond par V (Chiffre bonne place), / (Chiffre existant mais pas à la bonne place), X(Chiffre n’existant pas) . 
-	Il y a 3 modes possibles :
o	Easy = 12 tentatives  
o	Normal = 9 tentatives 
o	Hard = 5 tentatives


Solo with PC

-	L’application génère aléatoirement la combinaison de 4 chiffres.
-	L’ordinateur corrige lui-même le joueur et la combinaison imaginée par l’ordinateur grâce aux résultats qu’il renvoi, il répond par V (Chiffre bonne place), / (Chiffre existant mais pas à la bonne place), X(Chiffre n’existant pas) . 
-	Attention, vous voyez les résultats de l’ordinateur, cela veut dire que l’ordinateur peut aussi voir vos résultats !
-	Vous avez 12 chances maximum.


Multi

-	Les 2 joueurs sont connectés en réseau sur 2 appareils différents mais sur le même réseau.
-	L’application génère aléatoirement la combinaison de 4 chiffres (elle est la même pour les 2 joueurs !!) 
-	Chaque joueur doit trouver la combinaison le plus rapidement possible car le gagnant est le premier à l’avoir trouvé !
-	Le nombre de tentatives est fixé à 12. Chaque joueur pourra visualiser le jeu de l’autre en direct (donc une possibilité de tricherie … ).
-	Arrivé à la fin des 12 coups, la partie est finie pour ce joueur.



Affichage en Console/GUI
La combinaison de couleurs est remplacée par des chiffres
Les pions rouges deviennent -> O
Blancs deviennent -> /
Si le chiffre n’est pas dans la combinaison -> X

Améliorations possibles

Créer une base de données qui retient les scores (dépend de combien de manche que l’on souhaite faire) (ça peut être un fichier texte) 
Mettre un temps max entre 2 tentatives
Mettre des couleurs dans l'interface graphique 
Il y aura surement des améliorations ou des modifications en fonction de l’avancement du projet...
