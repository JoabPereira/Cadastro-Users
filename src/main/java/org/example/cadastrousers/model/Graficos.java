package org.example.cadastrousers.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.cadastrousers.Enum.TipoGrafico;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "graficos")
@AllArgsConstructor
@NoArgsConstructor
public class Graficos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGrafico;

    @ManyToOne
    @JoinColumn(name = "id_dashboard", nullable = false)
    private Dashboard dashboard;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoGrafico tipoGrafico;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String dadosJson;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataCriacao = LocalDateTime.now();
}
