package players;

import java.util.ArrayList;

public class Player4 extends Player {
    private final double PRICE;
    private ArrayList<String> playlist = new ArrayList<>();

    public Player4(double PRICE){
        super.setPlaylist(playlist);
        this.PRICE = PRICE;
    }

    @Override
    public void playSong(){
        super.playSong(super.playlist.get(super.playlist.size()-1));  // проигрываем последнююю песню
    }

    @Override
    public void playAllSongs(){
        super.playAllSongs();   // проигрываем все песни
    }

    public double getPRICE() {
        return PRICE;
    }

}
