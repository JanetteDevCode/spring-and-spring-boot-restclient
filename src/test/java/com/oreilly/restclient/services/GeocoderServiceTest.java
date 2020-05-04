package com.oreilly.restclient.services;

import com.oreilly.restclient.entities.Site;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GeocoderServiceTest {
    @Autowired
    private GeocoderService service;

    @Test
    void getLatLngForGoogleHeadquarters() {
        Site google = service.getLatLng("1600 Ampitheatre Parkway", "Mountain View", "CA");
        assertEquals(37.42, google.getLatitude(), 0.01);
        assertEquals(-122.08, google.getLongitude(), 0.01);
    }

    @Test
    void getLatLngWithoutStreet() {
        Site site = service.getLatLng("Boston", "MA");
        assertEquals(42.36, site.getLatitude(), 0.01);
        assertEquals(-71.06, site.getLongitude(), 0.01);
    }
}