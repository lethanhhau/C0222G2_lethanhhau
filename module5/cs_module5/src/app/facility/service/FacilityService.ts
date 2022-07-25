import {Facility} from '../model/Facility';

export class FacilityService {

  public getFacility(){
    let facilities: Facility[];

    facilities = [
      new Facility(1, 'PHÒNG SUITE HƯỚNG BIỂN',85.8, 100000,  3,  {facilityRentTypeId: 1, facilityRentTypeName: 'Năm'},  {FacilityTypeId: 1, facilityTypeName: 'Villa'},
    '5*', 'đẹp',  200,  2),

      new Facility( 2, 'PHÒNG STUDIO SUITE HƯỚNG BIỂN', 40.1, 1000000,2, {facilityRentTypeId: 2, facilityRentTypeName: 'Tháng'}, {FacilityTypeId: 2, facilityTypeName: 'House'},
        '4*','Binh Thuong', 300, 4),
    ]
    return facilities;
  }
}
