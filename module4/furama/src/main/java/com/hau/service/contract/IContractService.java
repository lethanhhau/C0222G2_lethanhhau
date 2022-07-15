package com.hau.service.contract;

import com.hau.model.contract.AttachFacility;
import com.hau.model.contract.Contract;
import com.hau.model.contract.ContractDetail;
import com.hau.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IContractService {
    Page<Contract> getAllContract(Pageable pageable);

    Optional<Contract> findById(Integer id);

    Contract save(Contract contract);

    void remove(Integer id);

    List<Contract> findAllContract();

    List<AttachFacility> getAllAttachFacility();

}
