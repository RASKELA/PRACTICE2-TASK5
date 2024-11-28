package org.practice2.task2;

public class Transport {
    private String name;
    private short year;
    private String routeNumber;
    private String type;
    private String[] supportedCities;
    private Size size;
    private boolean isEcoFriendly;
    private String systemType;

    public Transport(String name, short year, String routeNumber, String type, String[] supportedCities, Size size, boolean isEcoFriendly, String systemType) {
        this.name = name;
        this.year = year;
        this.routeNumber = routeNumber;
        this.type = type;
        this.supportedCities = supportedCities;
        this.size = size;
        this.isEcoFriendly = isEcoFriendly;
        this.systemType = systemType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setEcoFriendly(boolean ecoFriendly) {
        isEcoFriendly = ecoFriendly;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSupportedCities(String[] supportedCities) {
        this.supportedCities = supportedCities;
    }

    public String getName() {
        return name;
    }

    public short getYear() {
        return year;
    }

    public Size getSize() {
        return size;
    }

    public boolean isEcoFriendly() {
        return isEcoFriendly;
    }

    public String getSystemType() {
        return systemType;
    }
}