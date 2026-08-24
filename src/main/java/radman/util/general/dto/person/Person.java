package radman.util.general.dto.person;

import radman.util.general.dto.location.Address;
import radman.util.general.enumeration.PersonType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {

    private PersonType personType;
    private String code;
    private List<Address> addresses;

}
