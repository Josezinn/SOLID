//Para solucionar a inversão de dependencia, criei uma interface, assim LightSwitch não depende mais de LightBulb.
//LightBulb implementa a interface, ficando LightSwitch sem ser afetado.

public interface LightDevice {
    void turnOn();
    void turnOff();
    boolean isOn();
}