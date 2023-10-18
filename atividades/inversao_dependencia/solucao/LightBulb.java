//Para solucionar a inversão de dependencia, criei uma interface, assim LightSwitch não depende mais de LightBulb.
//LightBulb implementa a interface, ficando LightSwitch sem ser afetado.

public class LightBulb implements LightDevice {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Light bulb turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light bulb turned off");
    }

    public boolean isOn() {
        return isOn;
    }
}