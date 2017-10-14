package players;

import java.util.ArrayList;

public class Player5 extends Player{
    private final double PRICE;
    private ArrayList<String> playlist = new ArrayList<>();

    public Player5(double PRICE){
        super.setPlaylist(playlist);
        this.PRICE = PRICE;
    }

    @Override
    public void playSong(){
        super.playFirstSong();  // проигрываем первую песню
    }

    @Override
    public void playAllSongs(){
        if (super.playlist.isEmpty()){
            System.out.println("Плейлист пуст");
            return;
        }
        for (int i = super.playlist.size() - 1; i >= 0; i--)
            System.out.println("Playing: " + super.playlist.get(i));
    }

    public double getPRICE() {
        return PRICE;
    }

}
