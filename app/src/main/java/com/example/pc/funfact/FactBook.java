package com.example.pc.funfact;


import java.util.Random;

public class FactBook {
    String[] facts = {
            "The longest time between two twins being born is 87 days." ,

            " The world's deepest postbox is in Susami Bay in Japan. It's 10 metres underwater." ,

            " In 2007, an American man named Corey Taylor tried to fake his own death in order to get out of his cell phone contract without paying a fee. It didn't work.",

            " The oldest condoms ever found date back to the 1640s (they were found in a cesspit at Dudley Castle), and were made from animal and fish intestines.",

            "In 1923, jockey Frank Hayes won a race at Belmont Park in New York despite being dead — he suffered a heart attack mid-race, but his body stayed in the saddle until his horse crossed the line for a 20–1 outsider victory.",

            " Everyone has a unique tongue print, just like fingerprints." ,

            " Most Muppets are left-handed. (Because most Muppeteers are right-handed, so they operate the head with their favoured hand.)",

            " Female kangaroos have three vaginas."
    };
    public String getfact(){
        Random  random= new Random();
        int randomNo = random.nextInt(facts.length);
        return facts[randomNo];
        
    }
}
