package controller;
import model.Eletroposto;
import repository.EletropostoRepository;


public class EletropostoController {
    private EletropostoRepository eletropostoRepository;

    // Construtor
    public EletropostoController(EletropostoRepository eletropostoRepository){this.eletropostoRepository = eletropostoRepository;
    }

    // CRUD: Criar (Create)
    public void cadastrarEletropostoController(Eletroposto eletroposto){eletropostoRepository.cadastrarEletroposto(eletroposto);
    }

    // CRUD: Ler (Read)
    public Eletroposto[] listarEletropostoController(){
        return eletropostoRepository.listarEletropostos();
    }

    //CRUD: Buscar por ID:
    public Eletroposto buscarEletropostoPorIdController(int id) {return eletropostoRepository.buscarPorId(id);}

    // CRUD: Atualizar (Update)
    public boolean atualizarEletropostoController(int id, Eletroposto eletropostoAtualizado){return eletropostoRepository.atualizarEletroposto(id, eletropostoAtualizado);
    }

    // CRUD: Apagar (Apagar)
    public boolean apagarEletropostoController(int id){
        return eletropostoRepository.apagarEletroposto(id);
    }

}
