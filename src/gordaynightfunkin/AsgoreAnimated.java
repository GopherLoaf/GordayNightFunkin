package gordaynightfunkin;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;

public class AsgoreAnimated extends AnimatedImage{
    public AsgoreAnimated(int initialAnimation){
        super(new Image(Main.class.getResource("") + "Images/Characters/Asgore.png"), initialAnimation);
    }

    public void nextFrame(boolean left, boolean down, boolean up, boolean right, int frameCount){
        super.nextFrame();
        switch(getAnimation()){
            case 0:
                if(getFrame() >= 13 * frameDelay){
                    setDefaultFrame(frameCount % (13 * frameDelay));
                    setToDefault();
                }
                break;
            case 1:
                if(getFrame() >= 16 * frameDelay && !left){
                    setDefaultFrame(frameCount % (16 * frameDelay));
                    setToDefault();
                }
                break;
            case 2:
                if(getFrame() >= 16 * frameDelay && !down){
                    setDefaultFrame(frameCount % (30 * frameDelay));
                    setToDefault();
                }
                break;
            case 3:
                if(getFrame() >= 16 * frameDelay && !up){
                    setDefaultFrame(frameCount % (15 * frameDelay));
                    setToDefault();
                }
                break;
            case 4:
                if(getFrame() >= 16 * frameDelay && !right){
                    setDefaultFrame(frameCount % (62 * frameDelay));
                    setToDefault();
                }
                break;
            default:
        }
    }

    public void updateViewport(){
        getView().setRotate(0);
        switch(getAnimation()){
            case 0:
                //Idle dance
                setFrameWidth(0);
                setFrameHeight(0);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 1200, 600, 600));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 2 * frameDelay && getFrame() < 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 600, 600, 600));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 4 * frameDelay){
                    getView().setViewport(new Rectangle2D(0, 0, 600, 600));
                    setXOffset(0);
                    setYOffset(0);
                }
                break;
            case 1:
                //Hit left
                setFrameWidth(0);
                setFrameHeight(0);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(600, 600, 600, 600));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(600, 0, 600, 600));
                    setXOffset(0);
                    setYOffset(0);
                }
                break;
            case 2:
                //Hit down
                setFrameWidth(0);
                setFrameHeight(0);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(1200, 0, 600, 600));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(600, 1200, 600, 600));
                    setXOffset(0);
                    setYOffset(0);
                }
                break;
            case 3:
                //Hit up
                setFrameWidth(0);
                setFrameHeight(0);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(1200, 1200, 600, 600));
                    setXOffset(0);
                    setYOffset(-0);
                }
                if (getFrame() >= 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(1200, 600, 600, 600));
                    setXOffset(0);
                    setYOffset(0);
                }
                break;
            case 4:
                //Hit right
                setFrameWidth(0);
                setFrameHeight(0);
                if (getFrame() >= 0 && getFrame() < 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(1800, 600, 600, 600));
                    setXOffset(0);
                    setYOffset(0);
                }
                if (getFrame() >= 2 * frameDelay){
                    getView().setViewport(new Rectangle2D(1800, 0, 600, 600));
                    setXOffset(0);
                    setYOffset(0);
                }
                break;
            default:
        }
    }
}
