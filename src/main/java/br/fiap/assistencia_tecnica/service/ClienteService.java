package br.fiap.assistencia_tecnica.service;

import br.fiap.assistencia_tecnica.domain.Cliente;
import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.repository.ClienteRepository;
import br.fiap.assistencia_tecnica.repository.EquipamentoRepository;
import br.fiap.assistencia_tecnica.web.config.SenhaConfig;
import br.fiap.assistencia_tecnica.web.dto.ClienteDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repository;
    private final EquipamentoRepository equipamentoRepository;
    /// SENHA CONFIG CRYPTO
    private final SenhaConfig senhaConfig;

    public ClienteService(ClienteRepository repository, EquipamentoRepository equipamentoRepository, SenhaConfig senhaConfig) {
        this.repository = repository;
        this.equipamentoRepository = equipamentoRepository;
        this.senhaConfig = senhaConfig;
    }

    public Cliente cadastrar (ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefone(clienteDTO.getTelefone());
        //cliente.setSenha(clienteDTO.getSenha());
        /// SENHA CONFIG
        cliente.setSenha(senhaConfig.encoder().encode(clienteDTO.getSenha()));
        return repository.save(cliente);
    }

    public List<Cliente> listar (){
        return repository.findAll();
    }

    public Cliente buscarPorId(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Equipamento> listarEquipamentoPorCliente(Long id){
        return equipamentoRepository.findByClienteId(id);
    }
}

