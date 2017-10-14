package players;

import java.util.ArrayList;

public class Player3 extends Player{
    private final double PRICE;
    private ArrayList<String> playlist = new ArrayList<>();

    public Player3(double PRICE){
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

    public double getPRICE() {
        return PRICE;
    }

}
