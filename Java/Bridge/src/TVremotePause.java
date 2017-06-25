/**
 * Created by Jesper on 2017-06-25.
 */
public class TVremotePause extends RemoteButton {

    public TVremotePause(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was paused");
    }
}
