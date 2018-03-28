package co.simplon.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.ModelEntity.PersonneModel;

// l'Interface IRepositoryPersonne fait appel à JpaRepository qui possède déjà les requêtes

public interface IRepositoryPersonne extends JpaRepository<PersonneModel, Long>{

}
