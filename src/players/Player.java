package players;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Player {
    protected String song;
    protected ArrayList<String> playlist = new ArrayList<>();

    public Player(){
        this("");
    }

    public Player(String song){
        this.song = song;
    }

    public Player(String song, ArrayList<String> playlist){  // конструктор принимает плейлист для проигрывания
        this(song);
        this.playlist = playlist;
    }

    public void playSong(){ // проигрываем текущую песню
       playSong(song);
    }

    public void playSong(String song){ // переопределенный метод
        System.out.println("Playing: " + song);
    }

    public void playFirstSong(){ // проигрываем первую песню
       if (playlist.isEmpty()){
           System.out.println("Плейлист пуст");
           return;
       }
       playSong(playlist.get(0));
    }

    public void playAllSongs(){ // проигрываем все песни
        playFirstSong();
        for (int i = 1; i < playlist.size(); i++)
           playSong(playlist.get(i));
    }

    public void addSongToPlaylist(){    // Добавили song в плейлист
        addSongToPlaylist(song);
    }

    public void addSongToPlaylist(String song){    // Перегруженный метод
        playlist.add(song);
    }

    public void show(VBox vBox){
       show(vBox, song, "Play song");
    }

    public void show(VBox vBox, String song, String nameButton){ // Отрисовывает кнопку с нужным названием
        Text textSong = new Text();                              // и выводит название песни в UI
        textSong.setFont(Font.font ("Verdana", 15));
        Button play = new Button(nameButton);
        play.getStyleClass().add("methods-button");

        play.setOnAction(event -> {
            vBox.getChildren().clear();
            textSong.setText(song);
            vBox.getChildren().add(textSong);
        });
        vBox.getChildren().add(play);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
    }

    public void playAll(VBox vBox){ // Проигрывает все пени плейлиста (отрисовывает их в UI)
        Button play = new Button("Play All Songs");
        play.getStyleClass().add("methods-button");

        play.setOnAction(event -> {
            vBox.getChildren().clear();
                for (int i = 0; i < playlist.size(); i++)
                    vBox.getChildren().addAll(new Text(playlist.get(i)));
        });
        vBox.getChildren().add(play);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
    }

    // Getters and setters
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public ArrayList<String> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<String> playlist) {
        this.playlist = playlist;
    }

}
