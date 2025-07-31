package Day7;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class musicplayer {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        String filepath = "C:\\Projects\\java-daily-code\\java-daily-code\\src\\Day7\\Fontana - Ryan Stasik, Kanika Moore.wav";
        File file = new File(filepath);
        try (AudioInputStream audiostream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);


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
    }
}
