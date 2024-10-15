package house;

public class House {
    private int id;
    private int apartmentNumber;
    private double area;
    private int floor;
    private int numberOfRooms;
    private String street;

    // конструктор
    public House() {}

    // сетер
    public void setValue(String field, Object value) {
        switch (field) {
            case "id" -> this.id = (int) value;
            case "apartmentNumber" -> this.apartmentNumber = (int) value;
            case "area" -> this.area = (double) value;
            case "floor" -> this.floor = (int) value;
            case "numberOfRooms" -> this.numberOfRooms = (int) value;
            case "street" -> this.street = (String) value;
            default -> throw new IllegalArgumentException("Поле не знайдено!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    // ґетер
    public Object getValue(String field) {
        return switch (field) {
            case "id" -> this.id;
            case "apartmentNumber" -> this.apartmentNumber;
            case "area" -> this.area;
            case "floor" -> this.floor;
            case "numberOfRooms" -> this.numberOfRooms;
            case "street" -> this.street;
            default -> throw new IllegalArgumentException("Поле не знайдено!");
        };
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", area=" + area +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", street='" + street + '\'' +
                '}';
    }
}
