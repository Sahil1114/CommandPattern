class AndroidPhone implements Device{

    @Override
    public void turnOn() {
        System.out.println("Android phone is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("Android phone is now off");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Brightness adjusted on Android phone");
    }

    @Override
    public void changeRingtone() {
        System.out.println("Ringtone changed on Android phone");
    }
}

class IPhone implements Device {
    @Override
    public void turnOn() {
        System.out.println("IPhone is now on");
    }

    @Override
    public void turnOff() {
        System.out.println("IPhone is now off");
    }

    @Override
    public void adjustBrightness() {
        System.out.println("Brightness adjusted on IPhone");
    }

    @Override
    public void changeRingtone() {
        System.out.println("Ringtone changed on IPhone");
    }
}