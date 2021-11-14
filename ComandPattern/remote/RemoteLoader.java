
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen Light");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
        remoteControl.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
        remoteControl.setCommand(2, () -> ceilingFan.on(), () -> ceilingFan.off());
        remoteControl.setCommand(3, () -> stereo.on(), () -> stereo.off());
        remoteControl.setCommand(4, () -> garageDoor.up(), () -> garageDoor.down());

        System.out.println(remoteControl);

        for (var i = 0; i < 5; i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }

    }
}
