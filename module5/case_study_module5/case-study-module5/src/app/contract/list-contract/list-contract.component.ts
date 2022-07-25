import { Component, OnInit } from '@angular/core';
import {Contract} from '../contract';

@Component({
  selector: 'app-list-contract',
  templateUrl: './list-contract.component.html',
  styleUrls: ['./list-contract.component.css']
})
export class ListContractComponent implements OnInit {
contracts: Contract[] = [];
  constructor() {
    this.contracts.push({contractId: 1, customer: {customerName:'Tài'} , facility: {facilityName: 'PHÒNG SUITE HƯỚNG BIỂN', facilityCost: 100000},
      startDate: '2022-07-21', endDate: '2022-07-22', deposits: 200000});

    this.contracts.push({contractId: 2, customer: {customerName:'Phương'} , facility: {facilityName: 'PHÒNG STUDIO SUITE HƯỚNG BIỂN', facilityCost: 1000000},
      startDate: '2022-07-25', endDate: '2022-08-25', deposits: 0});

    this.contracts.push({contractId: 3, customer: {customerName:'Hậu'} , facility: {facilityName: 'PHÒNG DELUXE HƯỚNG BIỂN', facilityCost: 5000000},
      startDate: '2022-08-20', endDate: '2023-08-20', deposits: 20000000});
  }

  ngOnInit(): void {
  }

}
