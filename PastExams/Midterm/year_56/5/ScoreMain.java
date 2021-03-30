import java.util.*;

class Arrow {

    private boolean[] arrows;

    public Arrow()
    {
        arrows = new boolean[]{false, false};
    }

    public void turnOffAll()
    {
        arrows[0] = false;
        arrows[1] = false;
    }

    public void turnOnLeft()
    {
        arrows[0] = true;
    }

    public void turnOnRight()
    {
        arrows[1] = true;
    }

    public String toString()
    {
        if(arrows[0] && arrows[1]) {
            return "<->";
        }
        
        if(arrows[0]) {
            return "<- ";
        }

        if(arrows[1]) {
            return " ->";
        }

        return " * ";
    }
}

class Counter {

    private int score = 0;

    public Counter(int c)
    {
        this.score = c;
        // neutralize
        if (this.score < 0)
            this.score = 0; 
    }

    public void increase()
    {
        this.score += 1;
    }

    public void decrease()
    {
        if(this.score > 0)
            this.score -= 1;
    }

    public int getCurrent()
    {
        // neutralize first
        if (this.score < 0)
            this.score = 0; 
        return this.score;
    }
}

class Scoreboard {

    private Counter[] teams;
    private Arrow arrow;

    public Scoreboard()
    {
        teams = new Counter[] {
            new Counter(0),
            new Counter(0)
        };
        arrow = new Arrow();
    }

    public void scoreLeft()
    {
        teams[0].increase();
        if(teams[0].getCurrent() > teams[1].getCurrent())
        {
            // update
            arrow.turnOffAll();
            arrow.turnOnLeft();
        }else if(teams[0].getCurrent() == teams[1].getCurrent())
        {
            arrow.turnOnLeft();
        }
    }

    public void scoreRight()
    {
        teams[1].increase();
        if(teams[0].getCurrent() < teams[1].getCurrent())
        {
            arrow.turnOffAll();
            arrow.turnOnRight();
        }else if(teams[0].getCurrent() == teams[1].getCurrent())
        {
            arrow.turnOnRight();
        }
    }

    public void reset()
    {
        while(teams[0].getCurrent() > 0)
        {
            teams[0].decrease();
        }
        while(teams[1].getCurrent() > 0)
        {
            teams[1].decrease();
        }
        arrow.turnOffAll();
    }

    public String reportScoreboard()
    {
        return String.valueOf(teams[0].getCurrent()) + " " + arrow.toString() + " " + String.valueOf(teams[1].getCurrent());
    }
}

public class ScoreMain {

    public static void main(String args[])
    {
        //for testing purpose
        Scoreboard sc = new Scoreboard();

        System.out.println("RESETTING...");
        sc.reset();
        System.out.println(sc.reportScoreboard());

        System.out.println("\nRound 1");
        int round = (int)Math.round(Math.random() * 49) + 1;
        for(int i=0;i<round;i++)
        {
            if(Math.random() >= 0.5)
            {
                sc.scoreRight();
            }else{
                sc.scoreLeft();
            }
        }

        System.out.println(sc.reportScoreboard());

        System.out.println("\nRESETTING...");
        sc.reset();
        System.out.println(sc.reportScoreboard());

        System.out.println("\nRound 2");
        round = (int)Math.round(Math.random() * 49) + 1;
        for(int i=0;i<round;i++)
        {
            if(Math.random() >= 0.5)
            {
                sc.scoreRight();
            }else{
                sc.scoreLeft();
            }
        }

        System.out.println(sc.reportScoreboard());
    }

}
