package telran.vending.frontend.recordservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArchiveMaintenanceRepository extends 
	JpaRepository<ArchiveMaintenanceRecordJpa, Integer>{

}
