package bg.softuni.nextleveltechnologies.repository;

import bg.softuni.nextleveltechnologies.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllByAgeGreaterThan(int age);
}
