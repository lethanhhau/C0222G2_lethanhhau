package com.hau.service.contract;

import com.hau.model.contract.Contract;
import com.hau.repository.contract.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractService implements IContractService{

    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Iterable<Contract> findAll(Pageable pageable, String searchValue) {
        return this.iContractRepository.findByIdContract(pageable, "%" + searchValue + "%");
    }

    @Override
    public Optional<Contract> findById(Integer id) {
        return this.iContractRepository.findById(id);
    }

    @Override
    public void save(Contract contract) {
        this.iContractRepository.save(contract);
    }

    @Override
    public void remove(Integer id) {
        this.iContractRepository.deleteById(id);
    }
}
