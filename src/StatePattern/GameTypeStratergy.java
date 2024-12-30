package StatePattern;

public class GameTypeStratergy {
    public GameType gameType;

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public void callRpc(){
        this.gameType.enterWinningNumber();
        this.gameType.verifyWinningNumber();
    }
}
