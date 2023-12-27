package telran.microservices.probes.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import telran.microservices.probes.entities.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {
	List<Person> findBySensorId(long id);
}
