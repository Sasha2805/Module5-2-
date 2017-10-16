package players;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Демонстрация работы класов в консоли
        Player player = new Player("Super Song1");
        Player1 player1 = new Player1("The best song", 400);
        Player2 player2 = new Player2("Good song", 305);
        Player3 player3 = new Player3(350.80);
        Player4 player4 = new Player4(550.30);
        Player5 player5 = new Player5(280);
        Player6 player6 = new Player6(468);

        // Player
        System.out.println("Class Player:");
        player.playSong();
        player.addSongToPlaylist();
        System.out.println("--------------------");

        player.playSong("Super Song2");
        player.addSongToPlaylist("Super Song2");
        System.out.println("--------------------");

        player.setSong("Super Song3");
        player.playSong();

        player.playFirstSong();
        System.out.println("--------------------");
        player.playAllSongs();
        System.out.println("********************");

        // Player1
        System.out.println("Class Player1:");
        player1.playSong();
        System.out.println("Price: " + player1.getPRICE());
        System.out.println("********************");

        // Player2
        System.out.println("Class Player2:");
        player2.playSong();
        System.out.println("Price: " + player2.getPRICE());
        System.out.println("********************");

        // Player3
        System.out.println("Class Player3:");
        ArrayList<String> playlist3 = new ArrayList<>();
        playlist3.add("The best song1");
        playlist3.add("The best song2");
        player3.setPlaylist(playlist3);
        player3.addSongToPlaylist("The best song3");

        player3.playSong();
        System.out.println("--------------------");
        player3.playAllSongs();
        System.out.println("Price: " + player2.getPRICE());
        System.out.println("********************");

        // Player4
        System.out.println("Class Player4:");
        ArrayList<String> playlist = new ArrayList<>();
        playlist.add("Good song1");
        playlist.add("Good song2");
        player4.setPlaylist(playlist);

        player4.playSong();
        System.out.println("--------------------");
        player4.playAllSongs();
        System.out.println("Price: " + player4.getPRICE());
        System.out.println("********************");


        // Player5
        System.out.println("Class Player5:");
        player5.setPlaylist(playlist);

        player5.playSong();
        System.out.println("--------------------");
        player5.playAllSongs();
        System.out.println("Price: " + player5.getPRICE());
        System.out.println("********************");

        // Player6
        System.out.println("Class Player5:");
        player6.setPlaylist(playlist);

        player6.playSong();
        System.out.println("--------------------");
        player6.playAllSongs();
        System.out.println("--------------------");
        player6.shuffle();
        System.out.println("Price: " + player6.getPRICE());
        System.out.println("********************");
    }

}
