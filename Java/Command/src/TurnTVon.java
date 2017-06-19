/**
 * Created by Jesper on 2017-06-19.
 */
public class TurnTVon implements Command {
    ElectronicDevice theDevice;

    public TurnTVon(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.on();
    }

    public void undo() {
        theDevice.off();
    }

}