package C.Users.SBela.Desktop.JAVA.Homework18.countries;

import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;
import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/countries")
public class CountryService {
    private final CountryReader countryReader;

    public CountryService() throws FileNotFoundException {
        this.countryReader = new CountryReader();
    }

    @GetMapping
    public List<Country> listAllCountries() {
        return countryReader.getCountryList();
    }

    @GetMapping("/names")
    public List<String> listAllCountryNames() {
        return countryReader.getCountryList().stream()
                .map(Country::getName)
                .collect(toList());
    }

    // NEXT: - get capital of a country : /countries/<countryId>/capital -> returns a string
}
