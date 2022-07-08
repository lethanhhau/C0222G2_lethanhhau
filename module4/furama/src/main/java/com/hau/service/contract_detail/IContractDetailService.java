package com.hau.service.contract_detail;

import com.hau.model.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    ContractDetail save(ContractDetail contractDetail);

    List<ContractDetail> findAll();
}
