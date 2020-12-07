package C.Users.SBela.Desktop.JAVA.Homework18.countries;

import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

@Service
public class CountryReader {
    private final List<Country> countryList;

    public CountryReader() throws FileNotFoundException {
        this.countryList = countries();
    }

    public List<Country> countries() throws FileNotFoundException {
        List<Country> listOfCountries = new ArrayList<>();
        Scanner fileReader = new Scanner(new FileReader("C:\\Users\\SBela\\Desktop\\JAVA\\Homework18\\Homework18-countries\\file\\countries2.txt"));

        while (fileReader.hasNextLine()) {
            String[] line = fileReader.nextLine().split("\\|");
            long population = Long.parseLong(line[2]);
            long area = Long.parseLong(line[3]);
            String neighbours = "";
            if (line.length == 6) {
                neighbours = line[5];
            }

            Country country = new Country(line[0], line[1], population, area, line[4], neighbours);
            listOfCountries.add(country);
        }
        return listOfCountries;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryReader that = (CountryReader) o;
        return Objects.equals(countryList, that.countryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryList);
    }

    @Override
    public String toString() {
        return "CountryReader{" +
                "countryList=" + countryList +
                '}';
    }
}
