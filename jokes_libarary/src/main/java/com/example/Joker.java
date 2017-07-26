package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Joker {

    ArrayList<String>jokList;

    public Joker(){
             jokList =new ArrayList<>();
        jokList.add("Daughter: Mummy, are you my best friend?" +"\n"
        +"Mum: Yes dear.");

        jokList.add("Daughter: But you are bigger than me?" +"\n"
                +"Mum: Well I am the best person to talk to about anything, the best person to tell you what direction to take, the best person to help you up.");

        jokList.add("Daughter: But mum, how do you know so much?" +"\n"
                +"Mum: Well you see, I came to this world before you, you might not experience things the way I did, especially with the gap of technology but some old ways can be adapted to the new.");

        jokList.add("Daughter: Did you ever get scared of your mum, I mean grandma?" +"\n"
                +"Mum: Yes dear, she was like me and you but she also didn’t have all the experience I did, so when I did things she didn’t understand, she scolded me.\n" +
                "\n");
        jokList.add("Daughter: Are you going to scold me?" +"\n"
                +"Mum: Sometimes yes, it doesn’t mean I don’t love you, its only because at that time, I least expected what happened and yes, it depends on what you have done.");

        jokList.add("Daughter: Mummy do you love daddy?" +"\n"
                +"Mum: Of cos I do.");
    }

    public  String getjok(){
        Random random =new Random();
       String jokes = jokList.get(random.nextInt(jokList.size()));
      return jokes;
    }

    public static String pJoke() {
        return "iam very happy today !";
    }

}
