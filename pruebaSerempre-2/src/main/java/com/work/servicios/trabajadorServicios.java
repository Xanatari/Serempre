package com.work.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.entity.Trabajador;
import com.work.repository.trabajadorRepo;

@Service
public class trabajadorServicios {
	
	@Autowired
	private trabajadorRepo repo;
	
	
	public List<Trabajador> listAll(){
		return repo.findAll();
	}
	
	public void save(Trabajador trabajador) {
		System.out.println(trabajador.getIdTarea());
		System.out.println(trabajador.getDescripcion());
		System.out.println(trabajador.getTitulo());
		repo.save(trabajador);
	}
	
	public Trabajador get(String id){
		return repo.findById(id).get();
	}
	public void delete(String id) {
		repo.deleteById(id);
	}
}