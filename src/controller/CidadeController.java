package controller;

import model.Cidade;
import repository.CidadeRepository;

public class CidadeController {
    private CidadeRepository cidadeRepository;

    // Construtor
    public CidadeController(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    // CRUD: Cadastrar Cidade (Create)
    public void cadastrarCidadeController(Cidade cidade) {
        cidadeRepository.cadastrarCidade(cidade);
    }

    // CRUD: Listar Cidades (Read)
    public Cidade[] listarCidadesController() {
        return cidadeRepository.listarTodasCidades();
    }

    // CRUD: Buscar Cidade por ID (Read)
    // Usado pelo VeiculoController na simulação de rota
    public Cidade buscarCidadePorIdController(int id) {
        return cidadeRepository.buscarPorId(id);
    }

    // CRUD: Atualizar Cidade (Update)
    public boolean atualizarCidadeController(int id, Cidade cidadeAtualizada) {
        return cidadeRepository.atualizarCidade(id, cidadeAtualizada);
    }

    // CRUD: Apagar Cidade (Delete)
    public boolean apagarCidadeController(int id) {
        return cidadeRepository.apagarCidade(id);
    }
}
