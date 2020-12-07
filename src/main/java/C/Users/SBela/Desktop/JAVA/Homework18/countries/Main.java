package C.Users.SBela.Desktop.JAVA.Homework18.countries;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CountryReader countryReader = new CountryReader();

        for (Country country : countryReader.getCountryList()) {
            System.out.println(country);
        }

    }
}
