package ir.baarmaan.general.dto.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDetails {

    private String postalCode;
    private String province;
    private String townShip;
    private String village;
    private String city;
    private String localityType;
    private String localityName;
    private String localityCode;
    private String subLocality;
    private String zone;
    private String firstStreet;
    private String secondStreet;
    private String buildingName;
    private String floorNumber;
    private String sideFloor;
    private String houseNumber;
    private String totalAddress;
}
