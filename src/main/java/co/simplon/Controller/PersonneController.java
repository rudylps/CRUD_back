package co.simplon.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ModelEntity.PersonneModel;
import co.simplon.Repository.IRepositoryPersonne;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class PersonneController {

	
	@Autowired // l'annotation permet de spécifier une variable d'instance à renseigner par Spring
	private IRepositoryPersonne iRepositoryPersonne;
	
	
	// affiche la liste des personnes créées
	// Requête sql : SELECT * FROM listePersonnes
	@GetMapping(value="/personnes")
	public List<PersonneModel> GetPersonne() {
		
		return iRepositoryPersonne.findAll();
		
	}
	
	// création d'une personne
	// Requête sql : INSERT INTO 'personne' VALUES ('nom','prenom')
	@PostMapping(value="/ajoutPersonne") 
	public PersonneModel PostPersonne(@RequestBody PersonneModel personne) {
		return iRepositoryPersonne.save(personne);
	}
	

	// suppression d'une personne
	// Requête sql : DELETE FROM `personne` WHERE `id` = ?
	@DeleteMapping(value="/supprimePersonne/{id}")
	public void DeletePersonne(@PathVariable Long id) {
		iRepositoryPersonne.deleteById(id);
	}
	
	// affichage du détail d'une personne
	// Requête sql : SELECT FROM `personne` WHERE `id` = ?
	@GetMapping(value="personne/{id}")
	public Optional<PersonneModel> GetPersonne(@PathVariable Long id) {
		return iRepositoryPersonne.findById(id);
	}

	// édition d'une personne
	// Requête sql : UPDATE personne SET nom = 'exemple_nom', prenom = 'exemple_prenom' WHERE id = ?
	@PutMapping(value="/personne/edit/{id}") 
	public PersonneModel editPersonne(@RequestBody PersonneModel personne,@PathVariable Long id) {
		PersonneModel personneToUpdate = iRepositoryPersonne.getOne(id);
		personneToUpdate.setNom(personne.getNom());
		personneToUpdate.setPrenom(personne.getPrenom());
		
		return iRepositoryPersonne.save(personneToUpdate);
	}
}
