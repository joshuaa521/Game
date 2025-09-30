public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;
    /** Postcondition: All instance variables have been initialized. */
    public Game()
    {
        levelOne = new Level();
        levelTwo = new Level();
        levelThree = new Level();

    }
    public Level getLevel (int i) {
        if (i == 1) return levelOne;
        if (i == 2) return levelTwo;
        if (i == 3) return levelThree;
        return null;

    }
    /** Returns true if this game is a bonus game and returns false otherwise */
    public boolean isBonus()
    {
        return bonus;
    }
    public void makeBonus() {
        bonus = true;
    }
    /** Simulates the play of this Game (consisting of three levels) and updates all relevant
     * game data
     */
    public void play()
    {}
    /** Returns the score earned in the most recently played game, as described in part (a) */
    public int getScore()
    {

    }
    /** Simulates the play of num games and returns the highest score earned, as
     * described in part (b)
     * Precondition: num > 0
     */
    public int playManyTimes(int num)
    {}
// There may be instance variables, constructors, and methods that are not shown.
}

