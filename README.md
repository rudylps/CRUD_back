# CRUD_back

## Présentation
### . Excercice
Il s'agit de réaliser un CRUD fonctionnel pour le projet FIL-ROUGE.  
Créer, Afficher, Modifier, Supprimer les éléments d'une base de donnée.
### . Outils
Pour réaliser la partie *back*, je me suis servi d'__Eclipse__.  
Afin d'y réaliser le CRUD, j'ai utilisé *Spring Boot* et *Hibernate*.
### . Réalisation
J'ai codé la partie __Personne__ du back
### . Forme - patron de conception MVC
__Model__ : c'est la classe qui définit les objets du model  
__Vue__ : c'est l'affichage des données.   
__Controller__ : récuppère les données de la bdd et les envoie vers la vue  

## Réalisation
### . Création d'une bdd
```CREATE DATABASE gedesaft_v2```
### . Projet
Mon projet est disponible sur mon [GitHub](https://github.com/rudylps/CRUD_back) 
### . Sous Eclipse
Dans le fichier *application.properties* du dossier *src/main/resources*, changer les accès avec son propre username et son propre password  
```spring.datasource.username=```  
```spring.datasource.password=```  

Ensuite, faire un clic droit sur le fichier *Application.java*, *Run As*, *Java Application*
### . Avec Postman
Pour tester les méthodes en back, on utilise __Postman__ où on programme les requêtes qu'il teste
