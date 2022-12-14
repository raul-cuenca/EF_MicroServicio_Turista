package pe.cuenca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.cuenca.model.Turista;
import pe.cuenca.repository.TuristaRepository;

@Service
public class TuristaServiceImpl implements TuristaService {

	@Autowired
	private TuristaRepository repositorio;

	@Override
	public void save(Turista c) {
		repositorio.save(c);

	}

	@Override
	public List<Turista> get() {
		return repositorio.findAll();
	}

}
