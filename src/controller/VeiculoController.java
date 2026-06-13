package controller;

import model.Veiculo;
import repository.CidadeRepository;
import repository.EletropostoRepository;
import repository.VeiculoRepository;

public class VeiculoController {
    private VeiculoRepository veiculoRepository;
    private EletropostoRepository eletropostoRepository;
    private CidadeRepository cidadeRepository;

    // Construtor
    public VeiculoController(VeiculoRepository veiculoRepository, EletropostoRepository eletropostoRepository, CidadeRepository cidadeRepository){
        this.veiculoRepository = veiculoRepository;
        this.eletropostoRepository = eletropostoRepository;
        this.cidadeRepository = cidadeRepository;
    }

    // CRUD: Cadastrar Veículo (Create)
    public void cadastrarVeiculoController(Veiculo veiculo){
        veiculoRepository.cadastrarVeiculo(veiculo);
    }

    // CRUD: Listar todos os Veículos  (Read)
    public Veiculo[] listarTodosVeiculosController(){
        return veiculoRepository.listarTodosVeiculos();
    }

    // CRUD: Buscar por ID:
    public Veiculo buscarVeiculoPorIdController(int id) {return veiculoRepository.buscarPorId(id);}

    // CRUD: Atualizar Veículo (Update)
    public boolean atualizarVeiculoController(int id, Veiculo veiculoAtualizado){return veiculoRepository.atualizarVeiculo(id, veiculoAtualizado);}

    // CRUD: Apagar Veículo (Delete)
    public boolean apagarVeiculoController(int id){
        return veiculoRepository.apagarVeiculo(id);
    }

    // CRUD: Simular autonomia:


}
