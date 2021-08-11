package com.github.felpfe.citiesapi.countries.repository;

import com.github.felpfe.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
