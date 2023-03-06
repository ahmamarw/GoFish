package ca.sheridancollege.project;

/**
 * @author Marwa    5 Mar 2023
 * @author Sumandeep
 * @author Jashman
 * @author Shubhdeep
 * @author Manvir
 */
 
public class Human extends Player {

	private String name;
	private GroupOfCards hand;

	/**
	 * A constructor that allows you to set the player's unique ID
	 *
	 * @param name the unique ID to assign to this player.
	 */
	public Human(String name) {
		super(name);
	}

        @Override
	public String getName() {
		return this.name;
	}

        @Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Display list of choices the player can man
	 */
        @Override
	public void play() {
		//1. Display hand 2. Check pairs 3. Ask for card 4.End turn(automatic)
	}

}