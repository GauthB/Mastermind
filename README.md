# Mastermind
Projet Java
Number MasterMind 

Membres du groupe

- Hermant Thibaut	2TL1
- Bohyn Gauthier	2TL1
- Meyers Humbert	3TL1 (2TL1 pour les cours de 2ème)

Choix technique 	Client / Serveur



Application « Number MasterMind »
Règles de base

Le MasterMind de base se joue par 2. 
L’un choisit une combinaison de 4 couleurs parmi 6 couleurs possibles (il peut prendre plusieurs fois les mêmes)
L’autre a un certain nombre de tentatives possibles pour trouver la bonne combinaison
Après chaque tentatives le joueur qui a choisi la combinaison met un pion blanc pour chaque couleur étant dans la combinaison mais pas à la bonne place, un pion rouge pour chaque couleur étant dans la combinaison et à la bonne place et si une couleur n’y est pas, on laisse un vide à la place du pion.
La partie se termine donc lorsque le chercheur possède 4 pions rouge, donc la bonne combinaison.
S’il n’arrive pas à trouver la combinaison au bout de toutes les tentatives, C’est l’autre joueur qui gagne.



Modes

. Solo 
- L’application génère aléatoirement la combinaison de 4 couleurs 
- Elle corrige elle-même le joueur grâce aux pions de couleurs.
Il y a 3 modes possibles : → Easy = 12 tentatives
→ Normal = 9 tentatives
→ Hard = 5 tentatives 


Multi-joueurs 
Les 2 joueurs sont connectés en réseau sur 2 appareils différents
L’application génère aléatoirement la combinaison de 4 couleurs (elle est la même pour les 2 joueurs)
Chaque joueur doit trouver la combinaison le plus rapidement possible car le gagnant est le premier à l’avoir trouvé mais si aucun ne trouve c’est celui qui a finit toutes ces tentatives en premier qui gagne.
Le nombre de tentatives est fixé à 12. 
Chaque joueur pourra visualiser le jeu de l’autre en direct (donc une possibilité de tricherie 😊)


Affichage en Console/GUI
La combinaison de couleurs est remplacée par des chiffres
Les pions rouges deviennent -> O
Blancs deviennent -> /
Si le chiffre n’est pas dans la combinaison -> X

Améliorations possibles

Créer une base de données qui retient les scores (dépend de combien de manche que l’on souhaite faire) (ça peut être un fichier texte) 
Mettre un temps max entre 2 tentatives
Il y aura surement des améliorations ou des modifications en fonction de l’avancement du projet...
