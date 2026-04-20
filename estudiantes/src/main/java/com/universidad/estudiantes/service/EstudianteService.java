package com.universidad.estudiantes.service;

import com.universidad.estudiantes.model.Estudiante;
import com.universidad.estudiantes.repository.EstudianteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstudianteService {

    private final EstudianteRepository repo;

    public EstudianteService(EstudianteRepository repo) {
        this.repo = repo;
    }

    public List<Estudiante> listarTodos() {
        return repo.findAll();
    }

    public Estudiante buscarPorId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("No encontrado"));
    }

    @Transactional
    public Estudiante guardar(Estudiante e) {
        return repo.save(e);
    }

    @Transactional
    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}