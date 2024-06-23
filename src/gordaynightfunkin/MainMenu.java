package gordaynightfunkin;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import java.io.*;

public class MainMenu {
    private static boolean downPressed;
    private static boolean upPressed;
    private static boolean enterPressed;
    private static boolean escPressed;
    private static int page;
    private static int choice;

    public static Scene getCreatedScene(int enter) {
        //Variables to check if the buttons are currently being pressed
        downPressed = false;
        upPressed = false;
        enterPressed = false;
        escPressed = false;
        
        //Used to navigate the menu
        page = 0;
        choice = 0;

        Label[] page0Choices = new Label[2];
        Label[] page1Choices = new Label[3];
        Label[] page2Choices = new Label[6];

        Label[] songInfo = new Label[6];

        String[] scores = new String[6];
        
        try {
            Main.formatScore();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File saveFile = new File(System.getProperty("user.home") + "\\AppData\\LocalLow\\George Wei\\GordayNight\\scores.txt");
        BufferedReader saveReader = null;
        try {
            saveReader = new BufferedReader(new FileReader(saveFile));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 6; i++){
            try {
                scores[i] = saveReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        page0Choices[0] = new Label("Story");
        page0Choices[0].setFont(Main.getBaeFont(100));
        page0Choices[1] = new Label("Freeplay");
        page0Choices[1].setFont(Main.getBaeFont(100));

        page1Choices[0] = new Label("Tutorial");
        page1Choices[0].setFont(Main.getBaeFont(50));
        page1Choices[1] = new Label("Week 1");
        page1Choices[1].setFont(Main.getBaeFont(50));
        page1Choices[2] = new Label("Week 2");
        page1Choices[2].setFont(Main.getBaeFont(50));

        page2Choices[0] = new Label("Tutorial");
        page2Choices[0].setFont(Main.getBaeFont(50));
        page2Choices[1] = new Label("Bopeebo");
        page2Choices[1].setFont(Main.getBaeFont(50));
        page2Choices[2] = new Label("Fresh");
        page2Choices[2].setFont(Main.getBaeFont(50));
        page2Choices[3] = new Label("Dadbattle");
        page2Choices[3].setFont(Main.getBaeFont(50));
        page2Choices[4] = new Label("Bergentrückung");
        page2Choices[4].setFont(Main.getBaeFont(50));
        page2Choices[5] = new Label("ASGORE");
        page2Choices[5].setFont(Main.getBaeFont(50));

        songInfo[0] = new Label("Composer: Kawai Sprite\nCharted by: ninjamuffin99\nTutorial - Hard\nScore: " + scores[0]);
        songInfo[0].setFont(Main.getBaeFont(50));
        songInfo[1] = new Label("Composer: Kawai Sprite\nCharted by: ninjamuffin99\nBopeebo - Hard\nScore: " + scores[1]);
        songInfo[1].setFont(Main.getBaeFont(50));
        songInfo[2] = new Label("Composer: Kawai Sprite\nCharted by: ninjamuffin99\nFresh - Hard\nScore: " + scores[2]);
        songInfo[2].setFont(Main.getBaeFont(50));
        songInfo[3] = new Label("Composer: Kawai Sprite\nCharted by: ninjamuffin99\nDadbattle - Hard\nScore: " + scores[3]);
        songInfo[3].setFont(Main.getBaeFont(50));
        songInfo[4] = new Label("Composer: Toby \"Radiation\" Fox\nCharted by: Gor\nBergentrückung - Medium\nScore: " + scores[4]);
        songInfo[4].setFont(Main.getBaeFont(50));
        songInfo[5] = new Label("Composer: Toby \"Radiation\" Fox\nCharted by: Gor\nASGORE - Medium\nScore: " + scores[5]);
        songInfo[5].setFont(Main.getBaeFont(50));

        Group page0 = new Group();
        Group page1 = new Group();
        Group page2 = new Group();

        for (int i = 0; i < page0Choices.length; i++){
            page0.getChildren().add(page0Choices[i]);
            page0Choices[i].setLayoutY(100 + 100 * i);
            if (i == choice){
                page0Choices[i].setTextFill(Color.BLACK);
            } else {
                page0Choices[i].setTextFill(Color.GRAY);
            }
        }
        for (int i = 0; i < page1Choices.length; i++){
            page1.getChildren().add(page1Choices[i]);
            page1Choices[i].setLayoutY(50 + 50 * i - 50 * choice);
            if (i == choice){
                page1Choices[i].setTextFill(Color.BLACK);
            } else {
                page1Choices[i].setTextFill(Color.GRAY);
            }
        }
        for (int i = 0; i < page2Choices.length; i++){
            page2.getChildren().add(page2Choices[i]);
            page2Choices[i].setLayoutY(50 + 50 * i - 50 * choice);
            if (i == choice){
                page2Choices[i].setTextFill(Color.BLACK);
            } else {
                page2Choices[i].setTextFill(Color.GRAY);
            }
        }
        for (int i = 0; i < songInfo.length; i++){
            page2.getChildren().add(songInfo[i]);
            songInfo[i].setLayoutX(500);
            songInfo[i].setLayoutY(50);
            songInfo[i].setVisible(i == choice);
        }

        Scene scene = new Scene(page0);
        
        //Which page do we start on
        switch (enter){
            case 0:
                page = 0;
                scene.setRoot(page0);
                break;
            case 1:
                page = 1;
                scene.setRoot(page1);
                break;
            case 2:
                page = 2;
                scene.setRoot(page2);
                break;
            default:
        }

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.DOWN){
                //We can navigate the menu by changing the choice int when pressing up or down
                if (!downPressed) {
                    downPressed = true;
                    switch (page){
                        case 0:
                            if (choice == page0Choices.length - 1){
                                choice = 0;
                            } else {
                                choice++;
                            }
                            for (int i = 0; i < page0Choices.length; i++){
                                if (i == choice){
                                    page0Choices[i].setTextFill(Color.BLACK);
                                } else {
                                    page0Choices[i].setTextFill(Color.GRAY);
                                }
                            }
                            break;
                        case 1:
                            if (choice == page1Choices.length - 1){
                                choice = 0;
                            } else {
                                choice++;
                            }
                            for (int i = 0; i < page1Choices.length; i++){
                                page1Choices[i].setLayoutY(50 + 50 * i - 50 * choice);
                                if (i == choice){
                                    page1Choices[i].setTextFill(Color.BLACK);
                                } else {
                                    page1Choices[i].setTextFill(Color.GRAY);
                                }
                            }
                            break;
                        case 2:
                            if (choice == page2Choices.length - 1){
                                choice = 0;
                            } else {
                                choice++;
                            }
                            for (int i = 0; i < page2Choices.length; i++){
                                page2Choices[i].setLayoutY(50 + 50 * i - 50 * choice);
                                if (i == choice){
                                    page2Choices[i].setTextFill(Color.BLACK);
                                } else {
                                    page2Choices[i].setTextFill(Color.GRAY);
                                }
                            }
                            for (int i = 0; i < songInfo.length; i++){
                                songInfo[i].setVisible(i == choice);
                            }
                            break;
                        default:
                    }
                }
            }
            if (e.getCode() == KeyCode.UP){
                if (!upPressed) {
                    upPressed = true;
                    switch (page){
                        case 0:
                            if (choice == 0){
                                choice = page0Choices.length - 1;
                            } else {
                                choice--;
                            }
                            for (int i = 0; i < page0Choices.length; i++){
                                if (i == choice){
                                    page0Choices[i].setTextFill(Color.BLACK);
                                } else {
                                    page0Choices[i].setTextFill(Color.GRAY);
                                }
                            }
                            break;
                        case 1:
                            if (choice == 0){
                                choice = page1Choices.length - 1;
                            } else {
                                choice--;
                            }
                            for (int i = 0; i < page1Choices.length; i++){
                                page1Choices[i].setLayoutY(50 + 50 * i - 50 * choice);
                                if (i == choice){
                                    page1Choices[i].setTextFill(Color.BLACK);
                                } else {
                                    page1Choices[i].setTextFill(Color.GRAY);
                                }
                            }
                            break;
                        case 2:
                            if (choice == 0){
                                choice = page2Choices.length - 1;
                            } else {
                                choice--;
                            }
                            for (int i = 0; i < page2Choices.length; i++){
                                page2Choices[i].setLayoutY(50 + 50 * i - 50 * choice);
                                if (i == choice){
                                    page2Choices[i].setTextFill(Color.BLACK);
                                } else {
                                    page2Choices[i].setTextFill(Color.GRAY);
                                }
                            }
                            for (int i = 0; i < songInfo.length; i++){
                                songInfo[i].setVisible(i == choice);
                            }
                            break;
                        default:
                    }
                }
            }
            if (e.getCode() == KeyCode.ENTER){
                //Enter can change the page or take us to a new scene depending on a combination of the page we are on and choice we are on
                if (!enterPressed) {
                    enterPressed = true;
                    switch (page){
                        case 0:
                            switch (choice){
                                case 0:
                                    page = 1;
                                    scene.setRoot(page1);
                                    for (int i = 0; i < page1Choices.length; i++){
                                        page1Choices[i].setLayoutY(50 + 50 * i - 50 * choice);
                                        if (i == choice){
                                            page1Choices[i].setTextFill(Color.BLACK);
                                        } else {
                                            page1Choices[i].setTextFill(Color.GRAY);
                                        }
                                    }
                                    break;
                                case 1:
                                    page = 2;
                                    scene.setRoot(page2);
                                    choice = 0;
                                    for (int i = 0; i < page2Choices.length; i++){
                                        page2Choices[i].setLayoutY(50 + 50 * i - 50 * choice);
                                        if (i == choice){
                                            page2Choices[i].setTextFill(Color.BLACK);
                                        } else {
                                            page2Choices[i].setTextFill(Color.GRAY);
                                        }
                                    }
                                    for (int i = 0; i < songInfo.length; i++){
                                        songInfo[i].setVisible(i == choice);
                                    }
                                    break;
                                default:
                            }
                            break;
                        case 1:
                            switch (choice){
                                case 0:
                                    Main.getStage().setScene(Tutorial.getCreatedScene(false));
                                    break;
                                case 1:
                                    Main.getStage().setScene(Week1.getCreatedScene(false, 0));
                                    break;
                                case 2:
                                    Main.getStage().setScene(Week2.getCreatedScene(false, 0));
                                    break;
                                default:
                            }
                            break;
                        case 2:
                            switch (choice){
                                case 0:
                                    Main.getStage().setScene(Tutorial.getCreatedScene(true));
                                    break;
                                case 1:
                                    Main.getStage().setScene(Week1.getCreatedScene(true, 0));
                                    break;
                                case 2:
                                    Main.getStage().setScene(Week1.getCreatedScene(true, 1));
                                    break;
                                case 3:
                                    Main.getStage().setScene(Week1.getCreatedScene(true, 2));
                                    break;
                                case 4:
                                    Main.getStage().setScene(Week2.getCreatedScene(true, 0));
                                    break;
                                case 5:
                                    Main.getStage().setScene(Week2.getCreatedScene(true, 1));
                                    break;
                                default:
                            }
                            break;
                        default:
                    }
                }
            }
            if (e.getCode() == KeyCode.ESCAPE){
                if (!escPressed) {
                    escPressed = true;
                    switch (page){
                        case 1:
                            page = 0;
                            choice = 0;
                            scene.setRoot(page0);
                            for (int i = 0; i < page0Choices.length; i++){
                                if (i == choice){
                                    page0Choices[i].setTextFill(Color.BLACK);
                                } else {
                                    page0Choices[i].setTextFill(Color.GRAY);
                                }
                            }
                            break;
                        case 2:
                            page = 0;
                            choice = 0;
                            scene.setRoot(page0);
                            for (int i = 0; i < page0Choices.length; i++){
                                if (i == choice){
                                    page0Choices[i].setTextFill(Color.BLACK);
                                } else {
                                    page0Choices[i].setTextFill(Color.GRAY);
                                }
                            }
                            break;
                        default:
                    }
                }
            }
        });
        scene.setOnKeyReleased(e -> {
            if (e.getCode() == KeyCode.DOWN){
                downPressed = false;
            }
            if (e.getCode() == KeyCode.UP){
                upPressed = false;
            }
            if (e.getCode() == KeyCode.ENTER){
                enterPressed = false;
            }
            if (e.getCode() == KeyCode.ESCAPE){
                escPressed = false;
            }
        });
        return scene;
    }
}
