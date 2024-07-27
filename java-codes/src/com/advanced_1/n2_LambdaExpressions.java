package com.advanced_1;

public class n2_LambdaExpressions {
    public static void main(String[] args) {
        /*Song s1 = new Song();
        s1.play();
        playFunc(s1);*/

        /*playFunc(() -> System.out.println("playing the song by passing only the implementation"));*/


        /*
        * Lambda is basically a shortcut to defining an implementation of a Functional Interface
        * */

        Playable lambdaPlayableExpression = songName -> System.out.println("playing the song by passing only the implementation after storing it in a lambda expression variable, the song is : " + songName);
        playFunc(lambdaPlayableExpression);

        Pausable lambdaPausableExpression = songName -> "pausing the song : " + songName;
        pauseFunc(lambdaPausableExpression);
    }

    static void playFunc(Playable p){
        p.play("Believer");
    }

    static void pauseFunc(Pausable p){
        System.out.println(p.pause("Demons"));
    }
}
