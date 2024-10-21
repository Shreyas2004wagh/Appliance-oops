abstract class Appliance {
    // Encapsulated private fields
    private String brand;
    private boolean isOn;

    // Constructor
    public Appliance(String brand) {
        this.brand = brand;
        this.isOn = false; // By default, appliances are off
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println(brand + " is now ON.");
    }

    // Abstract method to be implemented by subclasses
    public abstract void operate();
}
class WashingMachine extends Appliance {
    // Unique field for WashingMachine
    private int washCycle;

    // Constructor
    public WashingMachine(String brand) {
        super(brand);
        this.washCycle = 0; // Default wash cycle
    }

    // Implementing the abstract method
    public void operate() {
        if (isOn()) {
            System.out.println(getBrand() + " Washing Machine is washing clothes on cycle " + washCycle + ".");
        } else {
            System.out.println(getBrand() + " Washing Machine is off. Please turn it on first.");
        }
    }

    // Unique method for WashingMachine
    public void setWashCycle(int cycle) {
        if (cycle > 0 && cycle <= 5) {
            this.washCycle = cycle;
            System.out.println("Wash cycle set to " + cycle + ".");
        } else {
            System.out.println("Invalid cycle! Choose between 1 and 5.");
        }
    }
}
class SmartFridge extends Appliance {
    // Unique field for SmartFridge
    private int temperature;

    // Constructor
    public SmartFridge(String brand) {
        super(brand);
        this.temperature = 5; // Default temperature
    }

    // Implementing the abstract method
    public void operate() {
        if (isOn()) {
            System.out.println(getBrand() + " Smart Fridge is cooling at " + temperature + "°C.");
        } else {
            System.out.println(getBrand() + " Smart Fridge is off. Please turn it on first.");
        }
    }

    // Unique method for SmartFridge
    public void setTemperature(int temperature) {
        if (temperature >= -5 && temperature <= 10) {
            this.temperature = temperature;
            System.out.println("Temperature set to " + temperature + "°C.");
        } else {
            System.out.println("Invalid temperature! Choose between -5°C and 10°C.");
        }
    }
}
class SmartOven extends Appliance {
    // Unique field for SmartOven
    private int cookingTemperature;

    // Constructor
    public SmartOven(String brand) {
        super(brand);
        this.cookingTemperature = 180; // Default temperature
    }

    // Implementing the abstract method
    public void operate() {
        if (isOn()) {
            System.out.println(getBrand() + " Smart Oven is baking at " + cookingTemperature + "°C.");
        } else {
            System.out.println(getBrand() + " Smart Oven is off. Please turn it on first.");
        }
    }

    // Unique method for SmartOven
    public void setCookingTemperature(int temperature) {
        if (temperature >= 100 && temperature <= 300) {
            this.cookingTemperature = temperature;
            System.out.println("Cooking temperature set to " + temperature + "°C.");
        } else {
            System.out.println("Invalid cooking temperature! Choose between 100°C and 300°C.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating a WashingMachine object
        WashingMachine washingMachine = new WashingMachine("LG");
        washingMachine.turnOn();
        washingMachine.setWashCycle(3);
        washingMachine.operate();

        System.out.println();

        // Creating a SmartFridge object
        SmartFridge fridge = new SmartFridge("Samsung");
        fridge.turnOn();
        fridge.setTemperature(4);
        fridge.operate();

        System.out.println();

        // Creating a SmartOven object
        SmartOven oven = new SmartOven("Bosch");
        oven.turnOn();
        oven.setCookingTemperature(220);
        oven.operate();
    }
}
