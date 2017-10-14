package players;

import java.util.ArrayList;
import java.util.Collections;

public class Player6 extends Player{
    private final double PRICE;
    private ArrayList<String> playlist = new ArrayList<>();

    public Player6(double PRICE){
        super.setPlaylist(playlist);
        this.PRICE = PRICE;
    }

    @Override
    public void playSong(){
        super.playFirstSong();  // проигрываем первую песню
    }

    @Override
    public void playAllSongs(){
        super.playAllSongs();   // проигрываем все песни
    }

    public void shuffle(){  // перемешиваем плейлист
        System.out.println("Плейлист до перемешивания: " + super.playlist);
        Collections.shuffle(super.playlist);
        System.out.println("Плейлист после перемешивания: " + super.playlist);
    }

    public double getPRICE() {
        return PRICE;
    }

}
