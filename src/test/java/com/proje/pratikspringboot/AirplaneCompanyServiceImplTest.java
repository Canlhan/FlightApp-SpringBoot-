package com.proje.pratikspringboot;

import com.proje.pratikspringboot.domain.AirplaneCompany;
import com.proje.pratikspringboot.repositories.AirplaneCompanyRepository;
import com.proje.pratikspringboot.repositories.AirplaneRepository;
import com.proje.pratikspringboot.sevice.AirplaneCompanyServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class AirplaneCompanyServiceImplTest {

    @Mock
    private AirplaneCompanyRepository airplaneCompanyRepository;
    @Mock
    private AirplaneRepository airplaneRepository;

    @InjectMocks
    private AirplaneCompanyServiceImpl airplaneCompanyService;

    @Test
    public void testAddAirplaneCompany() {
        // Test data
        AirplaneCompany airplaneCompany = new AirplaneCompany();
        airplaneCompany.setId(1L);


        when(airplaneCompanyRepository.save(airplaneCompany)).thenReturn(airplaneCompany);
        // Call the method to test
        AirplaneCompany result = airplaneCompanyService.addAirplaneCompany(airplaneCompany);

        verify(airplaneCompanyRepository).save(airplaneCompany);
        // Assert that the result is not null (assuming your save() method returns the same object)
        assertNotNull(result);


    }
}
