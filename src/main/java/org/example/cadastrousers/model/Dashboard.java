package org.example.cadastrousers.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "dashboard")
@AllArgsConstructor
@NoArgsConstructor
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDashboard;

    @ManyToOne
    @JoinColumn(name = "id_arquivo", nullable = false)
    private Arquivo arquivo;

    @Column(nullable = false, length = 255)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @OneToMany(mappedBy = "dashboard", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Graficos> graficos;
}
