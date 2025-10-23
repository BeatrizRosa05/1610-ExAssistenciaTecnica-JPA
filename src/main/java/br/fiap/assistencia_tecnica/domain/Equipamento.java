package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "JAVA_EQUIPAMENTO")

public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EQUIP") //Nome que ta na tabela
    private Long id;

    //Muitos equipamentos podem pertencer a um cliente
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;
    private String tipo;
    private String marca;
    private String modelo;
    private String numeroSerie;
    private LocalDate dataCadastro;

}////////////////////////////////////////
