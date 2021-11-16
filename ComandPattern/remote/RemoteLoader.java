
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        GarageDoorUpCommand garageUp = new GarageDoorUpCommand(garageDoor);

        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        GarageDoorDownCommand garageDown = new GarageDoorDownCommand(garageDoor);

        Command[] partyOn = { ceilingFanHigh, lightOn, stereoOn, garageUp };
        Command[] partyOff = { ceilingFanOff, lightOff, stereoOff, garageDown };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

    }
}
