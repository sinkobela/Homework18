package C.Users.SBela.Desktop.JAVA.Homework18.countries;

import java.util.Objects;

public class Country {
    private final int id;
    private static int idCounter = 1;
    private final String name;
    private final String capital;
    private final long population;
    private final long area;
    private final String continent;
    private final String neighbour;

    public Country(String name, String capital, long population, long area, String continent, String neighbour) {
        this.id = idCounter++;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbour = neighbour;
    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public long getPopulation() {
        return population;
    }

    public long getArea() {
        return area;
    }

    public String getContinent() {
        return continent;
    }

    public String getNeighbour() {
        return neighbour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country that = (Country) o;
        return id == that.id &&
                population == that.population &&
                area == that.area &&
                Objects.equals(name, that.name) &&
                Objects.equals(capital, that.capital) &&
                Objects.equals(continent, that.continent) &&
                Objects.equals(neighbour, that.neighbour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, capital, population, area, continent, neighbour);
    }

    @Override
    public String toString() {
        return "CountryReader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", continent='" + continent + '\'' +
                ", neighbour='" + neighbour + '\'' +
                '}';
    }
}
