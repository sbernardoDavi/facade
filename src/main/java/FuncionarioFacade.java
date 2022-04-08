public class FuncionarioFacade {

    public  static  boolean verificarPendencias(Funcionario funcionario) {
        if (Loja.getInstance().verificarPendencias(funcionario)) {
                return false;
            }
        if (Estoque.getInstance().verificarPendencias(funcionario)){
            return false;
        }
            return true;
        }
}
