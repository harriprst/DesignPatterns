package StatePattern;

public class Mn {
    public static void main(String[] args) {
        GameType lotto = new Lotto();
        GameType num = new Number();

        GameTypeStratergy gameTypeStratergy = new  GameTypeStratergy();


        gameTypeStratergy.setGameType(lotto);
        gameTypeStratergy.callRpc();

        gameTypeStratergy.setGameType(num);
        gameTypeStratergy.callRpc();
    }
}
