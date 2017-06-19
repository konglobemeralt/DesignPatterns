/**
 * Created by Jesper on 2017-06-19.
 */
public class TurnTVup  implements Command {

    ElectronicDevice theDevice;

    public TurnTVup(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.volumeUp();

    }

    public void undo() {

        theDevice.volumeDown();

    }

}