package tech.haque.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.haque.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Optional<Employee> findEmployeeById(Long id);

}
