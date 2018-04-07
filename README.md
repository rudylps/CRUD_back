# Projet : réaliser un CRUD - côté BACK
## Prérequis
* ### Back
	* Cloner [mon repo](https://github.com/rudylps/CRUD_back)
	* Java
	* Maven
	* SGBDR MySQL
	* data.sql récupération des données
	* schema.sql pour créer la base de données et des tables
	* Modifier le fichier *src/main/resources/application.properties* en changeant les champs  
	``spring.datasource.username=``  
	``spring.datasource.password=``
* ### Front
	* Cloner [mon repo](https://github.com/rudylps/CRUD_front)
	* NodeJS
## Lancement
* Sous *Eclipse*, importer le projet back  
``Import...``  
``Existing Maven Projects`` 
Clic droit sur le fichier *src/main/java/co.simplon.Application.java*  
``Run As``  
``Spring Boot App``  
* Sous *Visual Studio Code*, importer le projet front  
``Ouvrir le dossier`` 
Dans le terminal, inscrire  
``npm install``  
``npm install @angular/cli @lastest``  
``ng serve``
* Sous un navigateur web de votre choix, inscrire l'adresse  
[localhost://4200](http://localhost:4200/)
------
## Présentation
Ce projet permet d'afficher une liste de personnes (*read*), d'y ajouter des personnes (*create*), de les éditer (*update*) ou de les supprimer (*delete*).  
Ceci est une partie destinée à intégrer le projet commun PROJET FIL ROUGE pour simuler un logiciel de la police qui permet de lier des armes, véhicules, et personnes à des affaires judiciaires.
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
### . Avec Postman
Pour tester les méthodes en back, on utilise __Postman__ où on programme les requêtes qu'il teste
