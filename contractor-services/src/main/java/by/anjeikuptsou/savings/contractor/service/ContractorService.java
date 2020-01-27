package by.anjeikuptsou.savings.contractor.service;

import by.anjeikuptsou.savings.contractor.domain.Contractor;
import by.anjeikuptsou.savings.contractor.repository.ContractorRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ContractorService {
    @Autowired
    private ContractorRepository contractorRepository;

    public List<Contractor> findAll(String personalNumber) {
        if (StringUtils.isNotEmpty(personalNumber)) {
            return Collections.singletonList(this.contractorRepository.findByPersonalNumber(personalNumber));
        }
        return (List<Contractor>) this.contractorRepository.findAll();
    }
}
