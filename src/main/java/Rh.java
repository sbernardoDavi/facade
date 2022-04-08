import java.util.ArrayList;
import java.util.List;

public abstract class Rh {

    private List<Funcionario> funcionariosPendencias = new ArrayList<Funcionario>();

    public void addFuncionarioPendente(Funcionario funcionario){
        this.funcionariosPendencias.add(funcionario);
    }

    public  boolean verificarPendencias(Funcionario funcionario){
        return this.funcionariosPendencias.contains(funcionario);
    }
}


