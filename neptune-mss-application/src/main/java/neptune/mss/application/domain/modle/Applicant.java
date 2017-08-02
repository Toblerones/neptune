package neptune.mss.application.domain.modle;

import java.util.Date;
import java.util.List;

/**
 * Created by toblerones on 4/6/17.
 */
public class Applicant {

    private String applicantType;

    private String firstName;
    private String middleName;
    private String lastName;

    private String sex;
    private Date dateOfBirth;
    private String homePhoneNumber;
    private String mobileNumber;
    private String officeNumber;

    private String email;

    private List<Address> addresses;
}
