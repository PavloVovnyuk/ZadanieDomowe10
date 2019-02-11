package TablicaZUnikalnymiObjectami;

public class Animal {
    private String name;
    private int year;

    public Animal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public void setYear(int year) {
        this.year = year;
    }
}




