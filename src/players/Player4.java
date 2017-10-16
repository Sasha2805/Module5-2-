package players;

import javafx.scene.layout.VBox;

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
        super.playSong(super.playlist.get(super.playlist.size() - 1));  // проигрываем последнююю песню
    }

    @Override
    public void playAllSongs(){
        super.playAllSongs();   // проигрываем все песни
    }

    @Override
    public void show(VBox vBox){
        super.show(vBox, super.playlist.get(super.playlist.size() - 1), "Play last song");
        super.playAll(vBox);
    }

    public double getPRICE() {
        return PRICE;
    }

}
