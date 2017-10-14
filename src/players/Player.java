package players;

import javafx.scene.layout.Pane;
import java.util.ArrayList;

public class Player {
    private String song;
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

    public void show(Pane root){

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
