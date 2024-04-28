// Concrete command for turning a device on
class TurnOnDeviceCommand implements Command {
    private Device device;

    public TurnOnDeviceCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}

// Concrete command for turning a device off
class TurnOffDeviceCommand implements Command {
    private Device device;

    public TurnOffDeviceCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}

// Concrete command for adjusting the brightness of a device
class AdjustBrightnessDeviceCommand implements Command {
    private Device device;

    public AdjustBrightnessDeviceCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.adjustBrightness();
    }
}

// Concrete command for changing the ringtone of a device
class ChangeRingtoneDeviceCommand implements Command {
    private Device device;

    public ChangeRingtoneDeviceCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.changeRingtone();
    }
}
