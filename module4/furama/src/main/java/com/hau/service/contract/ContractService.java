package com.hau.service.contract;

import com.hau.model.contract.Contract;
import com.hau.repository.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContractService implements IContractService{

    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Page<Contract> getAllContract(Pageable pageable) {
        return this.iContractRepository.getAllContract(pageable);

    }

    @Override
    public Optional<Contract> findById(Integer id) {
        return this.iContractRepository.findById(id);
    }

    @Override
    public Contract save(Contract contract) {
        return this.iContractRepository.save(contract);
    }

    @Override
    public void remove(Integer id) {
        this.iContractRepository.delete(this.iContractRepository.getById(id));
    }

    @Override
    public List<Contract> findAllContract() {
        return this.iContractRepository.findAll();
    }


}
