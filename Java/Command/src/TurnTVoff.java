/**
 * Created by Jesper on 2017-06-19.
 */
public class TurnTVoff implements Command {
    ElectronicDevice theDevice;
    public TurnTVoff(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.off();
    }

    public void undo() {
        theDevice.on();
    }

}