/**
 * Created by Jesper on 2017-06-25.
 */
public class TVDevice extends EntertainmentDevice{

    public TVDevice(int newDeviceState, int newMaxSetting){

        deviceState = newDeviceState;
        maxSetting = newMaxSetting;

    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Channel Down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Channel Up");
        deviceState++;

    }
}
