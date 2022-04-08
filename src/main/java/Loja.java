public class Loja extends Rh{

    private static Loja loja = new Loja();

    private Loja(){

    };

    public static Loja getInstance(){
        return loja;
    }
}
