//Para solucionar a inversão de dependencia, criei uma interface, assim LightSwitch não depende mais de LightBulb.
//LightBulb implementa a interface, ficando LightSwitch sem ser afetado.

public class LightSwitch {
    private LightingDevice lightingDevice;

    public LightSwitch(LightingDevice lightingDevice) {
        this.lightingDevice = lightingDevice;
    }

    public void press() {
        if (lightingDevice.isOn()) {
            lightingDevice.turnOff();
        } else {
            lightingDevice.turnOn();
        }
    }
}