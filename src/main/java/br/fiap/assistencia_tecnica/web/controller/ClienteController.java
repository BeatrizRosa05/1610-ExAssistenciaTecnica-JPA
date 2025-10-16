package br.fiap.assistencia_tecnica.web.controller;

import br.fiap.assistencia_tecnica.service.ClienteService;
import br.fiap.assistencia_tecnica.web.dto.ClienteDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    //RequestBody - Indica que vai "quebrar" o JSON em um objeto clienteDTO
    public void cadastrar(@RequestBody ClienteDTO clienteDTO){

    }
}
