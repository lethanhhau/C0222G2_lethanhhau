package com.hau.service.contract_detail;

import com.hau.model.contract.ContractDetail;
import com.hau.repository.IContractDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailService implements IContractDetailService{
    @Autowired
    private IContractDetailRepository iContractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return this.iContractDetailRepository.findAll();
    }


}
