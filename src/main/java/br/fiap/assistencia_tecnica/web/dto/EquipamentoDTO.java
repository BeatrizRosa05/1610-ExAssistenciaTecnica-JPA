package br.fiap.assistencia_tecnica.web.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter  /// Nao precisa declarar os GETs e SETs
@Setter

public class EquipamentoDTO {

    private Long id;
    private Long idCliente;
    private String marca;
    private String modelo;
    private String tipo;
    private Long numeroSerie;
    private LocalDate dataCadastro;

}
