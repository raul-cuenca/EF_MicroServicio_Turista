package pe.cuenca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.cuenca.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer> {

}
