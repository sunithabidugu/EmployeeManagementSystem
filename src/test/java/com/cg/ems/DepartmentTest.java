
package com.cg.ems;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

import com.cg.ems.repository.IDepartmentRepository;
import com.cg.ems.dto.DepartmentDto;
import com.cg.ems.exception.DepartmentException;
//import com.cg.ems.exception.DepartmentE;
import com.cg.ems.service.IDepartmentService;
import com.cg.ems.service.IDepartmentServiceImpl;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class DepartmentTest {
@Mock
IDepartmentRepository departmentRepositoryMock;
	@InjectMocks
	IDepartmentService departmentServiceMock;
	DepartmentDto d1,d2;
	@BeforeAll
	static void setUpBeforeClass()throws Exception{
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception{
	}
	@BeforeEach
	void setUp() throws Exception{
		d1=new DepartmentDto(101,"HR");
		d2=new DepartmentDto(102,"Finance");
	}
		@AfterEach
		void tearDown() throws Exception{	
		}
		@Test
		void testGetAllDepartments() {
			
			List<DepartmentDto> dept = new ArrayList<>();
			
		
			
		dept.add(d1);
		dept.add(d2);
			
			when(departmentRepositoryMock.findAll()).thenReturn(dept);
			
			List<DepartmentDto> departmentList = departmentServiceMock.getAllDepartment();
			
			assertEquals(2,departmentList.size());	}
		
		@Test
		public void deleteDepartmentTest()throws DepartmentException {
			when(departmentRepositoryMock.findById(101)).thenReturn(Optional.of(d1));
			assertEquals(d1, departmentServiceMock.deleteDepartment(101));
		}
}
	


