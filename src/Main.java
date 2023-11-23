
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        Spusti.LogPass();
        Spusti.SkinChanger();
        Spusti.LobbyReveal();
        Spusti.league();
        Spusti.poro();

    }
    //--------------------------------------
    public static class Spusti {

        public static void league(){
            try {
                Desktop.getDesktop().open(new File("C:\\\\Riot Games\\\\Riot Client\\\\RiotClientServices.exe"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void poro(){
            try {
                Desktop.getDesktop().open(new File("\"C:\\Program Files (x86)\\Overwolf\\OverwolfLauncher.exe\""));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public static void LogPass(){
            try {
                Desktop.getDesktop().open(new File("E:\\yall\\U-d4\\logIN.txt"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void LobbyReveal(){
            try {
                Desktop.getDesktop().open(new File("E:\\yall\\U-d4\\lobbyReveal\\LobbyReveal.exe"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void SkinChanger(){
            try {
                Desktop.getDesktop().open(new File("E:\\yall\\U-d4\\Nový priečinok"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}

