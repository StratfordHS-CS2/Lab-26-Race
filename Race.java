import java.util.ArrayList;

public class Race
{
    private ArrayList<Player> players;

    // this is the course that is printed either above or below the competitors locations
    private String course = "S--------|---------|---------|---------|---------F";

    // this is the time between updates in milliseconds (1000 = 1 second)
    private int waitTime = 250;

    // In the constructor you should:
    //   1. fill "players" with a new ArrayList
    //   2. add each player to the new arraylist
    //   3. call setupCourse()
    public Race()
    {
        players = new ArrayList<Player>();

        int numPlayers = 2;
        for( int i = 0; i < numPlayers; i++ )
        {
            players.add( new Player( "Player" + i ) );
        }

        setupCourse();
    }

    // This method should print the initial state of the course before the race starts.
    // Print both the course and each player.
    private void setupCourse()
    {
    }

    // This method will draw the course each time it is updated.
    private void drawCourse()
    {
        // The many '\n's does a fake clearing of the window.
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(course);

        // print the state of each player here.
        // The location of each player is their location (use .getLocation() )
        //   casted to an int.  Loop this many times print-ing (not println) an '='
        //   each time through the loop.  After the loop, println the player's name.

    }

    // loop through all of the players and return true if one of them has reached
    // the end of the course (the length of the course string).
    // You could modify this to return a string with the player's name instead.
    private boolean hasWinner()
    {

    }

    // using a while loop, repeatedly update the race until someone wins.
    // --to update a player's location call player.addToLocation( Math.random() )
    // --to pause execution use:
    //      "try{Thread.sleep(waitTime);}catch(InterruptedException e){System.out.println(e);}"
    //      -- execution is paused for "waitTime" (an instance variable) length of time.
    // --when someone wins print a winning message with their name.
    public void runRace()
    {

    }
}
