package Model;

public abstract class Player implements MoveListener
{

    private String username;

    private boolean isRed;

    private boolean isMyTurn;

    Game currentGame;


    public Player( String username )
    {
        this.username = username;

    }


    public boolean isRed()
    {
        return isRed;
    }


    public void newGame( Game g, boolean isRed )
    {
        currentGame = g;
        this.isRed = isRed;

        isMyTurn = isRed;
        if(isMyTurn)
        {
            moveHappened(null);
        }
    }
    @Override
    public void gameOver()
    {
       currentGame = null;
       
        
    }
    public abstract void doMove();


    public Game getGame()
    {
        return currentGame;
    }

}
