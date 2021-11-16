
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
        remoteControl.setCommand(1, lightOn, lightOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(3, stereoOn, stereoOff);
        remoteControl.setCommand(4, garageUp, garageDown);

        remoteControl.onButtonWasPushed(1);
        System.out.println();
        remoteControl.onButtonWasPushed(2);
        System.out.println();
        remoteControl.onButtonWasPushed(3);
        System.out.println();
        remoteControl.onButtonWasPushed(4);
        System.out.println();
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }
}
