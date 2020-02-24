/*Scott Cromling
COMP167
MP1
 */

public class Player {

    public int playerJerseyNumber;
    public int playerRanking;

    public Player(int playerJerseyNumber, int playerRanking){
        this.playerJerseyNumber = playerJerseyNumber;
        this.playerRanking = playerRanking;
    }

    public int getPlayerJerseyNumber(){
        return playerJerseyNumber;
    }

    public void setPlayerJerseyNumber(int playerJerseyNumber) {
        this.playerJerseyNumber = playerJerseyNumber;
    }

    public int getPlayerRanking() {
        return playerRanking;
    }

    public void setPlayerRanking(int playerRanking) {
        this.playerRanking = playerRanking;
    }

    public String toString()
    {
        return "Jersey number: "+playerJerseyNumber+ ",  Rating:"+playerRanking;
    }
}
