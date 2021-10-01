package com.bridgelabz.deckofcardsdemo;
import java.util.ArrayList;
import java.util.Scanner;

public class DeckCards {
        ArrayList<String> arrayList = new ArrayList<>();
                            //create method and add in arraylist
        public void DeckCards() {
            String[] suit = {"Clubs,Diamonds,Hearts,Spade,Queen"};
            String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
            for (int i = 0; i < rank.length; i++) {
                for (int j = 0; j < suit.length; j++) {
                    arrayList.add(rank[i]+" "+suit[i]);
                }
            }
            display(arrayList);
        }
        public void display(ArrayList<String> arrayList) {
            for(String deckcard:arrayList){
                System.out.println(deckcard);
            }
        }
}