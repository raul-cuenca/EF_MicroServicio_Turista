package pe.cuenca.service;

import java.util.List;

import pe.cuenca.model.Turista;

public interface TuristaService {
	
	void save(Turista c);	

	List<Turista> get();
}
