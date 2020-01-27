package by.anjeikuptsou.savings.contractor.repository;

import by.anjeikuptsou.savings.contractor.domain.Contractor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractorRepository extends CrudRepository<Contractor, Long> {
    Contractor findByPersonalNumber(String personalNumber);
}
