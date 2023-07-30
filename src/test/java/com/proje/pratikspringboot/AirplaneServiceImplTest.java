package com.proje.pratikspringboot;

import com.proje.pratikspringboot.domain.Airplane;
import com.proje.pratikspringboot.domain.AirplaneCompany;
import com.proje.pratikspringboot.repositories.AirplaneCompanyRepository;
import com.proje.pratikspringboot.repositories.AirplaneRepository;
import com.proje.pratikspringboot.sevice.AirplaneService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

public class AirplaneServiceImplTest {
    @Mock
    private AirplaneRepository airplaneRepository;
    @Mock
    private AirplaneCompanyRepository airplaneCompanyRepository;
    @InjectMocks
    private AirplaneService airplaneService;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testAddAirplane() {
        // Test data
        Airplane requestAirplane = new Airplane();
        requestAirplane.setAirplaneName("TestAirplane");
        Long companyId = 1L;
        AirplaneCompany airplaneCompany = new AirplaneCompany();
        airplaneCompany.setId(companyId);
        // Mock behavior for airplaneCompanyRepository.findById()
        when(airplaneCompanyRepository.findById(companyId)).thenReturn(Optional.of(airplaneCompany));
        // Mock behavior for airplaneRepository.findAll()
        Airplane existingAirplane = new Airplane();
        existingAirplane.setAirplaneName("TestAirplane");
        when(airplaneRepository.findAll()).thenReturn(List.of(existingAirplane));
        // Call the method to test
        airplaneService.addAirplane(requestAirplane, companyId);
        // Verify that the methods were called with correct arguments
        verify(airplaneCompanyRepository).findById(companyId);
        verify(airplaneCompanyRepository).save(airplaneCompany);
        verify(airplaneRepository).findAll();
        verify(airplaneRepository).save(existingAirplane);

    }
}
