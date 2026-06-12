import java.util.Scanner;

import static java.lang.Thread.sleep;

public class MainAudio {
    public static void main(String[] args) throws InterruptedException {

        Audio.playSoundtrack("resources/audio/super_mario_theme.wav");

        System.out.println("Estás a explorar o mundo do super mário...");
        sleep(5000);

        Audio.playEffect("resources/audio/sonic_ring_effect.wav");
        System.out.println("Apanhaste uma moeda...");

        sleep(2000);

        Audio.playEffect("resources/audio/super_mario_end.wav");
        System.out.println("Ganhaste o jogo!");

        sleep(4000);

        System.out.println("Créditos e classificações");
        Audio.changeSoundtrack("resources/audio/winner_ost.wav");

        sleep(2000);

        System.out.println("1. Joaquim");
        sleep(1000);
        System.out.println("2. Joana");
        sleep(1000);
        System.out.println("3. Jorge");
        sleep(1000);

        Audio.stopAll();
    }
}