public class Methods2 {
    public static void main(String[] args) {

        boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;

        int highScore = calculateScore(true,800,5,100);
        System.out.println("Your final score was " + highScore);
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louis", highScorePosition);



        
        

        // score = 10000;
        // levelCompleted = 8;
        // bonus = 200;
        // if(gameOver)//scope - accessibility of variable
        // {
        //     int finalScore = score + (levelCompleted * bonus);
        //     System.out.println("Your final Score was " + finalScore);
        // }


    }

    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;

        
        if(gameOver)//scope - accessibility of variable
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore = finalScore + 1000;
            // System.out.println("Your final Score was " + finalScore);
            return finalScore;
        }
        return -1;
        // }else{
        //     return -1;
        // }
    }

    public static void displayHighScorePosition(String playername,int highScorePosition)
    {
        System.out.println( playername + ",Managed to get into position " + highScorePosition + " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore)
    {
        // if(playerScore >= 1000)
        // {
        //     return 1;
        // }
        // else if(playerScore >= 500 )//&& playerScore < 1000
        // {
        //     return 2;
        // }
        // else if(playerScore >= 100 )//&& playerScore < 500
        // {
        //     return 3;
        // }
        //     return 4;

        int position = 4; //assuming position 4 will be returned
        if(playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        }else if(playerScore >= 100){
            position = 3;
        }
        return position;
    }

        

    }
    

