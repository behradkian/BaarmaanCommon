package radman.util.general.dto.person;

import radman.util.general.enumeration.IranianNationalCardType;
import radman.util.general.enumeration.Nationality;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IranianRealPerson extends RealPerson {

    private final Nationality nationality = Nationality.IRAN;
    private String nationalCardSerial;
    private IranianNationalCardType nationalCardType;

}
