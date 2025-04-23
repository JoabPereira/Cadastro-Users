package org.example.cadastrousers.repository;

import org.example.cadastrousers.model.Graficos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraficosRepository extends JpaRepository<Graficos, Long> {
}
