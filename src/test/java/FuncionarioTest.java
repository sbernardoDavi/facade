import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    public void deveRetornarFuncionarioComPendenciaLojVenda(){
        Funcionario funcionario = new Funcionario();
        Loja.getInstance().addFuncionarioPendente(funcionario);

        assertEquals(false, funcionario.venderProduto());
    }

    @Test
    public void deveRetornarFuncionarioComPendenciaEstoqueVenda(){
        Funcionario funcionario = new Funcionario();
        Estoque.getInstance().addFuncionarioPendente(funcionario);

        assertEquals(false, funcionario.venderProduto());
    }

    @Test
    public void deveRetornarFuncionarioSemPendenciaVenda(){
        Funcionario funcionario = new Funcionario();

        assertEquals(true, funcionario.venderProduto());
    }


}