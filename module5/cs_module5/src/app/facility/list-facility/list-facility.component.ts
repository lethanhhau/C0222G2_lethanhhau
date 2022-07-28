import { Component, OnInit } from '@angular/core';
import {Facility} from '../../model/facility/facility';




@Component({
  selector: 'app-list-facility',
  templateUrl: './list-facility.component.html',
  styleUrls: ['./list-facility.component.css']
})
export class ListFacilityComponent implements OnInit {
  facilityList: Facility[] = [];

  constructor() {
    this.facilityList.push({facilityId: 1, facilityName: 'PHÒNG SUITE HƯỚNG BIỂN', facilityArea: 85.8, facilityCost: 100000, maxPeople: 3, facilityRentType: {facilityRentTypeId: 1, facilityRentTypeName: 'Năm'}, facilityType: {FacilityTypeId: 1, facilityTypeName: 'Villa'},
      standardRoom: '5*', descriptionOtherConvenience: 'đẹp', poolArea: 200, numberOfFloors: 2});

    this.facilityList.push({facilityId: 2, facilityName: 'PHÒNG STUDIO SUITE HƯỚNG BIỂN', facilityArea: 40.1, facilityCost: 1000000, maxPeople: 2, facilityRentType: {facilityRentTypeId: 2, facilityRentTypeName: 'Tháng'}, facilityType: {FacilityTypeId: 2, facilityTypeName: 'House'}});

    this.facilityList.push({facilityId: 3, facilityName: 'PHÒNG DELUXE HƯỚNG BIỂN', facilityArea: 43.7 , facilityCost: 5000000, maxPeople: 5, facilityRentType: {facilityRentTypeId: 3, facilityRentTypeName: 'Ngày'}, facilityType: {FacilityTypeId: 3, facilityTypeName: 'Room'} });
  }

  ngOnInit(): void {
  }

}

