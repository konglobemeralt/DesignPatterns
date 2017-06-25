/**
 * Created by Jesper on 2017-06-25.
 */
public class TestTheRemote {

    public static void main(String[] args){

        RemoteButton theTV  = new TVremoteMute(new TVDevice(1,200));
        RemoteButton theTV2  = new TVremotePause(new TVDevice(1,200));

        System.out.println("Test tv with mute");
        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("Test tv with pause");
        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();


    }
}
