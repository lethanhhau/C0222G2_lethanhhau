// tslint:disable-next-line:class-name
class rentType {
id?: number;
rentTypeName?: string;
}

// tslint:disable-next-line:class-name
class facilityType {
  id?: number;
  facilityTypeName?: string;
}

// tslint:disable-next-line:no-empty-interface
export interface Facility {
id?: number;
facilityName?: string;
facilityArea?: number;
facilityCost?: number;
maxPeople?: number;
rentType?: rentType;
facilityType?: facilityType;
standardRoom?: string;
descriptionOtherConvenience?: string;
poolArea?: number;
numberOfFloors?: number;
facilityFree?: string;
}
