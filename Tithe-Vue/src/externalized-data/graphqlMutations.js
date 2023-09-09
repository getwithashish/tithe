// Forane Page

export const createForaneMutation = `mutation createForane ($forane: ForaneMutationInput!){
    createOneForane (forane: $forane){
        foraneId
        foraneName
    }
}
`;

export const deactivateForaneMutation = `mutation removeForane ($foraneId: ID!){
    deactivateOneForane (foraneId: $foraneId){
        foraneId
        foraneName
    }
}
`;

export const activateForaneMutation = `mutation activateForane ($foraneId: ID!){
    activateOneForane (foraneId: $foraneId){
        foraneId
        foraneName
    }
}
`;

// Parish Page

export const createParishMutation = `mutation createParish ($parish: ParishMutationInput!){
    createOneParish (parish: $parish){
        parishId
        parishName
    }
}
`;

export const deactivateParishMutation = `mutation removeParish ($parishId: ID!){
    deactivateOneParish (parishId: $parishId){
        parishId
        parishName
    }
}
`;

export const activateParishMutation = `mutation activateParish ($parishId: ID!){
    activateOneParish (parishId: $parishId){
        parishId
        parishName
    }
}
`;

// Koottayma Page

export const createKoottaymaMutation = `mutation createKoottayma ($koottayma: KoottaymaMutationInput!){
    createOneKoottayma (koottayma: $koottayma){
        koottaymaId
        koottaymaName
    }
}
`;

export const deactivateKoottaymaMutation = `mutation removeKoottayma ($koottaymaId: ID!){
    deactivateOneKoottayma (koottaymaId: $koottaymaId){
        koottaymaId
        koottaymaName
    }
}
`;

export const activateKoottaymaMutation = `mutation activateKoottayma ($koottaymaId: ID!){
    activateOneKoottayma (koottaymaId: $koottaymaId){
        koottaymaId
        koottaymaName
    }
}
`;

// Address Mutations

export const createStreetMutation = `mutation createNewStreet ($streetName: String!){
  createOneStreet(streetName: $streetName){
    streetId
    streetName
  }
}`;

export const createCityMutation = `mutation createNewCity ($cityName: String!){
  createOneCity(cityName: $cityName){
    cityId
    cityName
  }
}`;

export const createDistrictMutation = `mutation createNewDistrict ($districtName: String!){
  createOneDistrict(districtName: $districtName){
    districtId
    districtName
  }
}`;

export const createStateMutation = `mutation createNewState ($stateName: String!){
  createOneState(stateName: $stateName){
    stateId
    stateName
  }
}`;

export const createPincodeMutation = `mutation createNewPincode ($pincode: String!){
  createOnePincode(pincode: $pincode){
    pincodeId
    pincode
  }
}`;
