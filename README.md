[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/7RBkfkyJ)
# Devoir 02 : Personne et copains
## CONSIGNE :
Lisez `avec attention` et faites les points suivants avec précision et dans cet ordre :
### Première partie
- Faites en sorte qu'une `Personne` ait un nom et un prénom.
- Faites en sorte qu'on puisse demander à un objet `Personne` son nom et son prénom, mais qu'on ne puisse plus modifier ces informations une fois l'objet créé.
- Surchargez sa méthode `toString()` afin que l'affichage d'une personne se fasse de la manière suivante : "Alex TERRIEUR" (<- notez le nom en majuscules!)
- Dans le main() du programme :
  - Créez 3 personnes différentes chacune avec un nom et prénom différent.
  - Affichez ces 3 objets personne
### Deuxième partie
- Retouchez votre classe `Personne` et donnez-lui une constante nommée `MAX_COPAINS` de valeur 10.
- Ajoutez également le fait qu'une personne puisse avoir au maximum `MAX_COPAINS` copains (eux aussi de simples personnes).
- Ajoutez le savoir-faire suivant à tout objet personne : on doit pouvoir tenter de rajouter une personne à sa liste de copains. De même, on doit aussi pouvoir tenter de supprimer une personne de sa liste de copains existante. Réfléchissez à la signature de ces deux méthodes et soignez notamment leur nom en utilisant un verbe d'action. Lisez bien la consigne car le choix des mots y est voulu et précis :
  - Par "tenter" d'ajouter on entend en toute logique le fait qu'on ne pourra pas éternellement rajouter des copains (puisque la place est limitée).
  - Par "tenter" de supprimer un copain de la liste, en toute logique encore faut-il qu'il s'agisse déjà d'un copain.
- Modifiez sa méthode `toString()` afin que l'affichage d'une personne se fasse de la manière suivante : "Alex TERRIEUR et ses copains ()" si la liste de ses copains est vide ou sinon "Alex TERRIEUR et ses copains (John D'OEUF, Mac HARONI, Alain TERRIEUR)"
- Dans le main() du programme :
  - Rajoutez des copains à l'une ou l'autre de vos personnes avant de leur affichage

## RESTITUTION :
1. Rendre ce devoir normalement par `push` GitHub
