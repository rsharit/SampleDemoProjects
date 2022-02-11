package assignments.complex.parkinglot.src.main.customer.types;

import assignments.complex.parkinglot.src.main.customer.PLCustomer;
import assignments.complex.parkinglot.src.main.parkingSkeleton.StaffOrganization;
import assignments.complex.parkinglot.src.main.parkingSkeleton.TimeHistory.PLTimeStamp;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PLStaffCusomer extends PLCustomer {
    StaffOrganization organization;



}
