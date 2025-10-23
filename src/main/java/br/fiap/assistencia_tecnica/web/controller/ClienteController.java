package br.fiap.assistencia_tecnica.web.controller;

import br.fiap.assistencia_tecnica.domain.Cliente;
import br.fiap.assistencia_tecnica.repository.ClienteRepository;
import br.fiap.assistencia_tecnica.service.ClienteService;
import br.fiap.assistencia_tecnica.web.dto.ClienteDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    //RequestBody - Indica que vai "quebrar" o JSON em um objeto clienteDTO
    public Cliente cadastrar(@RequestBody ClienteDTO clienteDTO){
        return service.cadastrar(clienteDTO);

    }

    @GetMapping
    public List<Cliente> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }


}
