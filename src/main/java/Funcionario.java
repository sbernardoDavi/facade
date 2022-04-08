public class Funcionario {


    public boolean venderProduto(){
        return FuncionarioFacade.verificarPendencias(this);
    }
}
