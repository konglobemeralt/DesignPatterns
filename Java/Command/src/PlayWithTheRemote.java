import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jesper on 2017-06-19.
 */
public class PlayWithTheRemote{

    public static void main(String[] args){


        ElectronicDevice newDevice = TVremote.getDevice();

        TurnTVon onCommand = new TurnTVon(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        TurnTVoff offCommand = new TurnTVoff(newDevice);


        onPressed = new DeviceButton(offCommand);


        onPressed.press();

        TurnTVup volUpCommand = new TurnTVup(newDevice);


        onPressed = new DeviceButton(volUpCommand);


        onPressed.press();
        onPressed.press();
        onPressed.press();

        Television theTV = new Television();

        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(theTV);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();
        turnThemOff.pressUndo();


    }

}