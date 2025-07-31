package Day7;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class musicplayer {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File("C:\\Projects\\java-daily-code\\java-daily-code\\src\\Day7\\Fontana - Ryan Stasik, Kanika Moore.wav");
        try (Scanner scanner = new Scanner(System.in)) {
            AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);

String response="";
while(!response.equals("Q")){
    System.out.println("P=Play");
    System.out.println("S=Stop");
    System.out.println("R=Reset");
    System.out.println("Q=Quit");
    System.out.print("Enter your choice : ");
    response=scanner.next().toUpperCase();
    switch(response){
        case "Q" ->clip.close();
        case "S" ->clip.stop();
        case "R" ->clip.setMicrosecondPosition(0);
        case "P" ->clip.start();
        default -> System.out.println("Wrong choice");
    }


}

            System.out.println("Loading file...");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (LineUnavailableException e) {
            System.out.println("Audio line unavailable");
        } catch (UnsupportedAudioFileException e) {

            System.out.println("Unsupported Audio File");
        } catch (IOException e) {
            System.out.println("I/O Error");
        }
        finally {
            System.out.println("Done");

        }
    }
}
