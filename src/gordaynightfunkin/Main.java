package gordaynightfunkin;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.*;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.text.Font;

/**
 *
 * @author weig4542
 */
public class Main extends Application {
    private static Stage stage;

    public static Stage getStage(){
        return stage;
    }
    
    public static Font getBaeFont(int size){
        //For some reason Font object and only Font object does not have in-built URLDecoder. Every other file path works fine but for Font I need to get URLDeocder to decode the string path.
        try {
            return Font.loadFont(URLDecoder.decode(Main.class.getResource("") + "Fonts/Baefont_normal-Regular_V1.ttf", "UTF-8"), size);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void formatScore() throws IOException {
        //This method should be called before reading or changing the save file to be safe
        //Create a folder path to store the scores
        File studioFolder = new File(System.getProperty("user.home") + "\\AppData\\LocalLow\\George Wei");
        if (!studioFolder.exists()){
            studioFolder.mkdir();
        }
        File gameFolder = new File(System.getProperty("user.home") + "\\AppData\\LocalLow\\George Wei\\GordayNight");
        if (!gameFolder.exists()){
            gameFolder.mkdir();
        }
        File saveFile = new File(System.getProperty("user.home") + "\\AppData\\LocalLow\\George Wei\\GordayNight\\scores.txt");
        //Create the score file if it does not exist
        saveFile.createNewFile();
        //Surprise tool that will help us later
        File tempFile = new File(System.getProperty("user.home") + "\\AppData\\LocalLow\\George Wei\\GordayNight\\temp.txt");
        tempFile.createNewFile();
        BufferedReader saveReader = new BufferedReader(new FileReader(saveFile));
        BufferedWriter tempWriter = new BufferedWriter(new FileWriter(tempFile));
        //Fill the tempFile with the scores from the save file unless it is not a number or is null, then it should be 0
        for (int i = 0; i < 6; i++){
            String tempLine = saveReader.readLine();
            if (tempLine == null){
                tempWriter.write("0\n");
            } else {
                try {
                    Integer.parseInt(tempLine);
                    tempWriter.write(tempLine + "\n");
                } catch(NumberFormatException e){
                    tempWriter.write("0\n");
                }
            }
        }
        saveReader.close();
        tempWriter.close();
        //Replace the old save file with the new one
        saveFile.delete();
        tempFile.renameTo(saveFile);
    }

    public static void changeScore(int index, int score) throws IOException {
        File saveFile = new File(System.getProperty("user.home") + "\\AppData\\LocalLow\\George Wei\\GordayNight\\scores.txt");
        File tempFile = new File(System.getProperty("user.home") + "\\AppData\\LocalLow\\George Wei\\GordayNight\\temp.txt");
        tempFile.createNewFile();
        BufferedReader saveReader = new BufferedReader(new FileReader(saveFile));
        BufferedWriter tempWriter = new BufferedWriter(new FileWriter(tempFile));
        //Fill the temp file with the data from the old save file unless it's the score we need to change
        for (int i = 0; i < 6; i++){
            if (i == index){
                int oldScore = Integer.parseInt(saveReader.readLine());
                //Check if the new score is higher and replace the old one if it is
                if (score > oldScore){
                    tempWriter.write(score + "\n");
                } else {
                    tempWriter.write(oldScore + "\n");
                }
            } else {
                tempWriter.write(saveReader.readLine() + "\n");
            }
        }
        saveReader.close();
        tempWriter.close();
        saveFile.delete();
        tempFile.renameTo(saveFile);
    }

    @Override
    public void start(Stage stage) {
        Main.stage = stage;
        stage.setTitle("Gorday Night Funkin");
        stage.getIcons().add(new Image(Main.class.getResource("") + "gor.png"));
        stage.setWidth(1280d);
        stage.setHeight(720d);
        stage.setResizable(false);
        stage.show();
        stage.setScene(MainMenu.getCreatedScene(0));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create the score file before we do anything
        try {
            Main.formatScore();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        launch();
    }
}