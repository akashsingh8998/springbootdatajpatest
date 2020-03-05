package com.sapient.repository;
import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.sapient.model.City;
import com.sapient.springbootdatajpatest.SpringBootDataJpaTestApplication;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@ContextConfiguration(classes=SpringBootDataJpaTestApplication.class)
public class CityRepositoryTest {

    @Autowired
    private CityRepository repository;

    //check if list is returning values
    @Test
    public void should_find_all_customers() {

        Iterable<City> cities = repository.findAll();

        int nOfCities = 12;
        assertThat(cities).hasSize(nOfCities);
    }

    //check if name is ending with given keyword and population is less than a value
    @Test
    public void should_find_with_name_ending_population_less_than() {

        var cities = repository.findByNameEndingWithAndPopulationLessThan("est", 150000);

        assertThat(cities).isNotEmpty();
    }
    
    //find value by given id
    @Test
    public void find_by_id_1() {
    	City city = repository.findCityById(1L);
    	City cityy = new City(1L,"Bratislava",432000);
    	Assert.assertEquals(city,cityy);
    	}
    
    @Test
    public void find_by_id_2() {
    	City city = repository.findCityById(2L);
    	City cityy = new City(2L,"Budapest",1759000);
    	Assert.assertEquals(city,cityy);
    	}
    
    @Test
    public void find_by_id_3() {
    	City city = repository.findCityById(3L);
    	City cityy = new City(3L,"Prague",1280000);
    	Assert.assertEquals(city,cityy);
    	}
    
    //find value by name
    @Test
    public void find_by_name_1() {
    	City city = repository.findCityByName("Bratislava");
    	City cityy = new City(1L,"Bratislava",432000);
    	Assert.assertEquals(city,cityy);
    	}
    
    @Test
    public void find_by_name_2() {
    	City city = repository.findCityByName("Budapest");
    	City cityy = new City(2L,"Budapest",1759000);
    	Assert.assertEquals(city,cityy);
    	}
    
    @Test
    public void find_by_name_3() {
    	City city = repository.findCityByName("Prague");
    	City cityy = new City(3L,"Prague",1280000);
    	Assert.assertEquals(city,cityy);
    	}
    
    //find by name and id
    @Test
    public void find_by_name_id_1() {
    	City city = repository.findCityByNameAndId("Bratislava",1L);
    	City cityy = new City(1L,"Bratislava",432000);
    	Assert.assertEquals(city,cityy);
    	}
    
    @Test
    public void find_by_name_id_2() {
    	City city = repository.findCityByNameAndId("Budapest",2L);
    	City cityy = new City(2L,"Budapest",1759000);
    	Assert.assertEquals(city,cityy);
    	}
    
    @Test
    public void find_by_name_id_3() {
    	City city = repository.findCityByNameAndId("Prague",3L);
    	City cityy = new City(3L,"Prague",1280000);
    	Assert.assertEquals(city,cityy);
    	}

}