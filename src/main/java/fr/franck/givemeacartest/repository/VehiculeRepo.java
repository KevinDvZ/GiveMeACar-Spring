package fr.franck.givemeacartest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.franck.givemeacartest.model.Vehicules;

@Repository
public interface VehiculeRepo extends JpaRepository<Vehicules, Integer> {
	Vehicules findById(int id);
//	List<Vehicules> findAll();
	
}
