package org.example.cadastrousers.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.cadastrousers.Enum.StatusArquivo;
import org.example.cadastrousers.Enum.TipoArquivo;

import java.time.LocalDateTime;

@Entity
@Table(name = "arquivos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Arquivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_arquivo;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoArquivo tipoArquivo;

    @Column(nullable = false, length = 255)
    private String nomeOriginal;

    @Column(nullable = false, length = 500)
    private String caminhoArmazenado;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusArquivo status = StatusArquivo.PENDENTE;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dataEnvio = LocalDateTime.now();
}
