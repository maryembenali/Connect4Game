package trial;
import trial.gui;
import trial.connect4;

public class gameloop {

	
	 private final connect4 game;
	    private final gui ourGUI;

	    public gameloop() {
	        game = new connect4("R", "Y", 6, 7);
	        ourGUI = new gui(game.isIs1playing(), game, 6, 7);
	    }

}