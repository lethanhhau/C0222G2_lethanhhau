import { Component, OnInit } from '@angular/core';
import {Facility} from '../facility';

@Component({
  selector: 'app-list-facility',
  templateUrl: './list-facility.component.html',
  styleUrls: ['./list-facility.component.css']
})
export class ListFacilityComponent implements OnInit {
  facilityList: Facility[] = [];

  constructor() {
    // @ts-ignore
    // tslint:disable-next-line:max-line-length
    this.facilityList.push({id: 1, facilityName: 'PHÒNG SUITE HƯỚNG BIỂN', facilityArea: 85.8, facilityCost: 100000, maxPeople: 3, rentType: 'năm', facilityType: 'villa',
      standardRoom: '5*', descriptionOtherConvenience: 'đẹp', poolArea: 200, numberOfFloors: 2});
    // @ts-ignore
    // tslint:disable-next-line:max-line-length
    this.facilityList.push({id: 2, facilityName: 'PHÒNG STUDIO SUITE HƯỚNG BIỂN', facilityArea: 40.1, facilityCost: 100000, maxPeople: 2, rentType: 'giờ', facilityType: 'home' });
    // @ts-ignore
    // tslint:disable-next-line:max-line-length
    this.facilityList.push({id: 3, facilityName: 'PHÒNG DELUXE HƯỚNG BIỂN', facilityArea: 43.7 , facilityCost: 500000, maxPeople: 5, rentType: 'ngày', facilityType: 'room' });
  }

  ngOnInit(): void {
  }

}
