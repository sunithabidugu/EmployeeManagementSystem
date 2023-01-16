package com.cg.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ems.dto.StatusReportDto;
@Repository
public interface IStatusReportRepository extends JpaRepository<StatusReportDto, Integer> {
	
	@Query("select cd from StatusReportDto cd where cd.userId=:id and cd.complianceId=:cid")
	public List<StatusReportDto> getAllStatusReport(@Param("id") String userId,@Param("cid") int complianceId);
}
