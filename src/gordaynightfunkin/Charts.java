package gordaynightfunkin;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Charts {
    private static final Image defaultNoteSkin = new Image(Main.class.getResource("") + "Images/User Interface/notes.png");
    private static final Image defaultNoteSkinHold = new Image(Main.class.getResource("") + "Images/User Interface/NOTE_assets.png");

    public static Note[][] getTutorialBFChart(){
        Note[] leftNotes = {
                new Note(14400, new ImageView(defaultNoteSkin)),
                new Note(16800, new ImageView(defaultNoteSkin)),
                new Note(33600, new ImageView(defaultNoteSkin)),
                new Note(54000, new ImageView(defaultNoteSkin)),
                new Note(56400, new ImageView(defaultNoteSkin)),
                new Note(62400, new ImageView(defaultNoteSkin)),
                new Note(63300, new ImageView(defaultNoteSkin)),
                new Note(64650, new ImageView(defaultNoteSkin))
        };
        Note[] downNotes = {
                new Note(25200, new ImageView(defaultNoteSkin)),
                new Note(27600, new ImageView(defaultNoteSkin)),
                new Note(36000, new ImageView(defaultNoteSkin)),
                new Note(43200, new ImageView(defaultNoteSkin)),
                new Note(43800, new ImageView(defaultNoteSkin)),
                new Note(45600, new ImageView(defaultNoteSkin)),
                new Note(46200, new ImageView(defaultNoteSkin)),
                new Note(50400, new ImageView(defaultNoteSkin)),
                new Note(53400, new ImageView(defaultNoteSkin)),
                new Note(54600, new ImageView(defaultNoteSkin)),
                new Note(57600, new ImageView(defaultNoteSkin), 750),
                new Note(62550, new ImageView(defaultNoteSkin)),
                new Note(63150, new ImageView(defaultNoteSkin)),
                new Note(63450, new ImageView(defaultNoteSkin)),
                new Note(64500, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(24000, new ImageView(defaultNoteSkin)),
                new Note(26400, new ImageView(defaultNoteSkin)),
                new Note(34800, new ImageView(defaultNoteSkin)),
                new Note(44400, new ImageView(defaultNoteSkin)),
                new Note(50700, new ImageView(defaultNoteSkin)),
                new Note(51300, new ImageView(defaultNoteSkin)),
                new Note(55200, new ImageView(defaultNoteSkin)),
                new Note(57000, new ImageView(defaultNoteSkin)),
                new Note(62700, new ImageView(defaultNoteSkin)),
                new Note(63000, new ImageView(defaultNoteSkin)),
                new Note(63600, new ImageView(defaultNoteSkin)),
                new Note(63900, new ImageView(defaultNoteSkin)),
                new Note(64200, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(15600, new ImageView(defaultNoteSkin)),
                new Note(18000, new ImageView(defaultNoteSkin)),
                new Note(37200, new ImageView(defaultNoteSkin)),
                new Note(46800, new ImageView(defaultNoteSkin)),
                new Note(51000, new ImageView(defaultNoteSkin)),
                new Note(52200, new ImageView(defaultNoteSkin)),
                new Note(52800, new ImageView(defaultNoteSkin)),
                new Note(55800, new ImageView(defaultNoteSkin)),
                new Note(62850, new ImageView(defaultNoteSkin)),
                new Note(63750, new ImageView(defaultNoteSkin)),
                new Note(64050, new ImageView(defaultNoteSkin)),
                new Note(64350, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getTutorialGFChart(){
        Note[] leftNotes = {
                new Note(9600, new ImageView(defaultNoteSkin)),
                new Note(12000, new ImageView(defaultNoteSkin)),
                new Note(28800, new ImageView(defaultNoteSkin))
        };
        Note[] downNotes = {
                new Note(20400, new ImageView(defaultNoteSkin)),
                new Note(22800, new ImageView(defaultNoteSkin)),
                new Note(31200, new ImageView(defaultNoteSkin)),
                new Note(38400, new ImageView(defaultNoteSkin)),
                new Note(39000, new ImageView(defaultNoteSkin)),
                new Note(40800, new ImageView(defaultNoteSkin)),
                new Note(41400, new ImageView(defaultNoteSkin)),
                new Note(48000, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(19200, new ImageView(defaultNoteSkin)),
                new Note(21600, new ImageView(defaultNoteSkin)),
                new Note(30000, new ImageView(defaultNoteSkin)),
                new Note(39600, new ImageView(defaultNoteSkin)),
                new Note(48300, new ImageView(defaultNoteSkin)),
                new Note(48900, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(10800, new ImageView(defaultNoteSkin)),
                new Note(13200, new ImageView(defaultNoteSkin)),
                new Note(32400, new ImageView(defaultNoteSkin)),
                new Note(42000, new ImageView(defaultNoteSkin)),
                new Note(48600, new ImageView(defaultNoteSkin)),
                new Note(49800, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getBopeeboBFChart(){
        Note[] leftNotes = {
                new Note(7800, new ImageView(defaultNoteSkin), 300),
                new Note(12900, new ImageView(defaultNoteSkin)),
                new Note(17700, new ImageView(defaultNoteSkin)),
                new Note(21600, new ImageView(defaultNoteSkin)),
                new Note(27000, new ImageView(defaultNoteSkin), 900),
                new Note(31800, new ImageView(defaultNoteSkin), 1200),
                new Note(36000, new ImageView(defaultNoteSkin)),
                new Note(36975, new ImageView(defaultNoteSkin)),
                new Note(42000, new ImageView(defaultNoteSkin), 600),
                new Note(51600, new ImageView(defaultNoteSkin), 450),
                new Note(60600, new ImageView(defaultNoteSkin),1200),
                new Note(64800, new ImageView(defaultNoteSkin)),
                new Note(65775, new ImageView(defaultNoteSkin)),
                new Note(70200, new ImageView(defaultNoteSkin)),
                new Note(74400, new ImageView(defaultNoteSkin)),
                new Note(75375, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(7200, new ImageView(defaultNoteSkin), 300),
                new Note(12000, new ImageView(defaultNoteSkin), 300),
                new Note(13200, new ImageView(defaultNoteSkin), 600),
                new Note(17100, new ImageView(defaultNoteSkin)),
                new Note(22200, new ImageView(defaultNoteSkin), 900),
                new Note(26400, new ImageView(defaultNoteSkin)),
                new Note(37200, new ImageView(defaultNoteSkin), 600),
                new Note(45600, new ImageView(defaultNoteSkin)),
                new Note(46800, new ImageView(defaultNoteSkin)),
                new Note(46950, new ImageView(defaultNoteSkin)),
                new Note(47100, new ImageView(defaultNoteSkin)),
                new Note(66000, new ImageView(defaultNoteSkin), 600),
                new Note(70800, new ImageView(defaultNoteSkin), 600),
                new Note(75600, new ImageView(defaultNoteSkin), 600)
        };
        Note[] upNotes = {
                new Note(2400, new ImageView(defaultNoteSkin)),
                new Note(18000, new ImageView(defaultNoteSkin), 600),
                new Note(31200, new ImageView(defaultNoteSkin)),
                new Note(35700, new ImageView(defaultNoteSkin)),
                new Note(36900, new ImageView(defaultNoteSkin)),
                new Note(40800, new ImageView(defaultNoteSkin), 450),
                new Note(46200, new ImageView(defaultNoteSkin)),
                new Note(47400, new ImageView(defaultNoteSkin)),
                new Note(50400, new ImageView(defaultNoteSkin), 450),
                new Note(60000, new ImageView(defaultNoteSkin)),
                new Note(64500, new ImageView(defaultNoteSkin)),
                new Note(65700, new ImageView(defaultNoteSkin)),
                new Note(69600, new ImageView(defaultNoteSkin)),
                new Note(70500, new ImageView(defaultNoteSkin)),
                new Note(74100, new ImageView(defaultNoteSkin)),
                new Note(75300, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(3000, new ImageView(defaultNoteSkin), 600),
                new Note(3600, new ImageView(defaultNoteSkin), 600),
                new Note(8400, new ImageView(defaultNoteSkin), 600),
                new Note(12600, new ImageView(defaultNoteSkin)),
                new Note(16800, new ImageView(defaultNoteSkin)),
                new Note(21900, new ImageView(defaultNoteSkin)),
                new Note(26700, new ImageView(defaultNoteSkin)),
                new Note(31500, new ImageView(defaultNoteSkin)),
                new Note(36300, new ImageView(defaultNoteSkin)),
                new Note(41400, new ImageView(defaultNoteSkin), 300),
                new Note(51000, new ImageView(defaultNoteSkin), 300),
                new Note(55200, new ImageView(defaultNoteSkin), 1800),
                new Note(60300, new ImageView(defaultNoteSkin)),
                new Note(65100, new ImageView(defaultNoteSkin)),
                new Note(69900, new ImageView(defaultNoteSkin)),
                new Note(74700, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getBopeeboDadChart(){
        Note[] leftNotes = {
                new Note(5400, new ImageView(defaultNoteSkin), 300),
                new Note(10500, new ImageView(defaultNoteSkin)),
                new Note(15300, new ImageView(defaultNoteSkin)),
                new Note(19200, new ImageView(defaultNoteSkin)),
                new Note(24600, new ImageView(defaultNoteSkin), 900),
                new Note(29400, new ImageView(defaultNoteSkin), 1200),
                new Note(33600, new ImageView(defaultNoteSkin)),
                new Note(34575, new ImageView(defaultNoteSkin)),
                new Note(39600, new ImageView(defaultNoteSkin), 600),
                new Note(49200, new ImageView(defaultNoteSkin), 450),
                new Note(58200, new ImageView(defaultNoteSkin),1200),
                new Note(62400, new ImageView(defaultNoteSkin)),
                new Note(63375, new ImageView(defaultNoteSkin)),
                new Note(67800, new ImageView(defaultNoteSkin)),
                new Note(72000, new ImageView(defaultNoteSkin)),
                new Note(72975, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(4800, new ImageView(defaultNoteSkin), 300),
                new Note(9600, new ImageView(defaultNoteSkin), 300),
                new Note(10800, new ImageView(defaultNoteSkin), 600),
                new Note(14700, new ImageView(defaultNoteSkin)),
                new Note(19800, new ImageView(defaultNoteSkin), 900),
                new Note(24000, new ImageView(defaultNoteSkin)),
                new Note(34800, new ImageView(defaultNoteSkin), 600),
                new Note(43200, new ImageView(defaultNoteSkin)),
                new Note(44400, new ImageView(defaultNoteSkin)),
                new Note(44550, new ImageView(defaultNoteSkin)),
                new Note(44700, new ImageView(defaultNoteSkin)),
                new Note(63600, new ImageView(defaultNoteSkin), 600),
                new Note(68400, new ImageView(defaultNoteSkin), 600),
                new Note(73200, new ImageView(defaultNoteSkin), 600)
        };
        Note[] upNotes = {
                new Note(0, new ImageView(defaultNoteSkin)),
                new Note(15600, new ImageView(defaultNoteSkin), 600),
                new Note(28800, new ImageView(defaultNoteSkin)),
                new Note(33300, new ImageView(defaultNoteSkin)),
                new Note(34500, new ImageView(defaultNoteSkin)),
                new Note(38400, new ImageView(defaultNoteSkin), 450),
                new Note(43800, new ImageView(defaultNoteSkin)),
                new Note(45000, new ImageView(defaultNoteSkin)),
                new Note(48000, new ImageView(defaultNoteSkin), 450),
                new Note(57600, new ImageView(defaultNoteSkin)),
                new Note(62100, new ImageView(defaultNoteSkin)),
                new Note(63300, new ImageView(defaultNoteSkin)),
                new Note(67200, new ImageView(defaultNoteSkin)),
                new Note(68100, new ImageView(defaultNoteSkin)),
                new Note(71700, new ImageView(defaultNoteSkin)),
                new Note(72900, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(600, new ImageView(defaultNoteSkin), 600),
                new Note(1200, new ImageView(defaultNoteSkin), 600),
                new Note(6000, new ImageView(defaultNoteSkin), 600),
                new Note(10200, new ImageView(defaultNoteSkin)),
                new Note(14400, new ImageView(defaultNoteSkin)),
                new Note(19500, new ImageView(defaultNoteSkin)),
                new Note(24300, new ImageView(defaultNoteSkin)),
                new Note(29100, new ImageView(defaultNoteSkin)),
                new Note(33900, new ImageView(defaultNoteSkin)),
                new Note(39000, new ImageView(defaultNoteSkin), 300),
                new Note(48600, new ImageView(defaultNoteSkin), 300),
                new Note(52800, new ImageView(defaultNoteSkin), 1800),
                new Note(57900, new ImageView(defaultNoteSkin)),
                new Note(62700, new ImageView(defaultNoteSkin)),
                new Note(67500, new ImageView(defaultNoteSkin)),
                new Note(72300, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getFreshBFChart(){
        Note[] leftNotes = {
                new Note(3250, new ImageView(defaultNoteSkin)),
                new Note(3875, new ImageView(defaultNoteSkin), 125),
                new Note(7250, new ImageView(defaultNoteSkin)),
                new Note(10250, new ImageView(defaultNoteSkin)),
                new Note(14250, new ImageView(defaultNoteSkin)),
                new Note(15000, new ImageView(defaultNoteSkin)),
                new Note(18250, new ImageView(defaultNoteSkin)),
                new Note(19000, new ImageView(defaultNoteSkin)),
                new Note(23750, new ImageView(defaultNoteSkin)),
                new Note(28500, new ImageView(defaultNoteSkin)),
                new Note(29500, new ImageView(defaultNoteSkin)),
                new Note(30750, new ImageView(defaultNoteSkin)),
                new Note(36500, new ImageView(defaultNoteSkin)),
                new Note(38250, new ImageView(defaultNoteSkin)),
                new Note(38750, new ImageView(defaultNoteSkin)),
                new Note(42250, new ImageView(defaultNoteSkin)),
                new Note(46250, new ImageView(defaultNoteSkin)),
                new Note(47000, new ImageView(defaultNoteSkin)),
                new Note(47750, new ImageView(defaultNoteSkin)),
                new Note(50250, new ImageView(defaultNoteSkin)),
                new Note(51000, new ImageView(defaultNoteSkin)),
                new Note(55750, new ImageView(defaultNoteSkin)),
                new Note(60500, new ImageView(defaultNoteSkin)),
                new Note(61500, new ImageView(defaultNoteSkin)),
                new Note(62750, new ImageView(defaultNoteSkin)),
                new Note(68500, new ImageView(defaultNoteSkin)),
                new Note(70250, new ImageView(defaultNoteSkin)),
                new Note(70750, new ImageView(defaultNoteSkin)),
                new Note(73250, new ImageView(defaultNoteSkin)),
                new Note(73875, new ImageView(defaultNoteSkin), 125),
                new Note(75250, new ImageView(defaultNoteSkin)),
                new Note(75875, new ImageView(defaultNoteSkin), 125),
                new Note(77250, new ImageView(defaultNoteSkin)),
                new Note(79250, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(2000, new ImageView(defaultNoteSkin)),
                new Note(2250, new ImageView(defaultNoteSkin)),
                new Note(3125, new ImageView(defaultNoteSkin)),
                new Note(3750, new ImageView(defaultNoteSkin)),
                new Note(6000, new ImageView(defaultNoteSkin)),
                new Note(6250, new ImageView(defaultNoteSkin)),
                new Note(7125, new ImageView(defaultNoteSkin)),
                new Note(10500, new ImageView(defaultNoteSkin)),
                new Note(18500, new ImageView(defaultNoteSkin)),
                new Note(22250, new ImageView(defaultNoteSkin)),
                new Note(23250, new ImageView(defaultNoteSkin)),
                new Note(29000, new ImageView(defaultNoteSkin)),
                new Note(29250, new ImageView(defaultNoteSkin)),
                new Note(30000, new ImageView(defaultNoteSkin)),
                new Note(31500, new ImageView(defaultNoteSkin)),
                new Note(37000, new ImageView(defaultNoteSkin)),
                new Note(37500, new ImageView(defaultNoteSkin)),
                new Note(39500, new ImageView(defaultNoteSkin), 375),
                new Note(42500, new ImageView(defaultNoteSkin)),
                new Note(50500, new ImageView(defaultNoteSkin)),
                new Note(54250, new ImageView(defaultNoteSkin)),
                new Note(54500, new ImageView(defaultNoteSkin)),
                new Note(55250, new ImageView(defaultNoteSkin)),
                new Note(61000, new ImageView(defaultNoteSkin)),
                new Note(61250, new ImageView(defaultNoteSkin)),
                new Note(62000, new ImageView(defaultNoteSkin)),
                new Note(63500, new ImageView(defaultNoteSkin)),
                new Note(69000, new ImageView(defaultNoteSkin)),
                new Note(69500, new ImageView(defaultNoteSkin)),
                new Note(71500, new ImageView(defaultNoteSkin), 375),
                new Note(72000, new ImageView(defaultNoteSkin)),
                new Note(72250, new ImageView(defaultNoteSkin)),
                new Note(73125, new ImageView(defaultNoteSkin)),
                new Note(73750, new ImageView(defaultNoteSkin)),
                new Note(74000, new ImageView(defaultNoteSkin)),
                new Note(74250, new ImageView(defaultNoteSkin)),
                new Note(75125, new ImageView(defaultNoteSkin)),
                new Note(75750, new ImageView(defaultNoteSkin)),
                new Note(76000, new ImageView(defaultNoteSkin)),
                new Note(76250, new ImageView(defaultNoteSkin)),
                new Note(77125, new ImageView(defaultNoteSkin)),
                new Note(78000, new ImageView(defaultNoteSkin)),
                new Note(78250, new ImageView(defaultNoteSkin)),
                new Note(79125, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(3500, new ImageView(defaultNoteSkin)),
                new Note(7500, new ImageView(defaultNoteSkin)),
                new Note(11000, new ImageView(defaultNoteSkin)),
                new Note(14500, new ImageView(defaultNoteSkin)),
                new Note(19500, new ImageView(defaultNoteSkin)),
                new Note(22750, new ImageView(defaultNoteSkin)),
                new Note(30250, new ImageView(defaultNoteSkin)),
                new Note(31000, new ImageView(defaultNoteSkin)),
                new Note(37750, new ImageView(defaultNoteSkin)),
                new Note(39000, new ImageView(defaultNoteSkin), 375),
                new Note(43000, new ImageView(defaultNoteSkin)),
                new Note(43500, new ImageView(defaultNoteSkin)),
                new Note(43750, new ImageView(defaultNoteSkin)),
                new Note(46500, new ImageView(defaultNoteSkin)),
                new Note(51750, new ImageView(defaultNoteSkin)),
                new Note(54750, new ImageView(defaultNoteSkin)),
                new Note(62250, new ImageView(defaultNoteSkin)),
                new Note(63000, new ImageView(defaultNoteSkin)),
                new Note(69750, new ImageView(defaultNoteSkin)),
                new Note(71000, new ImageView(defaultNoteSkin), 375),
                new Note(73500, new ImageView(defaultNoteSkin)),
                new Note(75500, new ImageView(defaultNoteSkin)),
                new Note(77500, new ImageView(defaultNoteSkin)),
                new Note(79500, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(2500, new ImageView(defaultNoteSkin)),
                new Note(2875, new ImageView(defaultNoteSkin)),
                new Note(3500, new ImageView(defaultNoteSkin)),
                new Note(6500, new ImageView(defaultNoteSkin)),
                new Note(6875, new ImageView(defaultNoteSkin)),
                new Note(7500, new ImageView(defaultNoteSkin)),
                new Note(7750, new ImageView(defaultNoteSkin), 125),
                new Note(14750, new ImageView(defaultNoteSkin)),
                new Note(18750, new ImageView(defaultNoteSkin)),
                new Note(22000, new ImageView(defaultNoteSkin)),
                new Note(23000, new ImageView(defaultNoteSkin)),
                new Note(28000, new ImageView(defaultNoteSkin)),
                new Note(30500, new ImageView(defaultNoteSkin)),
                new Note(31250, new ImageView(defaultNoteSkin)),
                new Note(36750, new ImageView(defaultNoteSkin)),
                new Note(37250, new ImageView(defaultNoteSkin)),
                new Note(38500, new ImageView(defaultNoteSkin)),
                new Note(46750, new ImageView(defaultNoteSkin)),
                new Note(50750, new ImageView(defaultNoteSkin)),
                new Note(54000, new ImageView(defaultNoteSkin)),
                new Note(55000, new ImageView(defaultNoteSkin)),
                new Note(60000, new ImageView(defaultNoteSkin)),
                new Note(62500, new ImageView(defaultNoteSkin)),
                new Note(63250, new ImageView(defaultNoteSkin)),
                new Note(68750, new ImageView(defaultNoteSkin)),
                new Note(69250, new ImageView(defaultNoteSkin)),
                new Note(70500, new ImageView(defaultNoteSkin)),
                new Note(72500, new ImageView(defaultNoteSkin)),
                new Note(72875, new ImageView(defaultNoteSkin)),
                new Note(73500, new ImageView(defaultNoteSkin)),
                new Note(74500, new ImageView(defaultNoteSkin)),
                new Note(74875, new ImageView(defaultNoteSkin)),
                new Note(75500, new ImageView(defaultNoteSkin)),
                new Note(76500, new ImageView(defaultNoteSkin)),
                new Note(76875, new ImageView(defaultNoteSkin)),
                new Note(77500, new ImageView(defaultNoteSkin)),
                new Note(78500, new ImageView(defaultNoteSkin)),
                new Note(78875, new ImageView(defaultNoteSkin)),
                new Note(79500, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getFreshDadChart(){
        Note[] leftNotes = {
                new Note(1250, new ImageView(defaultNoteSkin)),
                new Note(1875, new ImageView(defaultNoteSkin), 125),
                new Note(5250, new ImageView(defaultNoteSkin)),
                new Note(8250, new ImageView(defaultNoteSkin)),
                new Note(12250, new ImageView(defaultNoteSkin)),
                new Note(13000, new ImageView(defaultNoteSkin)),
                new Note(16250, new ImageView(defaultNoteSkin)),
                new Note(17000, new ImageView(defaultNoteSkin)),
                new Note(21750, new ImageView(defaultNoteSkin)),
                new Note(24500, new ImageView(defaultNoteSkin)),
                new Note(25500, new ImageView(defaultNoteSkin)),
                new Note(26750, new ImageView(defaultNoteSkin)),
                new Note(32500, new ImageView(defaultNoteSkin)),
                new Note(34250, new ImageView(defaultNoteSkin)),
                new Note(34750, new ImageView(defaultNoteSkin)),
                new Note(40250, new ImageView(defaultNoteSkin)),
                new Note(44250, new ImageView(defaultNoteSkin)),
                new Note(45000, new ImageView(defaultNoteSkin)),
                new Note(45750, new ImageView(defaultNoteSkin)),
                new Note(48250, new ImageView(defaultNoteSkin)),
                new Note(49000, new ImageView(defaultNoteSkin)),
                new Note(53750, new ImageView(defaultNoteSkin)),
                new Note(56500, new ImageView(defaultNoteSkin)),
                new Note(57500, new ImageView(defaultNoteSkin)),
                new Note(58750, new ImageView(defaultNoteSkin)),
                new Note(64500, new ImageView(defaultNoteSkin)),
                new Note(66250, new ImageView(defaultNoteSkin)),
                new Note(66750, new ImageView(defaultNoteSkin)),
                new Note(73250, new ImageView(defaultNoteSkin)),
                new Note(73875, new ImageView(defaultNoteSkin), 125),
                new Note(77250, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(0, new ImageView(defaultNoteSkin)),
                new Note(250, new ImageView(defaultNoteSkin)),
                new Note(1125, new ImageView(defaultNoteSkin)),
                new Note(1750, new ImageView(defaultNoteSkin)),
                new Note(4000, new ImageView(defaultNoteSkin)),
                new Note(4250, new ImageView(defaultNoteSkin)),
                new Note(5125, new ImageView(defaultNoteSkin)),
                new Note(8500, new ImageView(defaultNoteSkin)),
                new Note(16500, new ImageView(defaultNoteSkin)),
                new Note(20250, new ImageView(defaultNoteSkin)),
                new Note(21250, new ImageView(defaultNoteSkin)),
                new Note(25000, new ImageView(defaultNoteSkin)),
                new Note(25250, new ImageView(defaultNoteSkin)),
                new Note(26000, new ImageView(defaultNoteSkin)),
                new Note(27500, new ImageView(defaultNoteSkin)),
                new Note(33000, new ImageView(defaultNoteSkin)),
                new Note(33500, new ImageView(defaultNoteSkin)),
                new Note(35500, new ImageView(defaultNoteSkin), 375),
                new Note(40500, new ImageView(defaultNoteSkin)),
                new Note(48500, new ImageView(defaultNoteSkin)),
                new Note(52250, new ImageView(defaultNoteSkin)),
                new Note(52500, new ImageView(defaultNoteSkin)),
                new Note(53250, new ImageView(defaultNoteSkin)),
                new Note(57000, new ImageView(defaultNoteSkin)),
                new Note(57250, new ImageView(defaultNoteSkin)),
                new Note(58000, new ImageView(defaultNoteSkin)),
                new Note(59500, new ImageView(defaultNoteSkin)),
                new Note(65000, new ImageView(defaultNoteSkin)),
                new Note(65500, new ImageView(defaultNoteSkin)),
                new Note(67500, new ImageView(defaultNoteSkin), 375),
                new Note(72000, new ImageView(defaultNoteSkin)),
                new Note(72250, new ImageView(defaultNoteSkin)),
                new Note(73125, new ImageView(defaultNoteSkin)),
                new Note(73750, new ImageView(defaultNoteSkin)),
                new Note(76000, new ImageView(defaultNoteSkin)),
                new Note(76250, new ImageView(defaultNoteSkin)),
                new Note(77125, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(1500, new ImageView(defaultNoteSkin)),
                new Note(5500, new ImageView(defaultNoteSkin)),
                new Note(9000, new ImageView(defaultNoteSkin)),
                new Note(12500, new ImageView(defaultNoteSkin)),
                new Note(17500, new ImageView(defaultNoteSkin)),
                new Note(20750, new ImageView(defaultNoteSkin)),
                new Note(26250, new ImageView(defaultNoteSkin)),
                new Note(27000, new ImageView(defaultNoteSkin)),
                new Note(33750, new ImageView(defaultNoteSkin)),
                new Note(35000, new ImageView(defaultNoteSkin), 375),
                new Note(41000, new ImageView(defaultNoteSkin)),
                new Note(41500, new ImageView(defaultNoteSkin)),
                new Note(41750, new ImageView(defaultNoteSkin)),
                new Note(44500, new ImageView(defaultNoteSkin)),
                new Note(49750, new ImageView(defaultNoteSkin)),
                new Note(52750, new ImageView(defaultNoteSkin)),
                new Note(58250, new ImageView(defaultNoteSkin)),
                new Note(59000, new ImageView(defaultNoteSkin)),
                new Note(65750, new ImageView(defaultNoteSkin)),
                new Note(67000, new ImageView(defaultNoteSkin), 375),
                new Note(73500, new ImageView(defaultNoteSkin)),
                new Note(77500, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(500, new ImageView(defaultNoteSkin)),
                new Note(875, new ImageView(defaultNoteSkin)),
                new Note(1500, new ImageView(defaultNoteSkin)),
                new Note(4500, new ImageView(defaultNoteSkin)),
                new Note(4875, new ImageView(defaultNoteSkin)),
                new Note(5500, new ImageView(defaultNoteSkin)),
                new Note(5750, new ImageView(defaultNoteSkin), 125),
                new Note(12750, new ImageView(defaultNoteSkin)),
                new Note(16750, new ImageView(defaultNoteSkin)),
                new Note(20000, new ImageView(defaultNoteSkin)),
                new Note(21000, new ImageView(defaultNoteSkin)),
                new Note(24000, new ImageView(defaultNoteSkin)),
                new Note(26500, new ImageView(defaultNoteSkin)),
                new Note(27250, new ImageView(defaultNoteSkin)),
                new Note(32750, new ImageView(defaultNoteSkin)),
                new Note(33250, new ImageView(defaultNoteSkin)),
                new Note(34500, new ImageView(defaultNoteSkin)),
                new Note(44750, new ImageView(defaultNoteSkin)),
                new Note(48750, new ImageView(defaultNoteSkin)),
                new Note(52000, new ImageView(defaultNoteSkin)),
                new Note(53000, new ImageView(defaultNoteSkin)),
                new Note(56000, new ImageView(defaultNoteSkin)),
                new Note(58500, new ImageView(defaultNoteSkin)),
                new Note(59250, new ImageView(defaultNoteSkin)),
                new Note(64750, new ImageView(defaultNoteSkin)),
                new Note(65250, new ImageView(defaultNoteSkin)),
                new Note(66500, new ImageView(defaultNoteSkin)),
                new Note(72500, new ImageView(defaultNoteSkin)),
                new Note(72875, new ImageView(defaultNoteSkin)),
                new Note(73500, new ImageView(defaultNoteSkin)),
                new Note(76500, new ImageView(defaultNoteSkin)),
                new Note(76875, new ImageView(defaultNoteSkin)),
                new Note(77500, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getDadbattleBFChart(){
        Note[] leftNotes = {
                new Note(13666, new ImageView(defaultNoteSkin)),
                new Note(14333, new ImageView(defaultNoteSkin)),
                new Note(15000, new ImageView(defaultNoteSkin)),
                new Note(15666, new ImageView(defaultNoteSkin)),
                new Note(19000, new ImageView(defaultNoteSkin)),
                new Note(20333, new ImageView(defaultNoteSkin)),
                new Note(20500, new ImageView(defaultNoteSkin)),
                new Note(28666, new ImageView(defaultNoteSkin)),
                new Note(30333, new ImageView(defaultNoteSkin)),
                new Note(31000, new ImageView(defaultNoteSkin)),
                new Note(41333, new ImageView(defaultNoteSkin)),
                new Note(42333, new ImageView(defaultNoteSkin)),
                new Note(42833, new ImageView(defaultNoteSkin)),
                new Note(43666, new ImageView(defaultNoteSkin)),
                new Note(45000, new ImageView(defaultNoteSkin)),
                new Note(45333, new ImageView(defaultNoteSkin)),
                new Note(47333, new ImageView(defaultNoteSkin)),
                new Note(48666, new ImageView(defaultNoteSkin)),
                new Note(49333, new ImageView(defaultNoteSkin)),
                new Note(49500, new ImageView(defaultNoteSkin)),
                new Note(49833, new ImageView(defaultNoteSkin)),
                new Note(50833, new ImageView(defaultNoteSkin)),
                new Note(52000, new ImageView(defaultNoteSkin)),
                new Note(52166, new ImageView(defaultNoteSkin)),
                new Note(56333, new ImageView(defaultNoteSkin)),
                new Note(57000, new ImageView(defaultNoteSkin)),
                new Note(57666, new ImageView(defaultNoteSkin)),
                new Note(58333, new ImageView(defaultNoteSkin)),
                new Note(61666, new ImageView(defaultNoteSkin)),
                new Note(63000, new ImageView(defaultNoteSkin)),
                new Note(63166, new ImageView(defaultNoteSkin)),
                new Note(68000, new ImageView(defaultNoteSkin)),
                new Note(69000, new ImageView(defaultNoteSkin)),
                new Note(71333, new ImageView(defaultNoteSkin)),
                new Note(73000, new ImageView(defaultNoteSkin)),
                new Note(73666, new ImageView(defaultNoteSkin)),
                new Note(77666, new ImageView(defaultNoteSkin)),
                new Note(78333, new ImageView(defaultNoteSkin)),
                new Note(79000, new ImageView(defaultNoteSkin)),
                new Note(83000, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(13833, new ImageView(defaultNoteSkin)),
                new Note(15166, new ImageView(defaultNoteSkin)),
                new Note(18666, new ImageView(defaultNoteSkin)),
                new Note(19333, new ImageView(defaultNoteSkin)),
                new Note(20000, new ImageView(defaultNoteSkin)),
                new Note(27166, new ImageView(defaultNoteSkin)),
                new Note(28166, new ImageView(defaultNoteSkin)),
                new Note(30000, new ImageView(defaultNoteSkin)),
                new Note(30500, new ImageView(defaultNoteSkin)),
                new Note(41500, new ImageView(defaultNoteSkin)),
                new Note(42166, new ImageView(defaultNoteSkin)),
                new Note(42500, new ImageView(defaultNoteSkin)),
                new Note(43333, new ImageView(defaultNoteSkin)),
                new Note(44500, new ImageView(defaultNoteSkin)),
                new Note(45666, new ImageView(defaultNoteSkin)),
                new Note(46333, new ImageView(defaultNoteSkin)),
                new Note(47333, new ImageView(defaultNoteSkin)),
                new Note(48166, new ImageView(defaultNoteSkin)),
                new Note(49000, new ImageView(defaultNoteSkin)),
                new Note(49666, new ImageView(defaultNoteSkin)),
                new Note(50333, new ImageView(defaultNoteSkin)),
                new Note(51166, new ImageView(defaultNoteSkin)),
                new Note(51666, new ImageView(defaultNoteSkin)),
                new Note(53000, new ImageView(defaultNoteSkin)),
                new Note(56500, new ImageView(defaultNoteSkin)),
                new Note(57833, new ImageView(defaultNoteSkin)),
                new Note(61333, new ImageView(defaultNoteSkin)),
                new Note(62000, new ImageView(defaultNoteSkin)),
                new Note(62666, new ImageView(defaultNoteSkin)),
                new Note(68166, new ImageView(defaultNoteSkin)),
                new Note(68833, new ImageView(defaultNoteSkin)),
                new Note(69166, new ImageView(defaultNoteSkin), 333),
                new Note(69833, new ImageView(defaultNoteSkin)),
                new Note(70833, new ImageView(defaultNoteSkin)),
                new Note(72666, new ImageView(defaultNoteSkin)),
                new Note(73166, new ImageView(defaultNoteSkin)),
                new Note(77833, new ImageView(defaultNoteSkin)),
                new Note(79166, new ImageView(defaultNoteSkin)),
                new Note(82666, new ImageView(defaultNoteSkin)),
                new Note(83333, new ImageView(defaultNoteSkin)),
                new Note(84000, new ImageView(defaultNoteSkin)),
                new Note(84333, new ImageView(defaultNoteSkin)),
                new Note(84666, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(13333, new ImageView(defaultNoteSkin)),
                new Note(14000, new ImageView(defaultNoteSkin)),
                new Note(14666, new ImageView(defaultNoteSkin)),
                new Note(15333, new ImageView(defaultNoteSkin)),
                new Note(19666, new ImageView(defaultNoteSkin)),
                new Note(27000, new ImageView(defaultNoteSkin)),
                new Note(29666, new ImageView(defaultNoteSkin)),
                new Note(30666, new ImageView(defaultNoteSkin)),
                new Note(31333, new ImageView(defaultNoteSkin)),
                new Note(41666, new ImageView(defaultNoteSkin)),
                new Note(42000, new ImageView(defaultNoteSkin)),
                new Note(43166, new ImageView(defaultNoteSkin)),
                new Note(44166, new ImageView(defaultNoteSkin)),
                new Note(44666, new ImageView(defaultNoteSkin)),
                new Note(46666, new ImageView(defaultNoteSkin)),
                new Note(48500, new ImageView(defaultNoteSkin)),
                new Note(48833, new ImageView(defaultNoteSkin)),
                new Note(50000, new ImageView(defaultNoteSkin)),
                new Note(51333, new ImageView(defaultNoteSkin)),
                new Note(52333, new ImageView(defaultNoteSkin)),
                new Note(52500, new ImageView(defaultNoteSkin)),
                new Note(56000, new ImageView(defaultNoteSkin)),
                new Note(56666, new ImageView(defaultNoteSkin)),
                new Note(57333, new ImageView(defaultNoteSkin)),
                new Note(58000, new ImageView(defaultNoteSkin)),
                new Note(62333, new ImageView(defaultNoteSkin)),
                new Note(68333, new ImageView(defaultNoteSkin)),
                new Note(68666, new ImageView(defaultNoteSkin)),
                new Note(69666, new ImageView(defaultNoteSkin)),
                new Note(72333, new ImageView(defaultNoteSkin)),
                new Note(73333, new ImageView(defaultNoteSkin)),
                new Note(74000, new ImageView(defaultNoteSkin)),
                new Note(77333, new ImageView(defaultNoteSkin)),
                new Note(78000, new ImageView(defaultNoteSkin)),
                new Note(78666, new ImageView(defaultNoteSkin)),
                new Note(79333, new ImageView(defaultNoteSkin)),
                new Note(79666, new ImageView(defaultNoteSkin)),
                new Note(83666, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(14500, new ImageView(defaultNoteSkin)),
                new Note(14833, new ImageView(defaultNoteSkin)),
                new Note(15833, new ImageView(defaultNoteSkin)),
                new Note(19166, new ImageView(defaultNoteSkin)),
                new Note(20666, new ImageView(defaultNoteSkin)),
                new Note(20833, new ImageView(defaultNoteSkin)),
                new Note(21000, new ImageView(defaultNoteSkin)),
                new Note(21166, new ImageView(defaultNoteSkin)),
                new Note(27333, new ImageView(defaultNoteSkin)),
                new Note(28333, new ImageView(defaultNoteSkin)),
                new Note(30833, new ImageView(defaultNoteSkin)),
                new Note(31166, new ImageView(defaultNoteSkin)),
                new Note(41833, new ImageView(defaultNoteSkin)),
                new Note(43000, new ImageView(defaultNoteSkin)),
                new Note(44333, new ImageView(defaultNoteSkin)),
                new Note(46000, new ImageView(defaultNoteSkin)),
                new Note(47000, new ImageView(defaultNoteSkin)),
                new Note(48333, new ImageView(defaultNoteSkin)),
                new Note(49416, new ImageView(defaultNoteSkin)),
                new Note(50166, new ImageView(defaultNoteSkin)),
                new Note(51000, new ImageView(defaultNoteSkin)),
                new Note(51500, new ImageView(defaultNoteSkin)),
                new Note(51833, new ImageView(defaultNoteSkin)),
                new Note(52666, new ImageView(defaultNoteSkin)),
                new Note(53000, new ImageView(defaultNoteSkin)),
                new Note(57166, new ImageView(defaultNoteSkin)),
                new Note(57500, new ImageView(defaultNoteSkin)),
                new Note(58500, new ImageView(defaultNoteSkin)),
                new Note(61833, new ImageView(defaultNoteSkin)),
                new Note(63333, new ImageView(defaultNoteSkin)),
                new Note(63500, new ImageView(defaultNoteSkin)),
                new Note(63666, new ImageView(defaultNoteSkin)),
                new Note(63833, new ImageView(defaultNoteSkin)),
                new Note(68500, new ImageView(defaultNoteSkin)),
                new Note(70000, new ImageView(defaultNoteSkin)),
                new Note(71000, new ImageView(defaultNoteSkin)),
                new Note(73500, new ImageView(defaultNoteSkin)),
                new Note(73833, new ImageView(defaultNoteSkin)),
                new Note(78500, new ImageView(defaultNoteSkin)),
                new Note(78833, new ImageView(defaultNoteSkin)),
                new Note(83166, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getDadbattleDadChart(){
        Note[] leftNotes = {
                new Note(11000, new ImageView(defaultNoteSkin)),
                new Note(11666, new ImageView(defaultNoteSkin)),
                new Note(12333, new ImageView(defaultNoteSkin)),
                new Note(13000, new ImageView(defaultNoteSkin)),
                new Note(16333, new ImageView(defaultNoteSkin)),
                new Note(17666, new ImageView(defaultNoteSkin)),
                new Note(17833, new ImageView(defaultNoteSkin)),
                new Note(23333, new ImageView(defaultNoteSkin)),
                new Note(25000, new ImageView(defaultNoteSkin)),
                new Note(25666, new ImageView(defaultNoteSkin)),
                new Note(30666, new ImageView(defaultNoteSkin)),
                new Note(31666, new ImageView(defaultNoteSkin)),
                new Note(32166, new ImageView(defaultNoteSkin)),
                new Note(33000, new ImageView(defaultNoteSkin)),
                new Note(34333, new ImageView(defaultNoteSkin)),
                new Note(34666, new ImageView(defaultNoteSkin)),
                new Note(36666, new ImageView(defaultNoteSkin)),
                new Note(38000, new ImageView(defaultNoteSkin)),
                new Note(38666, new ImageView(defaultNoteSkin)),
                new Note(38833, new ImageView(defaultNoteSkin)),
                new Note(39166, new ImageView(defaultNoteSkin)),
                new Note(40166, new ImageView(defaultNoteSkin)),
                new Note(41333, new ImageView(defaultNoteSkin)),
                new Note(41666, new ImageView(defaultNoteSkin)),
                new Note(53666, new ImageView(defaultNoteSkin)),
                new Note(54333, new ImageView(defaultNoteSkin)),
                new Note(55000, new ImageView(defaultNoteSkin)),
                new Note(55666, new ImageView(defaultNoteSkin)),
                new Note(59000, new ImageView(defaultNoteSkin)),
                new Note(60333, new ImageView(defaultNoteSkin)),
                new Note(60500, new ImageView(defaultNoteSkin)),
                new Note(62666, new ImageView(defaultNoteSkin)),
                new Note(63666, new ImageView(defaultNoteSkin)),
                new Note(66000, new ImageView(defaultNoteSkin)),
                new Note(67666, new ImageView(defaultNoteSkin)),
                new Note(68333, new ImageView(defaultNoteSkin)),
                new Note(75000, new ImageView(defaultNoteSkin)),
                new Note(75666, new ImageView(defaultNoteSkin)),
                new Note(76333, new ImageView(defaultNoteSkin)),
                new Note(80333, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(11166, new ImageView(defaultNoteSkin)),
                new Note(12500, new ImageView(defaultNoteSkin)),
                new Note(16000, new ImageView(defaultNoteSkin)),
                new Note(16666, new ImageView(defaultNoteSkin)),
                new Note(17333, new ImageView(defaultNoteSkin)),
                new Note(21833, new ImageView(defaultNoteSkin)),
                new Note(22833, new ImageView(defaultNoteSkin)),
                new Note(24666, new ImageView(defaultNoteSkin)),
                new Note(25166, new ImageView(defaultNoteSkin)),
                new Note(30833, new ImageView(defaultNoteSkin)),
                new Note(31500, new ImageView(defaultNoteSkin)),
                new Note(31833, new ImageView(defaultNoteSkin)),
                new Note(32666, new ImageView(defaultNoteSkin)),
                new Note(33833, new ImageView(defaultNoteSkin)),
                new Note(35000, new ImageView(defaultNoteSkin)),
                new Note(35666, new ImageView(defaultNoteSkin)),
                new Note(36666, new ImageView(defaultNoteSkin)),
                new Note(37500, new ImageView(defaultNoteSkin)),
                new Note(38333, new ImageView(defaultNoteSkin)),
                new Note(39000, new ImageView(defaultNoteSkin)),
                new Note(39666, new ImageView(defaultNoteSkin)),
                new Note(40500, new ImageView(defaultNoteSkin)),
                new Note(41000, new ImageView(defaultNoteSkin)),
                new Note(41500, new ImageView(defaultNoteSkin)),
                new Note(53833, new ImageView(defaultNoteSkin)),
                new Note(55166, new ImageView(defaultNoteSkin)),
                new Note(58666, new ImageView(defaultNoteSkin)),
                new Note(59333, new ImageView(defaultNoteSkin)),
                new Note(60000, new ImageView(defaultNoteSkin)),
                new Note(62833, new ImageView(defaultNoteSkin)),
                new Note(63500, new ImageView(defaultNoteSkin)),
                new Note(63833, new ImageView(defaultNoteSkin), 333),
                new Note(64500, new ImageView(defaultNoteSkin)),
                new Note(65500, new ImageView(defaultNoteSkin)),
                new Note(67333, new ImageView(defaultNoteSkin)),
                new Note(67833, new ImageView(defaultNoteSkin)),
                new Note(75166, new ImageView(defaultNoteSkin)),
                new Note(76500, new ImageView(defaultNoteSkin)),
                new Note(80000, new ImageView(defaultNoteSkin)),
                new Note(80666, new ImageView(defaultNoteSkin)),
                new Note(81333, new ImageView(defaultNoteSkin)),
                new Note(81666, new ImageView(defaultNoteSkin)),
                new Note(82000, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(10666, new ImageView(defaultNoteSkin)),
                new Note(11333, new ImageView(defaultNoteSkin)),
                new Note(12000, new ImageView(defaultNoteSkin)),
                new Note(12666, new ImageView(defaultNoteSkin)),
                new Note(17000, new ImageView(defaultNoteSkin)),
                new Note(21666, new ImageView(defaultNoteSkin)),
                new Note(24333, new ImageView(defaultNoteSkin)),
                new Note(25333, new ImageView(defaultNoteSkin)),
                new Note(26000, new ImageView(defaultNoteSkin)),
                new Note(31000, new ImageView(defaultNoteSkin)),
                new Note(31333, new ImageView(defaultNoteSkin)),
                new Note(32500, new ImageView(defaultNoteSkin)),
                new Note(33500, new ImageView(defaultNoteSkin)),
                new Note(34000, new ImageView(defaultNoteSkin)),
                new Note(36000, new ImageView(defaultNoteSkin)),
                new Note(37833, new ImageView(defaultNoteSkin)),
                new Note(38166, new ImageView(defaultNoteSkin)),
                new Note(39333, new ImageView(defaultNoteSkin)),
                new Note(40666, new ImageView(defaultNoteSkin)),
                new Note(42000, new ImageView(defaultNoteSkin)),
                new Note(53333, new ImageView(defaultNoteSkin)),
                new Note(54000, new ImageView(defaultNoteSkin)),
                new Note(54666, new ImageView(defaultNoteSkin)),
                new Note(55333, new ImageView(defaultNoteSkin)),
                new Note(59666, new ImageView(defaultNoteSkin)),
                new Note(63000, new ImageView(defaultNoteSkin)),
                new Note(63333, new ImageView(defaultNoteSkin)),
                new Note(64333, new ImageView(defaultNoteSkin)),
                new Note(67000, new ImageView(defaultNoteSkin)),
                new Note(68000, new ImageView(defaultNoteSkin)),
                new Note(68666, new ImageView(defaultNoteSkin)),
                new Note(74666, new ImageView(defaultNoteSkin)),
                new Note(75333, new ImageView(defaultNoteSkin)),
                new Note(76000, new ImageView(defaultNoteSkin)),
                new Note(76666, new ImageView(defaultNoteSkin)),
                new Note(77000, new ImageView(defaultNoteSkin)),
                new Note(81000, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(11833, new ImageView(defaultNoteSkin)),
                new Note(12166, new ImageView(defaultNoteSkin)),
                new Note(13166, new ImageView(defaultNoteSkin)),
                new Note(16500, new ImageView(defaultNoteSkin)),
                new Note(18000, new ImageView(defaultNoteSkin)),
                new Note(18166, new ImageView(defaultNoteSkin)),
                new Note(18333, new ImageView(defaultNoteSkin)),
                new Note(18500, new ImageView(defaultNoteSkin)),
                new Note(22000, new ImageView(defaultNoteSkin)),
                new Note(23000, new ImageView(defaultNoteSkin)),
                new Note(25500, new ImageView(defaultNoteSkin)),
                new Note(25833, new ImageView(defaultNoteSkin)),
                new Note(31166, new ImageView(defaultNoteSkin)),
                new Note(32333, new ImageView(defaultNoteSkin)),
                new Note(33666, new ImageView(defaultNoteSkin)),
                new Note(35333, new ImageView(defaultNoteSkin)),
                new Note(36333, new ImageView(defaultNoteSkin)),
                new Note(37666, new ImageView(defaultNoteSkin)),
                new Note(38750, new ImageView(defaultNoteSkin)),
                new Note(39500, new ImageView(defaultNoteSkin)),
                new Note(40333, new ImageView(defaultNoteSkin)),
                new Note(40833, new ImageView(defaultNoteSkin)),
                new Note(41166, new ImageView(defaultNoteSkin)),
                new Note(41833, new ImageView(defaultNoteSkin)),
                new Note(42333, new ImageView(defaultNoteSkin)),
                new Note(54500, new ImageView(defaultNoteSkin)),
                new Note(54833, new ImageView(defaultNoteSkin)),
                new Note(55833, new ImageView(defaultNoteSkin)),
                new Note(59166, new ImageView(defaultNoteSkin)),
                new Note(60666, new ImageView(defaultNoteSkin)),
                new Note(60833, new ImageView(defaultNoteSkin)),
                new Note(61000, new ImageView(defaultNoteSkin)),
                new Note(61166, new ImageView(defaultNoteSkin)),
                new Note(63166, new ImageView(defaultNoteSkin)),
                new Note(64666, new ImageView(defaultNoteSkin)),
                new Note(65666, new ImageView(defaultNoteSkin)),
                new Note(68166, new ImageView(defaultNoteSkin)),
                new Note(68500, new ImageView(defaultNoteSkin)),
                new Note(75833, new ImageView(defaultNoteSkin)),
                new Note(76166, new ImageView(defaultNoteSkin)),
                new Note(80500, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getBergentruckungBFChart(){
        Note[] leftNotes = {
                new Note(2130, new ImageView(defaultNoteSkin)),
                new Note(5830, new ImageView(defaultNoteSkin)),
                new Note(6370, new ImageView(defaultNoteSkin)),
                new Note(10610, new ImageView(defaultNoteSkin)),
                new Note(12740, new ImageView(defaultNoteSkin)),
                new Note(13270, new ImageView(defaultNoteSkin)),
                new Note(15400, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(2650, new ImageView(defaultNoteSkin)),
                new Note(6900, new ImageView(defaultNoteSkin)),
                new Note(11150, new ImageView(defaultNoteSkin)),
                new Note(13000, new ImageView(defaultNoteSkin)),
                new Note(13530, new ImageView(defaultNoteSkin)),
                new Note(14990, new ImageView(defaultNoteSkin)),
                new Note(15650, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(3190, new ImageView(defaultNoteSkin), 930),
                new Note(6100, new ImageView(defaultNoteSkin)),
                new Note(7430, new ImageView(defaultNoteSkin), 870),
                new Note(11680, new ImageView(defaultNoteSkin), 490),
                new Note(13800, new ImageView(defaultNoteSkin), 530),
                new Note(15130, new ImageView(defaultNoteSkin)),
                new Note(15920, new ImageView(defaultNoteSkin), 1100)
        };
        Note[] rightNotes = {
                new Note(5580, new ImageView(defaultNoteSkin)),
                new Note(12170, new ImageView(defaultNoteSkin), 570),
                new Note(14330, new ImageView(defaultNoteSkin)),
                new Note(14860, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getBergentruckungAsgoreChart(){
        Note[] leftNotes = {
                new Note(0, new ImageView(defaultNoteSkin)),
                new Note(4250, new ImageView(defaultNoteSkin)),
                new Note(8490, new ImageView(defaultNoteSkin)),
                new Note(12740, new ImageView(defaultNoteSkin)),
                new Note(13270, new ImageView(defaultNoteSkin)),
                new Note(15400, new ImageView(defaultNoteSkin))

        };
        Note[] downNotes = {
                new Note(530, new ImageView(defaultNoteSkin)),
                new Note(4780, new ImageView(defaultNoteSkin)),
                new Note(9030, new ImageView(defaultNoteSkin)),
                new Note(13000, new ImageView(defaultNoteSkin)),
                new Note(13530, new ImageView(defaultNoteSkin)),
                new Note(14990, new ImageView(defaultNoteSkin)),
                new Note(15650, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(1050, new ImageView(defaultNoteSkin), 950),
                new Note(5300, new ImageView(defaultNoteSkin), 860),
                new Note(9550, new ImageView(defaultNoteSkin), 940),
                new Note(13800, new ImageView(defaultNoteSkin), 530),
                new Note(15130, new ImageView(defaultNoteSkin)),
                new Note(15920, new ImageView(defaultNoteSkin), 1100)
        };
        Note[] rightNotes = {
                new Note(14330, new ImageView(defaultNoteSkin)),
                new Note(14860, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getAsgoreBFChart(){
        Note[] leftNotes = {
                new Note(4180, new ImageView(defaultNoteSkin)),
                new Note(6270, new ImageView(defaultNoteSkin)),
                new Note(6530, new ImageView(defaultNoteSkin)),
                new Note(8360, new ImageView(defaultNoteSkin)),
                new Note(10195, new ImageView(defaultNoteSkin)),
                new Note(11230, new ImageView(defaultNoteSkin)),
                new Note(12280, new ImageView(defaultNoteSkin)),
                new Note(13600, new ImageView(defaultNoteSkin), 1830),
                new Note(15550, new ImageView(defaultNoteSkin)),
                new Note(15700, new ImageView(defaultNoteSkin), 560),

                new Note(20900, new ImageView(defaultNoteSkin)),
                new Note(22990, new ImageView(defaultNoteSkin)),
                new Note(23380, new ImageView(defaultNoteSkin)),
                new Note(25080, new ImageView(defaultNoteSkin)),
                new Note(26910, new ImageView(defaultNoteSkin)),
                new Note(27950, new ImageView(defaultNoteSkin)),
                new Note(28990, new ImageView(defaultNoteSkin)),
                new Note(30310, new ImageView(defaultNoteSkin), 1830),
                new Note(32270, new ImageView(defaultNoteSkin)),
                new Note(32400, new ImageView(defaultNoteSkin), 560),

                new Note(36570, new ImageView(defaultNoteSkin)),
                new Note(36830, new ImageView(defaultNoteSkin)),
                new Note(37090, new ImageView(defaultNoteSkin)),
                new Note(37490, new ImageView(defaultNoteSkin)),
                new Note(37750, new ImageView(defaultNoteSkin)),
                new Note(41140, new ImageView(defaultNoteSkin)),
                new Note(42190, new ImageView(defaultNoteSkin)),

                new Note(44280, new ImageView(defaultNoteSkin)),
                new Note(48460, new ImageView(defaultNoteSkin)),

                new Note(51200, new ImageView(defaultNoteSkin)),
                new Note(51470, new ImageView(defaultNoteSkin)),
                new Note(51730, new ImageView(defaultNoteSkin)),
                new Note(51990, new ImageView(defaultNoteSkin)),
                new Note(52400, new ImageView(defaultNoteSkin)),
                new Note(54730, new ImageView(defaultNoteSkin)),
                new Note(55390, new ImageView(defaultNoteSkin)),
                new Note(55650, new ImageView(defaultNoteSkin)),
                new Note(55900, new ImageView(defaultNoteSkin)),
                new Note(56300, new ImageView(defaultNoteSkin)),
                new Note(56570, new ImageView(defaultNoteSkin)),
                new Note(59310, new ImageView(defaultNoteSkin)),

                new Note(61010, new ImageView(defaultNoteSkin)),
                new Note(61660, new ImageView(defaultNoteSkin)),
                new Note(61920, new ImageView(defaultNoteSkin)),
                new Note(62190, new ImageView(defaultNoteSkin)),
                new Note(62700, new ImageView(defaultNoteSkin)),
                new Note(62830, new ImageView(defaultNoteSkin)),
                new Note(65180, new ImageView(defaultNoteSkin)),
                new Note(66220, new ImageView(defaultNoteSkin)),
                new Note(67270, new ImageView(defaultNoteSkin)),

                new Note(67930, new ImageView(defaultNoteSkin)),
                new Note(68180, new ImageView(defaultNoteSkin)),
                new Note(68430, new ImageView(defaultNoteSkin)),
                new Note(68700, new ImageView(defaultNoteSkin)),
                new Note(69100, new ImageView(defaultNoteSkin)),
                new Note(71430, new ImageView(defaultNoteSkin)),
                new Note(72110, new ImageView(defaultNoteSkin)),
                new Note(72360, new ImageView(defaultNoteSkin)),
                new Note(72620, new ImageView(defaultNoteSkin)),
                new Note(73020, new ImageView(defaultNoteSkin)),
                new Note(73280, new ImageView(defaultNoteSkin)),
                new Note(76050, new ImageView(defaultNoteSkin)),

                new Note(77720, new ImageView(defaultNoteSkin)),
                new Note(78370, new ImageView(defaultNoteSkin)),
                new Note(78630, new ImageView(defaultNoteSkin)),
                new Note(78880, new ImageView(defaultNoteSkin)),
                new Note(79280, new ImageView(defaultNoteSkin)),
                new Note(79540, new ImageView(defaultNoteSkin)),
                new Note(81900, new ImageView(defaultNoteSkin)),
                new Note(82930, new ImageView(defaultNoteSkin)),
                new Note(83990, new ImageView(defaultNoteSkin)),

                new Note(86210, new ImageView(defaultNoteSkin)),
                new Note(87770, new ImageView(defaultNoteSkin)),

                new Note(91950, new ImageView(defaultNoteSkin)),
                new Note(95090, new ImageView(defaultNoteSkin), 770),
                new Note(95860, new ImageView(defaultNoteSkin)),
                new Note(99270, new ImageView(defaultNoteSkin), 770),
                new Note(100040, new ImageView(defaultNoteSkin)),
                new Note(101360, new ImageView(defaultNoteSkin), 1200),
                new Note(103450, new ImageView(defaultNoteSkin), 700),
                new Note(104220, new ImageView(defaultNoteSkin)),
                new Note(108370, new ImageView(defaultNoteSkin)),

                new Note(118860, new ImageView(defaultNoteSkin)),
                new Note(119510, new ImageView(defaultNoteSkin)),
                new Note(119900, new ImageView(defaultNoteSkin)),
                new Note(123040, new ImageView(defaultNoteSkin)),
                new Note(123690, new ImageView(defaultNoteSkin)),
                new Note(124070, new ImageView(defaultNoteSkin)),

                new Note(135050, new ImageView(defaultNoteSkin)),
                new Note(135290, new ImageView(defaultNoteSkin)),
                new Note(136230, new ImageView(defaultNoteSkin)),
                new Note(136620, new ImageView(defaultNoteSkin)),
                new Note(137140, new ImageView(defaultNoteSkin)),
                new Note(137780, new ImageView(defaultNoteSkin)),
                new Note(139360, new ImageView(defaultNoteSkin)),
                new Note(139630, new ImageView(defaultNoteSkin)),
                new Note(140400, new ImageView(defaultNoteSkin)),

                new Note(144170, new ImageView(defaultNoteSkin), 780),
                new Note(148360, new ImageView(defaultNoteSkin), 780),

                new Note(150200, new ImageView(defaultNoteSkin)),
                new Note(152280, new ImageView(defaultNoteSkin))
        };
        Note[] downNotes = new Note[]{
                new Note(4700, new ImageView(defaultNoteSkin)),
                new Note(6010, new ImageView(defaultNoteSkin)),
                new Note(7050, new ImageView(defaultNoteSkin)),
                new Note(8880, new ImageView(defaultNoteSkin)),
                new Note(10195, new ImageView(defaultNoteSkin)),
                new Note(11230, new ImageView(defaultNoteSkin)),
                new Note(12530, new ImageView(defaultNoteSkin)),
                new Note(13600, new ImageView(defaultNoteSkin), 1820),
                new Note(15420, new ImageView(defaultNoteSkin)),

                new Note(21410, new ImageView(defaultNoteSkin)),
                new Note(22720, new ImageView(defaultNoteSkin)),
                new Note(23760, new ImageView(defaultNoteSkin)),
                new Note(25600, new ImageView(defaultNoteSkin)),
                new Note(26910, new ImageView(defaultNoteSkin)),
                new Note(27950, new ImageView(defaultNoteSkin)),
                new Note(29260, new ImageView(defaultNoteSkin)),
                new Note(32140, new ImageView(defaultNoteSkin)),
                new Note(30310, new ImageView(defaultNoteSkin), 1820),
                new Note(32140, new ImageView(defaultNoteSkin)),

                new Note(36690, new ImageView(defaultNoteSkin)),
                new Note(36960, new ImageView(defaultNoteSkin)),
                new Note(37880, new ImageView(defaultNoteSkin)),
                new Note(40750, new ImageView(defaultNoteSkin), 390),
                new Note(41900, new ImageView(defaultNoteSkin)),
                new Note(42500, new ImageView(defaultNoteSkin)),

                new Note(44410, new ImageView(defaultNoteSkin)),
                new Note(48590, new ImageView(defaultNoteSkin)),

                new Note(51340, new ImageView(defaultNoteSkin)),
                new Note(51600, new ImageView(defaultNoteSkin)),
                new Note(52520, new ImageView(defaultNoteSkin)),
                new Note(54870, new ImageView(defaultNoteSkin)),
                new Note(55520, new ImageView(defaultNoteSkin)),
                new Note(55780, new ImageView(defaultNoteSkin)),
                new Note(56700, new ImageView(defaultNoteSkin)),
                new Note(58260, new ImageView(defaultNoteSkin)),
                new Note(58530, new ImageView(defaultNoteSkin)),
                new Note(59270, new ImageView(defaultNoteSkin)),

                new Note(61130, new ImageView(defaultNoteSkin)),
                new Note(61790, new ImageView(defaultNoteSkin)),
                new Note(62060, new ImageView(defaultNoteSkin)),
                new Note(62960, new ImageView(defaultNoteSkin)),
                new Note(65300, new ImageView(defaultNoteSkin)),
                new Note(65830, new ImageView(defaultNoteSkin), 390),
                new Note(67000, new ImageView(defaultNoteSkin)),
                new Note(67650, new ImageView(defaultNoteSkin)),

                new Note(68050, new ImageView(defaultNoteSkin)),
                new Note(68320, new ImageView(defaultNoteSkin)),
                new Note(69230, new ImageView(defaultNoteSkin)),
                new Note(71580, new ImageView(defaultNoteSkin)),
                new Note(72240, new ImageView(defaultNoteSkin)),
                new Note(72500, new ImageView(defaultNoteSkin)),
                new Note(73400, new ImageView(defaultNoteSkin)),
                new Note(74970, new ImageView(defaultNoteSkin)),
                new Note(75230, new ImageView(defaultNoteSkin)),
                new Note(76010, new ImageView(defaultNoteSkin)),

                new Note(77850, new ImageView(defaultNoteSkin)),
                new Note(78510, new ImageView(defaultNoteSkin)),
                new Note(78770, new ImageView(defaultNoteSkin)),
                new Note(79670, new ImageView(defaultNoteSkin)),
                new Note(82030, new ImageView(defaultNoteSkin)),
                new Note(82560, new ImageView(defaultNoteSkin), 390),
                new Note(83710, new ImageView(defaultNoteSkin)),
                new Note(84310, new ImageView(defaultNoteSkin)),

                new Note(86460, new ImageView(defaultNoteSkin)),
                new Note(88160, new ImageView(defaultNoteSkin)),

                new Note(92350, new ImageView(defaultNoteSkin)),
                new Note(92730, new ImageView(defaultNoteSkin)),
                new Note(96390, new ImageView(defaultNoteSkin)),
                new Note(96910, new ImageView(defaultNoteSkin)),
                new Note(100570, new ImageView(defaultNoteSkin)),
                new Note(104750, new ImageView(defaultNoteSkin)),
                new Note(105270, new ImageView(defaultNoteSkin)),
                new Note(108030, new ImageView(defaultNoteSkin)),
                new Note(109060, new ImageView(defaultNoteSkin)),

                new Note(118330, new ImageView(defaultNoteSkin)),
                new Note(118470, new ImageView(defaultNoteSkin)),
                new Note(119130, new ImageView(defaultNoteSkin)),
                new Note(120040, new ImageView(defaultNoteSkin)),
                new Note(120820, new ImageView(defaultNoteSkin)),
                new Note(122530, new ImageView(defaultNoteSkin)),
                new Note(122670, new ImageView(defaultNoteSkin)),
                new Note(123300, new ImageView(defaultNoteSkin)),
                new Note(124210, new ImageView(defaultNoteSkin)),
                new Note(125380, new ImageView(defaultNoteSkin), 1060),

                new Note(134790, new ImageView(defaultNoteSkin)),
                new Note(135570, new ImageView(defaultNoteSkin)),
                new Note(135840, new ImageView(defaultNoteSkin)),
                new Note(136760, new ImageView(defaultNoteSkin)),
                new Note(137400, new ImageView(defaultNoteSkin)),
                new Note(137920, new ImageView(defaultNoteSkin), 260),
                new Note(138840, new ImageView(defaultNoteSkin)),
                new Note(139230, new ImageView(defaultNoteSkin)),
                new Note(139480, new ImageView(defaultNoteSkin)),
                new Note(139750, new ImageView(defaultNoteSkin)),
                new Note(140020, new ImageView(defaultNoteSkin)),

                new Note(142880, new ImageView(defaultNoteSkin)),
                new Note(143930, new ImageView(defaultNoteSkin), 260),
                new Note(147060, new ImageView(defaultNoteSkin)),
                new Note(148100, new ImageView(defaultNoteSkin), 260),

                new Note(149150, new ImageView(defaultNoteSkin)),
                new Note(150450, new ImageView(defaultNoteSkin)),
                new Note(150850, new ImageView(defaultNoteSkin)),
                new Note(151250, new ImageView(defaultNoteSkin)),
                new Note(152550, new ImageView(defaultNoteSkin)),
                new Note(152940, new ImageView(defaultNoteSkin)),
                new Note(153330, new ImageView(defaultNoteSkin))

        };
        Note[] upNotes = new Note[]{
                new Note(5230, new ImageView(defaultNoteSkin), 520),
                new Note(7310, new ImageView(defaultNoteSkin), 1050),
                new Note(8360, new ImageView(defaultNoteSkin)),
                new Note(9405, new ImageView(defaultNoteSkin), 790),
                new Note(10440, new ImageView(defaultNoteSkin)),
                new Note(10720, new ImageView(defaultNoteSkin)),
                new Note(11490, new ImageView(defaultNoteSkin), 790),
                new Note(12280, new ImageView(defaultNoteSkin)),

                new Note(21940, new ImageView(defaultNoteSkin), 520),
                new Note(24030, new ImageView(defaultNoteSkin), 790),
                new Note(25080, new ImageView(defaultNoteSkin)),
                new Note(26120, new ImageView(defaultNoteSkin), 790),
                new Note(27200, new ImageView(defaultNoteSkin)),
                new Note(27570, new ImageView(defaultNoteSkin)),
                new Note(28200, new ImageView(defaultNoteSkin), 790),
                new Note(28990, new ImageView(defaultNoteSkin)),

                new Note(38140, new ImageView(defaultNoteSkin)),
                new Note(41540, new ImageView(defaultNoteSkin)),
                new Note(41760, new ImageView(defaultNoteSkin)),
                new Note(42540, new ImageView(defaultNoteSkin)),

                new Note(42970, new ImageView(defaultNoteSkin)),
                new Note(43230, new ImageView(defaultNoteSkin)),
                new Note(44150, new ImageView(defaultNoteSkin)),
                new Note(47150, new ImageView(defaultNoteSkin)),
                new Note(47420, new ImageView(defaultNoteSkin)),
                new Note(48330, new ImageView(defaultNoteSkin)),

                new Note(52770, new ImageView(defaultNoteSkin)),
                new Note(53440, new ImageView(defaultNoteSkin)),
                new Note(53690, new ImageView(defaultNoteSkin)),
                new Note(54600, new ImageView(defaultNoteSkin)),
                new Note(56950, new ImageView(defaultNoteSkin)),
                new Note(57470, new ImageView(defaultNoteSkin), 390),
                new Note(58630, new ImageView(defaultNoteSkin)),
                new Note(59230, new ImageView(defaultNoteSkin)),

                new Note(59710, new ImageView(defaultNoteSkin)),
                new Note(59970, new ImageView(defaultNoteSkin)),
                new Note(60870, new ImageView(defaultNoteSkin)),
                new Note(63230, new ImageView(defaultNoteSkin)),
                new Note(63880, new ImageView(defaultNoteSkin)),
                new Note(64150, new ImageView(defaultNoteSkin)),
                new Note(65060, new ImageView(defaultNoteSkin)),
                new Note(66620, new ImageView(defaultNoteSkin)),
                new Note(66880, new ImageView(defaultNoteSkin)),
                new Note(67690, new ImageView(defaultNoteSkin)),

                new Note(69500, new ImageView(defaultNoteSkin)),
                new Note(70150, new ImageView(defaultNoteSkin)),
                new Note(70410, new ImageView(defaultNoteSkin)),
                new Note(71290, new ImageView(defaultNoteSkin)),
                new Note(73860, new ImageView(defaultNoteSkin)),
                new Note(74190, new ImageView(defaultNoteSkin), 390),
                new Note(75370, new ImageView(defaultNoteSkin)),
                new Note(75970, new ImageView(defaultNoteSkin)),

                new Note(76420, new ImageView(defaultNoteSkin)),
                new Note(76670, new ImageView(defaultNoteSkin)),
                new Note(77580, new ImageView(defaultNoteSkin)),
                new Note(79940, new ImageView(defaultNoteSkin)),
                new Note(80590, new ImageView(defaultNoteSkin)),
                new Note(80850, new ImageView(defaultNoteSkin)),
                new Note(81760, new ImageView(defaultNoteSkin)),
                new Note(83330, new ImageView(defaultNoteSkin)),
                new Note(83590, new ImageView(defaultNoteSkin)),
                new Note(84350, new ImageView(defaultNoteSkin)),

                new Note(86720, new ImageView(defaultNoteSkin), 780),
                new Note(87910, new ImageView(defaultNoteSkin)),
                new Note(88820, new ImageView(defaultNoteSkin), 780),

                new Note(93000, new ImageView(defaultNoteSkin), 1170),
                new Note(96130, new ImageView(defaultNoteSkin)),
                new Note(96530, new ImageView(defaultNoteSkin)),
                new Note(100320, new ImageView(defaultNoteSkin)),
                new Note(100700, new ImageView(defaultNoteSkin)),
                new Note(101090, new ImageView(defaultNoteSkin)),
                new Note(104490, new ImageView(defaultNoteSkin)),
                new Note(104880, new ImageView(defaultNoteSkin)),
                new Note(107760, new ImageView(defaultNoteSkin)),
                new Note(107920, new ImageView(defaultNoteSkin)),
                new Note(108180, new ImageView(defaultNoteSkin)),
                new Note(108640, new ImageView(defaultNoteSkin)),
                new Note(108780, new ImageView(defaultNoteSkin)),

                new Note(118210, new ImageView(defaultNoteSkin)),
                new Note(118600, new ImageView(defaultNoteSkin)),
                new Note(120560, new ImageView(defaultNoteSkin)),
                new Note(121200, new ImageView(defaultNoteSkin), 1060),
                new Note(122400, new ImageView(defaultNoteSkin)),
                new Note(122790, new ImageView(defaultNoteSkin)),
                new Note(125000, new ImageView(defaultNoteSkin)),

                new Note(135180, new ImageView(defaultNoteSkin)),
                new Note(134450, new ImageView(defaultNoteSkin)),
                new Note(137020, new ImageView(defaultNoteSkin)),
                new Note(137260, new ImageView(defaultNoteSkin)),
                new Note(137660, new ImageView(defaultNoteSkin)),
                new Note(138190, new ImageView(defaultNoteSkin), 270),
                new Note(139100, new ImageView(defaultNoteSkin)),
                new Note(139880, new ImageView(defaultNoteSkin)),

                new Note(143020, new ImageView(defaultNoteSkin)),
                new Note(143540, new ImageView(defaultNoteSkin), 410),
                new Note(147190, new ImageView(defaultNoteSkin)),
                new Note(147710, new ImageView(defaultNoteSkin), 410),

                new Note(149150, new ImageView(defaultNoteSkin)),
                new Note(149410, new ImageView(defaultNoteSkin)),
                new Note(149810, new ImageView(defaultNoteSkin)),
                new Note(150200, new ImageView(defaultNoteSkin)),
                new Note(150450, new ImageView(defaultNoteSkin)),
                new Note(150850, new ImageView(defaultNoteSkin)),
                new Note(151250, new ImageView(defaultNoteSkin)),
                new Note(151510, new ImageView(defaultNoteSkin)),
                new Note(151900, new ImageView(defaultNoteSkin)),
                new Note(152280, new ImageView(defaultNoteSkin)),
                new Note(152550, new ImageView(defaultNoteSkin)),
                new Note(152940, new ImageView(defaultNoteSkin)),
                new Note(153330, new ImageView(defaultNoteSkin)),
                new Note(153590, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(8880, new ImageView(defaultNoteSkin)),
                new Note(9405, new ImageView(defaultNoteSkin), 790),
                new Note(10440, new ImageView(defaultNoteSkin)),
                new Note(10720, new ImageView(defaultNoteSkin)),
                new Note(11490, new ImageView(defaultNoteSkin), 790),
                new Note(12530, new ImageView(defaultNoteSkin)),
                new Note(12810, new ImageView(defaultNoteSkin)),
                new Note(13320, new ImageView(defaultNoteSkin)),

                new Note(25600, new ImageView(defaultNoteSkin)),
                new Note(26120, new ImageView(defaultNoteSkin), 790),
                new Note(27200, new ImageView(defaultNoteSkin)),
                new Note(27570, new ImageView(defaultNoteSkin)),
                new Note(28200, new ImageView(defaultNoteSkin), 790),
                new Note(29260, new ImageView(defaultNoteSkin)),
                new Note(29770, new ImageView(defaultNoteSkin)),
                new Note(30030, new ImageView(defaultNoteSkin)),

                new Note(38000, new ImageView(defaultNoteSkin)),
                new Note(42580, new ImageView(defaultNoteSkin)),

                new Note(42840, new ImageView(defaultNoteSkin)),
                new Note(43100, new ImageView(defaultNoteSkin)),
                new Note(43360, new ImageView(defaultNoteSkin)),
                new Note(43770, new ImageView(defaultNoteSkin)),
                new Note(44010, new ImageView(defaultNoteSkin)),
                new Note(47030, new ImageView(defaultNoteSkin)),
                new Note(47280, new ImageView(defaultNoteSkin)),
                new Note(47540, new ImageView(defaultNoteSkin)),
                new Note(47940, new ImageView(defaultNoteSkin)),
                new Note(48200, new ImageView(defaultNoteSkin)),

                new Note(52640, new ImageView(defaultNoteSkin)),
                new Note(53300, new ImageView(defaultNoteSkin)),
                new Note(53560, new ImageView(defaultNoteSkin)),
                new Note(53820, new ImageView(defaultNoteSkin)),
                new Note(54340, new ImageView(defaultNoteSkin)),
                new Note(54480, new ImageView(defaultNoteSkin)),
                new Note(56840, new ImageView(defaultNoteSkin)),
                new Note(57860, new ImageView(defaultNoteSkin)),
                new Note(58920, new ImageView(defaultNoteSkin)),

                new Note(59560, new ImageView(defaultNoteSkin)),
                new Note(59830, new ImageView(defaultNoteSkin)),
                new Note(60100, new ImageView(defaultNoteSkin)),
                new Note(60480, new ImageView(defaultNoteSkin)),
                new Note(60740, new ImageView(defaultNoteSkin)),
                new Note(63100, new ImageView(defaultNoteSkin)),
                new Note(63750, new ImageView(defaultNoteSkin)),
                new Note(64010, new ImageView(defaultNoteSkin)),
                new Note(64280, new ImageView(defaultNoteSkin)),
                new Note(64660, new ImageView(defaultNoteSkin)),
                new Note(64920, new ImageView(defaultNoteSkin)),
                new Note(67730, new ImageView(defaultNoteSkin)),

                new Note(69360, new ImageView(defaultNoteSkin)),
                new Note(70020, new ImageView(defaultNoteSkin)),
                new Note(70270, new ImageView(defaultNoteSkin)),
                new Note(70530, new ImageView(defaultNoteSkin)),
                new Note(70920, new ImageView(defaultNoteSkin)),
                new Note(71180, new ImageView(defaultNoteSkin)),
                new Note(73540, new ImageView(defaultNoteSkin)),
                new Note(74600, new ImageView(defaultNoteSkin)),
                new Note(75630, new ImageView(defaultNoteSkin)),

                new Note(76280, new ImageView(defaultNoteSkin)),
                new Note(76530, new ImageView(defaultNoteSkin)),
                new Note(76800, new ImageView(defaultNoteSkin)),
                new Note(77180, new ImageView(defaultNoteSkin)),
                new Note(77460, new ImageView(defaultNoteSkin)),
                new Note(79810, new ImageView(defaultNoteSkin)),
                new Note(80470, new ImageView(defaultNoteSkin)),
                new Note(80710, new ImageView(defaultNoteSkin)),
                new Note(80980, new ImageView(defaultNoteSkin)),
                new Note(81380, new ImageView(defaultNoteSkin)),
                new Note(81640, new ImageView(defaultNoteSkin)),
                new Note(84390, new ImageView(defaultNoteSkin)),

                new Note(87500, new ImageView(defaultNoteSkin)),
                new Note(88550, new ImageView(defaultNoteSkin)),

                new Note(94570, new ImageView(defaultNoteSkin)),
                new Note(94820, new ImageView(defaultNoteSkin)),
                new Note(97180, new ImageView(defaultNoteSkin), 1440),
                new Note(98620, new ImageView(defaultNoteSkin)),
                new Note(99000, new ImageView(defaultNoteSkin)),
                new Note(102920, new ImageView(defaultNoteSkin)),
                new Note(103180, new ImageView(defaultNoteSkin)),
                new Note(105540, new ImageView(defaultNoteSkin), 2090),
                new Note(109450, new ImageView(defaultNoteSkin)),

                new Note(118070, new ImageView(defaultNoteSkin)),
                new Note(120180, new ImageView(defaultNoteSkin)),
                new Note(120950, new ImageView(defaultNoteSkin)),
                new Note(122260, new ImageView(defaultNoteSkin)),
                new Note(124360, new ImageView(defaultNoteSkin)),
                new Note(124730, new ImageView(defaultNoteSkin)),
                new Note(125120, new ImageView(defaultNoteSkin)),

                new Note(134930, new ImageView(defaultNoteSkin)),
                new Note(135690, new ImageView(defaultNoteSkin)),
                new Note(136890, new ImageView(defaultNoteSkin)),
                new Note(137540, new ImageView(defaultNoteSkin)),
                new Note(138450, new ImageView(defaultNoteSkin), 360),
                new Note(138960, new ImageView(defaultNoteSkin)),

                new Note(143160, new ImageView(defaultNoteSkin), 370),
                new Note(147340, new ImageView(defaultNoteSkin), 370),

                new Note(149410, new ImageView(defaultNoteSkin)),
                new Note(149810, new ImageView(defaultNoteSkin)),
                new Note(151510, new ImageView(defaultNoteSkin)),
                new Note(151900, new ImageView(defaultNoteSkin)),
                new Note(153590, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }

    public static Note[][] getAsgoreAsgoreChart(){
        Note[] leftNotes = {
                new Note(0, new ImageView(defaultNoteSkin)),
                new Note(2090, new ImageView(defaultNoteSkin)),
                new Note(2480, new ImageView(defaultNoteSkin)),
                new Note(8360, new ImageView(defaultNoteSkin)),
                new Note(10195, new ImageView(defaultNoteSkin)),
                new Note(11230, new ImageView(defaultNoteSkin)),
                new Note(12280, new ImageView(defaultNoteSkin)),
                new Note(13600, new ImageView(defaultNoteSkin), 1830),
                new Note(15550, new ImageView(defaultNoteSkin)),
                new Note(15700, new ImageView(defaultNoteSkin), 560),

                new Note(16720, new ImageView(defaultNoteSkin)),
                new Note(18800, new ImageView(defaultNoteSkin)),
                new Note(19200, new ImageView(defaultNoteSkin)),
                new Note(25080, new ImageView(defaultNoteSkin)),
                new Note(26910, new ImageView(defaultNoteSkin)),
                new Note(27950, new ImageView(defaultNoteSkin)),
                new Note(28990, new ImageView(defaultNoteSkin)),
                new Note(30310, new ImageView(defaultNoteSkin), 1830),
                new Note(32270, new ImageView(defaultNoteSkin)),
                new Note(32400, new ImageView(defaultNoteSkin), 560),

                new Note(33430, new ImageView(defaultNoteSkin)),

                new Note(34480, new ImageView(defaultNoteSkin)),
                new Note(34740, new ImageView(defaultNoteSkin)),
                new Note(35000, new ImageView(defaultNoteSkin)),
                new Note(35390, new ImageView(defaultNoteSkin)),
                new Note(35650, new ImageView(defaultNoteSkin)),
                new Note(38920, new ImageView(defaultNoteSkin)),
                new Note(39180, new ImageView(defaultNoteSkin)),
                new Note(39580, new ImageView(defaultNoteSkin)),
                new Note(39830, new ImageView(defaultNoteSkin)),

                new Note(46360, new ImageView(defaultNoteSkin)),
                new Note(50950, new ImageView(defaultNoteSkin)),

                new Note(51200, new ImageView(defaultNoteSkin)),
                new Note(51470, new ImageView(defaultNoteSkin)),
                new Note(51730, new ImageView(defaultNoteSkin)),
                new Note(51990, new ImageView(defaultNoteSkin)),
                new Note(52400, new ImageView(defaultNoteSkin)),
                new Note(54730, new ImageView(defaultNoteSkin)),
                new Note(55390, new ImageView(defaultNoteSkin)),
                new Note(55650, new ImageView(defaultNoteSkin)),
                new Note(55900, new ImageView(defaultNoteSkin)),
                new Note(56300, new ImageView(defaultNoteSkin)),
                new Note(56570, new ImageView(defaultNoteSkin)),
                new Note(59310, new ImageView(defaultNoteSkin)),

                new Note(61010, new ImageView(defaultNoteSkin)),
                new Note(61660, new ImageView(defaultNoteSkin)),
                new Note(61920, new ImageView(defaultNoteSkin)),
                new Note(62190, new ImageView(defaultNoteSkin)),
                new Note(62700, new ImageView(defaultNoteSkin)),
                new Note(62830, new ImageView(defaultNoteSkin)),
                new Note(65180, new ImageView(defaultNoteSkin)),
                new Note(66220, new ImageView(defaultNoteSkin)),
                new Note(67270, new ImageView(defaultNoteSkin)),

                new Note(67930, new ImageView(defaultNoteSkin)),
                new Note(68180, new ImageView(defaultNoteSkin)),
                new Note(68430, new ImageView(defaultNoteSkin)),
                new Note(68700, new ImageView(defaultNoteSkin)),
                new Note(69100, new ImageView(defaultNoteSkin)),
                new Note(71430, new ImageView(defaultNoteSkin)),
                new Note(72110, new ImageView(defaultNoteSkin)),
                new Note(72360, new ImageView(defaultNoteSkin)),
                new Note(72620, new ImageView(defaultNoteSkin)),
                new Note(73020, new ImageView(defaultNoteSkin)),
                new Note(73280, new ImageView(defaultNoteSkin)),
                new Note(76050, new ImageView(defaultNoteSkin)),

                new Note(77720, new ImageView(defaultNoteSkin)),
                new Note(78370, new ImageView(defaultNoteSkin)),
                new Note(78630, new ImageView(defaultNoteSkin)),
                new Note(78880, new ImageView(defaultNoteSkin)),
                new Note(79280, new ImageView(defaultNoteSkin)),
                new Note(79540, new ImageView(defaultNoteSkin)),
                new Note(81900, new ImageView(defaultNoteSkin)),
                new Note(82930, new ImageView(defaultNoteSkin)),
                new Note(83990, new ImageView(defaultNoteSkin)),

                new Note(90250, new ImageView(defaultNoteSkin)),

                new Note(91950, new ImageView(defaultNoteSkin)),
                new Note(95090, new ImageView(defaultNoteSkin), 770),
                new Note(95860, new ImageView(defaultNoteSkin)),
                new Note(99270, new ImageView(defaultNoteSkin), 770),
                new Note(100040, new ImageView(defaultNoteSkin)),
                new Note(101360, new ImageView(defaultNoteSkin), 1200),
                new Note(103450, new ImageView(defaultNoteSkin), 700),
                new Note(104220, new ImageView(defaultNoteSkin)),
                new Note(107630, new ImageView(defaultNoteSkin), 1960),

                new Note(110500, new ImageView(defaultNoteSkin)),
                new Note(111150, new ImageView(defaultNoteSkin)),
                new Note(111540, new ImageView(defaultNoteSkin)),
                new Note(114680, new ImageView(defaultNoteSkin)),
                new Note(115330, new ImageView(defaultNoteSkin)),
                new Note(115720, new ImageView(defaultNoteSkin)),

                new Note(126690, new ImageView(defaultNoteSkin)),
                new Note(126950, new ImageView(defaultNoteSkin)),
                new Note(127870, new ImageView(defaultNoteSkin)),
                new Note(128260, new ImageView(defaultNoteSkin)),
                new Note(128780, new ImageView(defaultNoteSkin)),
                new Note(129420, new ImageView(defaultNoteSkin)),
                new Note(131000, new ImageView(defaultNoteSkin)),
                new Note(131270, new ImageView(defaultNoteSkin)),
                new Note(132050, new ImageView(defaultNoteSkin)),
                new Note(132710, new ImageView(defaultNoteSkin), 380),
                new Note(134520, new ImageView(defaultNoteSkin), 260),

                new Note(142100, new ImageView(defaultNoteSkin), 780),
                new Note(146280, new ImageView(defaultNoteSkin), 780),
        };
        Note[] downNotes = {
                new Note(370, new ImageView(defaultNoteSkin)),
                new Note(1700, new ImageView(defaultNoteSkin)),
                new Note(2875, new ImageView(defaultNoteSkin)),
                new Note(8880, new ImageView(defaultNoteSkin)),
                new Note(10195, new ImageView(defaultNoteSkin)),
                new Note(11230, new ImageView(defaultNoteSkin)),
                new Note(12530, new ImageView(defaultNoteSkin)),
                new Note(13600, new ImageView(defaultNoteSkin), 1820),
                new Note(15420, new ImageView(defaultNoteSkin)),

                new Note(17240, new ImageView(defaultNoteSkin)),
                new Note(18540, new ImageView(defaultNoteSkin)),
                new Note(19590, new ImageView(defaultNoteSkin)),
                new Note(25600, new ImageView(defaultNoteSkin)),
                new Note(26910, new ImageView(defaultNoteSkin)),
                new Note(27950, new ImageView(defaultNoteSkin)),
                new Note(29260, new ImageView(defaultNoteSkin)),
                new Note(30310, new ImageView(defaultNoteSkin), 1820),
                new Note(32140, new ImageView(defaultNoteSkin)),

                new Note(33960, new ImageView(defaultNoteSkin)),

                new Note(34620, new ImageView(defaultNoteSkin)),
                new Note(34870, new ImageView(defaultNoteSkin)),
                new Note(35780, new ImageView(defaultNoteSkin)),
                new Note(38780, new ImageView(defaultNoteSkin)),
                new Note(39050, new ImageView(defaultNoteSkin)),
                new Note(39970, new ImageView(defaultNoteSkin)),

                new Note(46500, new ImageView(defaultNoteSkin)),
                new Note(49900, new ImageView(defaultNoteSkin)),
                new Note(50120, new ImageView(defaultNoteSkin)),
                new Note(50910, new ImageView(defaultNoteSkin)),

                new Note(51340, new ImageView(defaultNoteSkin)),
                new Note(51600, new ImageView(defaultNoteSkin)),
                new Note(52520, new ImageView(defaultNoteSkin)),
                new Note(54870, new ImageView(defaultNoteSkin)),
                new Note(55520, new ImageView(defaultNoteSkin)),
                new Note(55780, new ImageView(defaultNoteSkin)),
                new Note(56700, new ImageView(defaultNoteSkin)),
                new Note(58260, new ImageView(defaultNoteSkin)),
                new Note(58530, new ImageView(defaultNoteSkin)),
                new Note(59270, new ImageView(defaultNoteSkin)),

                new Note(61130, new ImageView(defaultNoteSkin)),
                new Note(61790, new ImageView(defaultNoteSkin)),
                new Note(62060, new ImageView(defaultNoteSkin)),
                new Note(62960, new ImageView(defaultNoteSkin)),
                new Note(65300, new ImageView(defaultNoteSkin)),
                new Note(65830, new ImageView(defaultNoteSkin), 390),
                new Note(67000, new ImageView(defaultNoteSkin)),
                new Note(67650, new ImageView(defaultNoteSkin)),

                new Note(68050, new ImageView(defaultNoteSkin)),
                new Note(68320, new ImageView(defaultNoteSkin)),
                new Note(69230, new ImageView(defaultNoteSkin)),
                new Note(71580, new ImageView(defaultNoteSkin)),
                new Note(72240, new ImageView(defaultNoteSkin)),
                new Note(72500, new ImageView(defaultNoteSkin)),
                new Note(73400, new ImageView(defaultNoteSkin)),
                new Note(74970, new ImageView(defaultNoteSkin)),
                new Note(75230, new ImageView(defaultNoteSkin)),
                new Note(76010, new ImageView(defaultNoteSkin)),

                new Note(77850, new ImageView(defaultNoteSkin)),
                new Note(78510, new ImageView(defaultNoteSkin)),
                new Note(78770, new ImageView(defaultNoteSkin)),
                new Note(79670, new ImageView(defaultNoteSkin)),
                new Note(82030, new ImageView(defaultNoteSkin)),
                new Note(82560, new ImageView(defaultNoteSkin), 390),
                new Note(83710, new ImageView(defaultNoteSkin)),
                new Note(84310, new ImageView(defaultNoteSkin)),

                new Note(89860, new ImageView(defaultNoteSkin)),
                new Note(90520, new ImageView(defaultNoteSkin)),

                new Note(92350, new ImageView(defaultNoteSkin)),
                new Note(92730, new ImageView(defaultNoteSkin)),
                new Note(96390, new ImageView(defaultNoteSkin)),
                new Note(96910, new ImageView(defaultNoteSkin)),
                new Note(100570, new ImageView(defaultNoteSkin)),
                new Note(104750, new ImageView(defaultNoteSkin)),
                new Note(105270, new ImageView(defaultNoteSkin)),

                new Note(109970, new ImageView(defaultNoteSkin)),
                new Note(110110, new ImageView(defaultNoteSkin)),
                new Note(110760, new ImageView(defaultNoteSkin)),
                new Note(111700, new ImageView(defaultNoteSkin)),
                new Note(112460, new ImageView(defaultNoteSkin)),
                new Note(114170, new ImageView(defaultNoteSkin)),
                new Note(114280, new ImageView(defaultNoteSkin)),
                new Note(114940, new ImageView(defaultNoteSkin)),
                new Note(115870, new ImageView(defaultNoteSkin)),
                new Note(117030, new ImageView(defaultNoteSkin), 1060),

                new Note(126430, new ImageView(defaultNoteSkin)),
                new Note(127220, new ImageView(defaultNoteSkin)),
                new Note(127480, new ImageView(defaultNoteSkin)),
                new Note(128390, new ImageView(defaultNoteSkin)),
                new Note(129060, new ImageView(defaultNoteSkin)),
                new Note(129570, new ImageView(defaultNoteSkin), 260),
                new Note(130460, new ImageView(defaultNoteSkin)),
                new Note(130880, new ImageView(defaultNoteSkin)),
                new Note(131140, new ImageView(defaultNoteSkin)),
                new Note(131400, new ImageView(defaultNoteSkin)),
                new Note(131560, new ImageView(defaultNoteSkin)),
                new Note(132440, new ImageView(defaultNoteSkin)),
                new Note(133090, new ImageView(defaultNoteSkin), 390),
                new Note(134260, new ImageView(defaultNoteSkin)),

                new Note(140800, new ImageView(defaultNoteSkin)),
                new Note(141840, new ImageView(defaultNoteSkin), 260),
                new Note(144980, new ImageView(defaultNoteSkin)),
                new Note(146020, new ImageView(defaultNoteSkin), 260),

                new Note(149150, new ImageView(defaultNoteSkin)),
                new Note(150450, new ImageView(defaultNoteSkin)),
                new Note(150850, new ImageView(defaultNoteSkin)),
                new Note(151250, new ImageView(defaultNoteSkin)),
                new Note(152550, new ImageView(defaultNoteSkin)),
                new Note(152940, new ImageView(defaultNoteSkin)),
                new Note(153330, new ImageView(defaultNoteSkin)),

                new Note(150200, new ImageView(defaultNoteSkin)),
                new Note(152280, new ImageView(defaultNoteSkin))
        };
        Note[] upNotes = {
                new Note(1050, new ImageView(defaultNoteSkin), 520),
                new Note(3130, new ImageView(defaultNoteSkin), 790),
                new Note(8360, new ImageView(defaultNoteSkin)),
                new Note(9405, new ImageView(defaultNoteSkin), 790),
                new Note(10440, new ImageView(defaultNoteSkin)),
                new Note(10720, new ImageView(defaultNoteSkin)),
                new Note(11490, new ImageView(defaultNoteSkin), 790),
                new Note(12280, new ImageView(defaultNoteSkin)),

                new Note(17760, new ImageView(defaultNoteSkin), 520),
                new Note(19850, new ImageView(defaultNoteSkin), 790),
                new Note(25080, new ImageView(defaultNoteSkin)),
                new Note(26120, new ImageView(defaultNoteSkin), 790),
                new Note(27200, new ImageView(defaultNoteSkin)),
                new Note(27570, new ImageView(defaultNoteSkin)),
                new Note(28200, new ImageView(defaultNoteSkin), 790),
                new Note(28990, new ImageView(defaultNoteSkin)),

                new Note(36040, new ImageView(defaultNoteSkin)),
                new Note(40230, new ImageView(defaultNoteSkin)),

                new Note(45060, new ImageView(defaultNoteSkin)),
                new Note(45320, new ImageView(defaultNoteSkin)),
                new Note(46230, new ImageView(defaultNoteSkin)),
                new Note(49130, new ImageView(defaultNoteSkin), 390),
                new Note(50290, new ImageView(defaultNoteSkin)),
                new Note(50870, new ImageView(defaultNoteSkin)),

                new Note(52770, new ImageView(defaultNoteSkin)),
                new Note(53440, new ImageView(defaultNoteSkin)),
                new Note(53690, new ImageView(defaultNoteSkin)),
                new Note(54600, new ImageView(defaultNoteSkin)),
                new Note(56950, new ImageView(defaultNoteSkin)),
                new Note(57470, new ImageView(defaultNoteSkin), 390),
                new Note(58630, new ImageView(defaultNoteSkin)),
                new Note(59230, new ImageView(defaultNoteSkin)),

                new Note(59710, new ImageView(defaultNoteSkin)),
                new Note(59970, new ImageView(defaultNoteSkin)),
                new Note(60870, new ImageView(defaultNoteSkin)),
                new Note(63230, new ImageView(defaultNoteSkin)),
                new Note(63880, new ImageView(defaultNoteSkin)),
                new Note(64150, new ImageView(defaultNoteSkin)),
                new Note(65060, new ImageView(defaultNoteSkin)),
                new Note(66620, new ImageView(defaultNoteSkin)),
                new Note(66880, new ImageView(defaultNoteSkin)),
                new Note(67690, new ImageView(defaultNoteSkin)),

                new Note(69500, new ImageView(defaultNoteSkin)),
                new Note(70150, new ImageView(defaultNoteSkin)),
                new Note(70410, new ImageView(defaultNoteSkin)),
                new Note(71290, new ImageView(defaultNoteSkin)),
                new Note(73860, new ImageView(defaultNoteSkin)),
                new Note(74190, new ImageView(defaultNoteSkin), 390),
                new Note(75370, new ImageView(defaultNoteSkin)),
                new Note(75970, new ImageView(defaultNoteSkin)),

                new Note(76420, new ImageView(defaultNoteSkin)),
                new Note(76670, new ImageView(defaultNoteSkin)),
                new Note(77580, new ImageView(defaultNoteSkin)),
                new Note(79940, new ImageView(defaultNoteSkin)),
                new Note(80590, new ImageView(defaultNoteSkin)),
                new Note(80850, new ImageView(defaultNoteSkin)),
                new Note(81760, new ImageView(defaultNoteSkin)),
                new Note(83330, new ImageView(defaultNoteSkin)),
                new Note(83590, new ImageView(defaultNoteSkin)),
                new Note(84350, new ImageView(defaultNoteSkin)),

                new Note(84640, new ImageView(defaultNoteSkin), 1570),
                new Note(90640, new ImageView(defaultNoteSkin)),

                new Note(93000, new ImageView(defaultNoteSkin), 1170),
                new Note(96130, new ImageView(defaultNoteSkin)),
                new Note(96530, new ImageView(defaultNoteSkin)),
                new Note(100320, new ImageView(defaultNoteSkin)),
                new Note(100700, new ImageView(defaultNoteSkin)),
                new Note(101090, new ImageView(defaultNoteSkin)),
                new Note(104490, new ImageView(defaultNoteSkin)),
                new Note(104880, new ImageView(defaultNoteSkin)),

                new Note(109850, new ImageView(defaultNoteSkin)),
                new Note(110230, new ImageView(defaultNoteSkin)),
                new Note(112200, new ImageView(defaultNoteSkin)),
                new Note(112850, new ImageView(defaultNoteSkin), 1060),
                new Note(114020, new ImageView(defaultNoteSkin)),
                new Note(114420, new ImageView(defaultNoteSkin)),
                new Note(116650, new ImageView(defaultNoteSkin)),

                new Note(126840, new ImageView(defaultNoteSkin)),
                new Note(127080, new ImageView(defaultNoteSkin)),
                new Note(128660, new ImageView(defaultNoteSkin)),
                new Note(128900, new ImageView(defaultNoteSkin)),
                new Note(129300, new ImageView(defaultNoteSkin)),
                new Note(129830, new ImageView(defaultNoteSkin), 270),
                new Note(130750, new ImageView(defaultNoteSkin)),
                new Note(131530, new ImageView(defaultNoteSkin)),
                new Note(133480, new ImageView(defaultNoteSkin), 260),
                new Note(134000, new ImageView(defaultNoteSkin), 260),

                new Note(140920, new ImageView(defaultNoteSkin)),
                new Note(141430, new ImageView(defaultNoteSkin), 410),
                new Note(145100, new ImageView(defaultNoteSkin)),
                new Note(145630, new ImageView(defaultNoteSkin), 410),

                new Note(149150, new ImageView(defaultNoteSkin)),
                new Note(149410, new ImageView(defaultNoteSkin)),
                new Note(149810, new ImageView(defaultNoteSkin)),
                new Note(150200, new ImageView(defaultNoteSkin)),
                new Note(150450, new ImageView(defaultNoteSkin)),
                new Note(150850, new ImageView(defaultNoteSkin)),
                new Note(151250, new ImageView(defaultNoteSkin)),
                new Note(151510, new ImageView(defaultNoteSkin)),
                new Note(151900, new ImageView(defaultNoteSkin)),
                new Note(152280, new ImageView(defaultNoteSkin)),
                new Note(152550, new ImageView(defaultNoteSkin)),
                new Note(152940, new ImageView(defaultNoteSkin)),
                new Note(153330, new ImageView(defaultNoteSkin)),
                new Note(153590, new ImageView(defaultNoteSkin))
        };
        Note[] rightNotes = {
                new Note(8880, new ImageView(defaultNoteSkin)),
                new Note(9405, new ImageView(defaultNoteSkin), 790),
                new Note(10440, new ImageView(defaultNoteSkin)),
                new Note(10720, new ImageView(defaultNoteSkin)),
                new Note(11490, new ImageView(defaultNoteSkin), 790),
                new Note(12530, new ImageView(defaultNoteSkin)),
                new Note(12810, new ImageView(defaultNoteSkin)),
                new Note(13320, new ImageView(defaultNoteSkin)),

                new Note(25600, new ImageView(defaultNoteSkin)),
                new Note(26120, new ImageView(defaultNoteSkin), 790),
                new Note(27200, new ImageView(defaultNoteSkin)),
                new Note(27570, new ImageView(defaultNoteSkin)),
                new Note(28200, new ImageView(defaultNoteSkin), 790),
                new Note(29260, new ImageView(defaultNoteSkin)),
                new Note(29770, new ImageView(defaultNoteSkin)),
                new Note(30030, new ImageView(defaultNoteSkin)),

                new Note(35920, new ImageView(defaultNoteSkin)),
                new Note(40100, new ImageView(defaultNoteSkin)),

                new Note(44940, new ImageView(defaultNoteSkin)),
                new Note(45190, new ImageView(defaultNoteSkin)),
                new Note(45460, new ImageView(defaultNoteSkin)),
                new Note(45840, new ImageView(defaultNoteSkin)),
                new Note(46100, new ImageView(defaultNoteSkin)),
                new Note(49500, new ImageView(defaultNoteSkin)),
                new Note(50550, new ImageView(defaultNoteSkin)),

                new Note(52640, new ImageView(defaultNoteSkin)),
                new Note(53300, new ImageView(defaultNoteSkin)),
                new Note(53560, new ImageView(defaultNoteSkin)),
                new Note(53820, new ImageView(defaultNoteSkin)),
                new Note(54340, new ImageView(defaultNoteSkin)),
                new Note(54480, new ImageView(defaultNoteSkin)),
                new Note(56840, new ImageView(defaultNoteSkin)),
                new Note(57860, new ImageView(defaultNoteSkin)),
                new Note(58920, new ImageView(defaultNoteSkin)),

                new Note(59560, new ImageView(defaultNoteSkin)),
                new Note(59830, new ImageView(defaultNoteSkin)),
                new Note(60100, new ImageView(defaultNoteSkin)),
                new Note(60480, new ImageView(defaultNoteSkin)),
                new Note(60740, new ImageView(defaultNoteSkin)),
                new Note(63100, new ImageView(defaultNoteSkin)),
                new Note(63750, new ImageView(defaultNoteSkin)),
                new Note(64010, new ImageView(defaultNoteSkin)),
                new Note(64280, new ImageView(defaultNoteSkin)),
                new Note(64660, new ImageView(defaultNoteSkin)),
                new Note(64920, new ImageView(defaultNoteSkin)),
                new Note(67730, new ImageView(defaultNoteSkin)),

                new Note(69360, new ImageView(defaultNoteSkin)),
                new Note(70020, new ImageView(defaultNoteSkin)),
                new Note(70270, new ImageView(defaultNoteSkin)),
                new Note(70530, new ImageView(defaultNoteSkin)),
                new Note(70920, new ImageView(defaultNoteSkin)),
                new Note(71180, new ImageView(defaultNoteSkin)),
                new Note(73540, new ImageView(defaultNoteSkin)),
                new Note(74600, new ImageView(defaultNoteSkin)),
                new Note(75630, new ImageView(defaultNoteSkin)),

                new Note(76280, new ImageView(defaultNoteSkin)),
                new Note(76530, new ImageView(defaultNoteSkin)),
                new Note(76800, new ImageView(defaultNoteSkin)),
                new Note(77180, new ImageView(defaultNoteSkin)),
                new Note(77460, new ImageView(defaultNoteSkin)),
                new Note(79810, new ImageView(defaultNoteSkin)),
                new Note(80470, new ImageView(defaultNoteSkin)),
                new Note(80710, new ImageView(defaultNoteSkin)),
                new Note(80980, new ImageView(defaultNoteSkin)),
                new Note(81380, new ImageView(defaultNoteSkin)),
                new Note(81640, new ImageView(defaultNoteSkin)),
                new Note(84390, new ImageView(defaultNoteSkin)),

                new Note(90900, new ImageView(defaultNoteSkin), 1050),

                new Note(94570, new ImageView(defaultNoteSkin)),
                new Note(94820, new ImageView(defaultNoteSkin)),
                new Note(97180, new ImageView(defaultNoteSkin), 1440),
                new Note(98620, new ImageView(defaultNoteSkin)),
                new Note(99000, new ImageView(defaultNoteSkin)),
                new Note(102920, new ImageView(defaultNoteSkin)),
                new Note(103180, new ImageView(defaultNoteSkin)),
                new Note(105540, new ImageView(defaultNoteSkin), 2090),

                new Note(109710, new ImageView(defaultNoteSkin)),
                new Note(111800, new ImageView(defaultNoteSkin)),
                new Note(112580, new ImageView(defaultNoteSkin)),
                new Note(113890, new ImageView(defaultNoteSkin)),
                new Note(115990, new ImageView(defaultNoteSkin)),
                new Note(116380, new ImageView(defaultNoteSkin)),
                new Note(116770, new ImageView(defaultNoteSkin)),

                new Note(126570, new ImageView(defaultNoteSkin)),
                new Note(127350, new ImageView(defaultNoteSkin)),
                new Note(128520, new ImageView(defaultNoteSkin)),
                new Note(129180, new ImageView(defaultNoteSkin)),
                new Note(130100, new ImageView(defaultNoteSkin), 360),
                new Note(130610, new ImageView(defaultNoteSkin)),
                new Note(132590, new ImageView(defaultNoteSkin)),
                new Note(133740, new ImageView(defaultNoteSkin), 260),

                new Note(141060, new ImageView(defaultNoteSkin), 370),
                new Note(145250, new ImageView(defaultNoteSkin), 370),

                new Note(149410, new ImageView(defaultNoteSkin)),
                new Note(149810, new ImageView(defaultNoteSkin)),
                new Note(151510, new ImageView(defaultNoteSkin)),
                new Note(151900, new ImageView(defaultNoteSkin)),
                new Note(153590, new ImageView(defaultNoteSkin))
        };
        for (Note leftNote : leftNotes) {
            leftNote.getView().setViewport(new Rectangle2D(157, 0, 154, 157));
            if (!leftNote.getHoldTime().equals(Duration.ZERO)){
                leftNote.getHold().setImage(defaultNoteSkinHold);
                leftNote.getHold().setViewport(new Rectangle2D(1337, 457, 51, 44));
            }
        }
        for (Note downNote : downNotes) {
            downNote.getView().setViewport(new Rectangle2D(0, 0, 157, 154));
            if (!downNote.getHoldTime().equals(Duration.ZERO)){
                downNote.getHold().setImage(defaultNoteSkinHold);
                downNote.getHold().setViewport(new Rectangle2D(1282, 457, 51, 44));
            }
        }
        for (Note upNote : upNotes) {
            upNote.getView().setViewport(new Rectangle2D(154, 157, 157, 154));
            if (!upNote.getHoldTime().equals(Duration.ZERO)){
                upNote.getHold().setImage(defaultNoteSkinHold);
                upNote.getHold().setViewport(new Rectangle2D(1227, 457, 51, 44));
            }
        }
        for (Note rightNote : rightNotes) {
            rightNote.getView().setViewport(new Rectangle2D(0, 154, 154, 157));
            if (!rightNote.getHoldTime().equals(Duration.ZERO)){
                rightNote.getHold().setImage(defaultNoteSkinHold);
                rightNote.getHold().setViewport(new Rectangle2D(1172, 457, 51, 44));
            }
        }
        return new Note[][]{leftNotes, downNotes, upNotes, rightNotes};
    }
}
