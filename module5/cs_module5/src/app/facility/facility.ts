export interface Facility {
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
facilityFree?: string;
}
