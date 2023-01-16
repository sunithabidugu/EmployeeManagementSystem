package com.cg.ems;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.ems.dto.ComplianceDto;
import com.cg.ems.dto.DepartmentDto;
import com.cg.ems.exception.RlNotExistsException;
import com.cg.ems.repository.IComplianceRepository;
import com.cg.ems.service.IComplianceServiceImpl;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class ComplianceTest {
	
		@Mock
		IComplianceRepository cRepositoryMock;
		@InjectMocks
		IComplianceServiceImpl cServiceMock;
		
		ComplianceDto c1,c2;
		
		@BeforeAll
		static void setUpBeforeClass() throws Exception{}
		@AfterAll
		static void tearDownAfterClass() throws Exception{}
		
		@BeforeEach
		void setUp() throws Exception{
			c1 = new ComplianceDto(101,"legislation","legislation details",LocalDate.now(),15,10,"not completed",new DepartmentDto(101,"HR"),"53");
			c2 = new ComplianceDto(102,"regulation","regulation details",LocalDate.now(),25,20,"completed",new DepartmentDto(102,"finance"),"50");
			
		}
		
		@AfterEach
		void tearDown() throws Exception {
		
		}
		@Test
		public void testGetAllRl() throws RlNotExistsException{
			List<ComplianceDto> cdto = new ArrayList<>();
			cdto.add(c1);
			cdto.add(c2);
			when(cRepositoryMock.findAll()).thenReturn(cdto);
			List<ComplianceDto> cList = cServiceMock.getAllRl();
			assertEquals(2,cList.size());	
		}
		
	

}
