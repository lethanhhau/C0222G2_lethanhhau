package com.hau.service.contract_detail;

import com.hau.model.contract.ContractDetail;
import com.hau.repository.contract_detail.IContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContractDetailService implements IContractDetailService{
    @Autowired
    private IContractDetailRepository iContractDetailRepository;

    @Override
    public ContractDetail save(ContractDetail contractDetail) {
        return this.iContractDetailRepository.save(contractDetail);
    }

    @Override
    public List<ContractDetail> findAll() {
        return this.iContractDetailRepository.findAll();
    }
}
