import controller.CidadeController;
import controller.EletropostoController;
import controller.RotaController;
import controller.VeiculoController;
import repository.CidadeRepository;
import repository.EletropostoRepository;
import repository.VeiculoRepository;
import view.Menu;

public class Main {
    public static void main(String[] args) {

        // Repositories
        VeiculoRepository veiculoRepository = new VeiculoRepository();
        CidadeRepository cidadeRepository = new CidadeRepository();
        EletropostoRepository eletropostoRepository = new EletropostoRepository();

        // Controllers
        VeiculoController veiculoController = new VeiculoController(veiculoRepository);
        CidadeController cidadeController = new CidadeController(cidadeRepository);
        EletropostoController eletropostoController = new EletropostoController(eletropostoRepository);

        // RotaController recebe os três controllers que precisa
        RotaController rotaController = new RotaController(veiculoController, cidadeController, eletropostoController);

        // View
        Menu menu = new Menu(veiculoController, eletropostoController, cidadeController, rotaController);
        menu.exibirMenuPrincipal();
    }
}
