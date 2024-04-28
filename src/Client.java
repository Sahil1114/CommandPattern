public class Client {
    public static void main(String[] args) {
        // Create devices
        Device androidPhone = new AndroidPhone();
        Device iPhone = new IPhone();

        // Create command objects
        Command turnOnAndroidCommand = new TurnOnDeviceCommand(androidPhone);
        Command turnOffAndroidCommand = new TurnOffDeviceCommand(androidPhone);
        Command adjustBrightnessAndroidCommand = new AdjustBrightnessDeviceCommand(androidPhone);
        Command changeRingtoneAndroidCommand = new ChangeRingtoneDeviceCommand(androidPhone);

        Command turnOnIPhoneCommand = new TurnOnDeviceCommand(iPhone);
        Command turnOffIPhoneCommand = new TurnOffDeviceCommand(iPhone);
        Command adjustBrightnessIPhoneCommand = new AdjustBrightnessDeviceCommand(iPhone);
        Command changeRingtoneIPhoneCommand = new ChangeRingtoneDeviceCommand(iPhone);

        // Create mobile controls
        MobileControl androidControl = new MobileControl();
        MobileControl iPhoneControl = new MobileControl();

        // Set and execute commands for Android phone
        androidControl.setCommand(turnOnAndroidCommand);
        androidControl.pressButton();

        androidControl.setCommand(adjustBrightnessAndroidCommand);
        androidControl.pressButton();

        androidControl.setCommand(changeRingtoneAndroidCommand);
        androidControl.pressButton();

        androidControl.setCommand(turnOffAndroidCommand);
        androidControl.pressButton();

        // Set and execute commands for iPhone
        iPhoneControl.setCommand(turnOnIPhoneCommand);
        iPhoneControl.pressButton();

        iPhoneControl.setCommand(adjustBrightnessIPhoneCommand);
        iPhoneControl.pressButton();

        iPhoneControl.setCommand(changeRingtoneIPhoneCommand);
        iPhoneControl.pressButton();

        iPhoneControl.setCommand(turnOffIPhoneCommand);
        iPhoneControl.pressButton();
    }
}