public class Estoque extends Rh{

    private static Estoque estoque = new Estoque();

    private Estoque(){

    };

    public static Estoque getInstance(){
        return estoque;
    }
}
