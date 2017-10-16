package players;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

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
        Collections.shuffle(super.playlist);
    }

    @Override
    public void show(VBox vBox){
        super.show(vBox, super.playlist.get(0), "Play first song");
        super.playAll(vBox);

        Button play = new Button("Shuffle");
        play.getStyleClass().add("methods-button");
        play.setOnAction(event -> {
           vBox.getChildren().clear();
           shuffle();
            for (int i = 0; i < playlist.size(); i++)
                vBox.getChildren().addAll(new Text(playlist.get(i)));
        });
        vBox.getChildren().add(play);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
    }

    public double getPRICE() {
        return PRICE;
    }

}
