package com.deck;

public class DeckOfCard
{
        public static void main(String[] args) {
            String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};

            String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

            // initialize deck
            int m = 0;
            int n = suit.length * rank.length;
            String[] deck = new String[n];
            for (int i = 0; i < rank.length; i++) {
                for (int j = 0; j < suit.length; j++) {
                    deck[m] = rank[i] + " of " + suit[j];
                    m++;
                }
            }

            // shuffle
            for (int i = 0; i < n; i++) {
                int d =i + (int) (Math.random() * (n-i));
                String temp = deck[d];
                deck[d] = deck[i];
                deck[i] = temp;
            }

            // print shuffled deck
            int p = 1;
            for (int i = 0; i < n; i++) {
                System.out.println(p + ":-" + deck[i]);
                p++;
            }

            int i=0;
            int row=4,col=9;
            String[][] arr = new String[4][9];

            for (int r = 0; r <= row - 1; r++) {
                for (int c = 0; c <= col - 1; c++) {
                    arr[r][c] = deck[i];
                    i++;

                }
            }

            for (int r = 0; r<= row-1; r++)
            {
                System.out.print("Player "+r+"   ");
                for (int c = 0; c <= col-1; c++)
                {

                    System.out.print(arr[r][c]+"        ");
                }
                System.out.println();
            }
        }
    }

