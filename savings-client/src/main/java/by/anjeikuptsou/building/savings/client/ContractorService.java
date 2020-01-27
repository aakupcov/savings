package by.anjeikuptsou.building.savings.client;

import by.anjeikuptsou.building.savings.domain.Contractor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "CONTRACTORSERVICES")
public interface ContractorService {

    @RequestMapping(value = "/contractors", method = RequestMethod.GET)
    public List<Contractor> findAll(@RequestParam(name = "personalNumber", required = false) String personalNumber);
}
