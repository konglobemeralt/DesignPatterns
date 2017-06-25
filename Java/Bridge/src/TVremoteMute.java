/**
 * Created by Jesper on 2017-06-25.
 */
public class TVremoteMute extends RemoteButton {

    public TVremoteMute(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
             System.out.println("TV was Muted");
    }
}
