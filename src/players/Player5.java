package players;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

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

    @Override
    public void show(VBox vBox){
        super.show(vBox, super.playlist.get(0), "Play first song");

        Button play = new Button("Play All Songs");
        play.getStyleClass().add("methods-button");
        play.setOnAction(event -> {
            vBox.getChildren().clear();
            for (int i = super.playlist.size() - 1; i >= 0; i--){
                vBox.getChildren().addAll(new Text(super.playlist.get(i)));
            }
        });
        vBox.getChildren().add(play);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
    }

    public double getPRICE() {
        return PRICE;
    }

}
