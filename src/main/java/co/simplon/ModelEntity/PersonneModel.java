package co.simplon.ModelEntity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // indique que la classe est persistante, prend l'attribut personne en nom.
@Table(name = "personne")
public class PersonneModel implements Serializable{
	

	@Id // Mappe la clé primaire sur le champ ID de personne.
	@GeneratedValue(strategy = GenerationType.AUTO)
	// genere une cle primaire dès l'implémentation à l'élément personne via la table hibernate_sequence de hibernate.
	private Long id;
	@Column(length=40) //  indique des options de la colonne de la database.
	private String nom;
	@Column(length=40) // length=40 peut accepter un champ de 40 caracteres.
	private String prenom;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
		
}
