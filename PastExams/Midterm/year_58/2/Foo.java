import java.util.*;

class Dice {

    private int maxFace;
    private int face;

    public Dice(int face)
    {
        this.maxFace = face;
        // there are at least 2 side to be random
        if(this.maxFace < 2)
            this.maxFace = 2;
        this.face = 1;
    }

    public Dice()
    {
        this.maxFace = 6;
        this.face = 1;
    }

    public void roll()
    {
    	/*
            Math.random() = [0,1) random from 0 to nearly 1 but not 1
            By flooring or casting Math.random() * 6 into int the possible values are 0, 1, 2, 3, 4, 5
        */
        this.face = (int)Math.floor(Math.random() * (this.maxFace)) + 1;
    }

    public int getFace()
    {
        return this.face;
    }

    @Override
    public String toString() {
        return "Face = " + String.valueOf(this.face);
    }
}

class DiceBox {
	
	// we dont even know how many dices require
    private ArrayList<Dice> dices;

    public DiceBox()
    {
        dices = new ArrayList<Dice>();
    }

    public void add(Dice newDice)
    {
        dices.add(newDice);
    }

    public void shake()
    {
    	// shake the box of dices, then all the dices will roll
        for(Dice dice : dices)
        {
            dice.roll();
        }
    }

    public int getTotal()
    {
        int total = 0;
        for(Dice dice : dices)
        {
            total += dice.getFace();
        }
        return total;
    }

    public void printDices()
    {
    	int i = 1;
        for(Dice d : dices)
        {
            System.out.println(i + ". " + d);
            i++;
        }
    }
}

public class Foo {
    public static void main(String args[])
    {
        Dice d1 = new Dice();
        System.out.println(d1);
        d1.roll();
        System.out.println(d1);

        DiceBox box = new DiceBox();
        box.add(d1);
        box.add(new Dice());
        box.add(new Dice());

        System.out.println("Before shaking: total = " + box.getTotal());
        box.shake();
        System.out.println("After shaking: total = " + box.getTotal());

        box.printDices();
    }
}
