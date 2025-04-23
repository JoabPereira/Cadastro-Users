package org.example.cadastrousers.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "configuracoes_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConfiguracaoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConfig;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private User user;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String preferencias;
}