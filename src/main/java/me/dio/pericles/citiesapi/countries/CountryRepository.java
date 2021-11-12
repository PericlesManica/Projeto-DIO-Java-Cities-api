package me.dio.pericles.citiesapi.countries;

import me.dio.pericles.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
