package players;

import javafx.scene.layout.VBox;

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

    @Override
    public void show(VBox vBox){
        super.show(vBox, super.playlist.get(0), "Play first song");
        super.playAll(vBox);
    }

    public double getPRICE() {
        return PRICE;
    }

}
