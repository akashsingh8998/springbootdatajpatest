package com.sapient.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sapient.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Query("SELECT c FROM City c WHERE c.name LIKE CONCAT('%',:ending) AND c.population < :num")
    List<City> findByNameEndingWithAndPopulationLessThan(@Param("ending") String ending,
                                                         @Param("num") Integer num);
    City findCityById(Long id);
    City findCityByName(String name);
    City findCityByNameAndId(String name,Long id);
}