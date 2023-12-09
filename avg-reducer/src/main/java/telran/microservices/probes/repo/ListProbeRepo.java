package telran.microservices.probes.repo;

import org.springframework.data.repository.CrudRepository;
import telran.microservices.probes.entities.ListProbeValue;

public interface ListProbeRepo extends CrudRepository<ListProbeValue, Long> {

}
