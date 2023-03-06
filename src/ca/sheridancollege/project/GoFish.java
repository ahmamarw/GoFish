package ca.sheridancollege.project;
import java.util.ArrayList;

/* Go Fish Card Game
 * @author Marwa    5 Mar 2023
 * @author Sumandeep
 * @author Jashman
 * @author Shubhdeep
 * @author Manvir

 */
public class GoFish extends Game{

    //Standard 52 card deck
    private final GroupOfCards deck = new GroupOfCards(52);
    int currentTurn = 0; //Keeps track of turn

    public GoFish() {
        super("GoFish");
    }

    /**
     * Starts game
     */
    @Override
    public void play() { //Start game
        getPlayersInfo.PlayersInfo();
        nextTurn();
    }

    /**
     * Moves to next turn
     */
    public void nextTurn() {
        currentTurn++;
        //Use % to determine turn and call Player
        //checkIfNPC();
    }

    /**
     * Check if there is pairs in play and if not
     * checks who has the most and declares them winner
     */
    @Override
    public void declareWinner() {
        //Check pairs and deck state
    }

    /**
     * Checks if player is an NPC
     * @param player
     * @return
     */
    public boolean checkIfNpc(Player player) {
        return !(player instanceof Human);
    }

    /**
     * Checks pairs (Check deck or player hands?)
     */
    public void checkPairs(){
        //getPlayers() loop trough hands and check for pairs
        //or
        //Check for pairs left in deck
    }

    /**
     * Distributes initial hands
     * @param players
     */
    public void dealCards(ArrayList<Player> players) {
        // 7 cards 2-4 players
        // 5 cards 5-6 players
    }
}