export class Facility{
  facilityId?: number;
  facilityName?: string;
  facilityArea?: number;
  facilityCost?: number;
  maxPeople?: number;
  facilityRentType?: {
    facilityRentTypeId?: number;
    facilityRentTypeName?: string;
  };
  facilityType?: {
    FacilityTypeId?: number;
    facilityTypeName?: string;
  };
  standardRoom?: string;
  descriptionOtherConvenience?: string;
  poolArea?: number;
  numberOfFloors?: number;


  constructor(facilityId: number, facilityName: string, facilityArea: number, facilityCost: number, maxPeople: number,
              facilityRentType: { facilityRentTypeId?: number; facilityRentTypeName?: string }, facilityType: { FacilityTypeId?: number; facilityTypeName?: string },
              standardRoom: string, descriptionOtherConvenience: string, poolArea: number, numberOfFloors: number) {
    this.facilityId = facilityId;
    this.facilityName = facilityName;
    this.facilityArea = facilityArea;
    this.facilityCost = facilityCost;
    this.maxPeople = maxPeople;
    this.facilityRentType = facilityRentType;
    this.facilityType = facilityType;
    this.standardRoom = standardRoom;
    this.descriptionOtherConvenience = descriptionOtherConvenience;
    this.poolArea = poolArea;
    this.numberOfFloors = numberOfFloors;
  }


}


