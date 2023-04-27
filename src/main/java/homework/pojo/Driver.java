package homework.pojo;

public class Driver {
    private final String name;
    Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public String toString() {
        return "Водитель " + name + " - " + transport;
        }
}

