package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.MonthlySalary;
import org.soptorshi.service.dto.MonthlySalaryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class MonthlySalaryMapperImpl implements MonthlySalaryMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<MonthlySalary> toEntity(List<MonthlySalaryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<MonthlySalary> list = new ArrayList<MonthlySalary>( dtoList.size() );
        for ( MonthlySalaryDTO monthlySalaryDTO : dtoList ) {
            list.add( toEntity( monthlySalaryDTO ) );
        }

        return list;
    }

    @Override
    public List<MonthlySalaryDTO> toDto(List<MonthlySalary> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MonthlySalaryDTO> list = new ArrayList<MonthlySalaryDTO>( entityList.size() );
        for ( MonthlySalary monthlySalary : entityList ) {
            list.add( toDto( monthlySalary ) );
        }

        return list;
    }

    @Override
    public MonthlySalaryDTO toDto(MonthlySalary monthlySalary) {
        if ( monthlySalary == null ) {
            return null;
        }

        MonthlySalaryDTO monthlySalaryDTO = new MonthlySalaryDTO();

        String fullName = monthlySalaryEmployeeFullName( monthlySalary );
        if ( fullName != null ) {
            monthlySalaryDTO.setEmployeeFullName( fullName );
        }
        Long id = monthlySalaryEmployeeId( monthlySalary );
        if ( id != null ) {
            monthlySalaryDTO.setEmployeeId( id );
        }
        monthlySalaryDTO.setId( monthlySalary.getId() );
        monthlySalaryDTO.setYear( monthlySalary.getYear() );
        monthlySalaryDTO.setMonth( monthlySalary.getMonth() );
        monthlySalaryDTO.setBasic( monthlySalary.getBasic() );
        monthlySalaryDTO.setGross( monthlySalary.getGross() );
        monthlySalaryDTO.setHouseRent( monthlySalary.getHouseRent() );
        monthlySalaryDTO.setMedicalAllowance( monthlySalary.getMedicalAllowance() );
        monthlySalaryDTO.setOverTimeAllowance( monthlySalary.getOverTimeAllowance() );
        monthlySalaryDTO.setFoodAllowance( monthlySalary.getFoodAllowance() );
        monthlySalaryDTO.setArrearAllowance( monthlySalary.getArrearAllowance() );
        monthlySalaryDTO.setDriverAllowance( monthlySalary.getDriverAllowance() );
        monthlySalaryDTO.setFuelLubAllowance( monthlySalary.getFuelLubAllowance() );
        monthlySalaryDTO.setMobileAllowance( monthlySalary.getMobileAllowance() );
        monthlySalaryDTO.setTravelAllowance( monthlySalary.getTravelAllowance() );
        monthlySalaryDTO.setOtherAllowance( monthlySalary.getOtherAllowance() );
        monthlySalaryDTO.setFestivalAllowance( monthlySalary.getFestivalAllowance() );
        monthlySalaryDTO.setAbsent( monthlySalary.getAbsent() );
        monthlySalaryDTO.setFine( monthlySalary.getFine() );
        monthlySalaryDTO.setAdvanceHO( monthlySalary.getAdvanceHO() );
        monthlySalaryDTO.setAdvanceFactory( monthlySalary.getAdvanceFactory() );
        monthlySalaryDTO.setProvidentFund( monthlySalary.getProvidentFund() );
        monthlySalaryDTO.setTax( monthlySalary.getTax() );
        monthlySalaryDTO.setLoanAmount( monthlySalary.getLoanAmount() );
        monthlySalaryDTO.setBillPayable( monthlySalary.getBillPayable() );
        monthlySalaryDTO.setBillReceivable( monthlySalary.getBillReceivable() );
        monthlySalaryDTO.setPayable( monthlySalary.getPayable() );
        monthlySalaryDTO.setApproved( monthlySalary.isApproved() );
        monthlySalaryDTO.setOnHold( monthlySalary.isOnHold() );
        monthlySalaryDTO.setStatus( monthlySalary.getStatus() );
        monthlySalaryDTO.setModifiedBy( monthlySalary.getModifiedBy() );
        monthlySalaryDTO.setModifiedOn( monthlySalary.getModifiedOn() );
        monthlySalaryDTO.setVoucherGenerated( monthlySalary.isVoucherGenerated() );

        return monthlySalaryDTO;
    }

    @Override
    public MonthlySalary toEntity(MonthlySalaryDTO monthlySalaryDTO) {
        if ( monthlySalaryDTO == null ) {
            return null;
        }

        MonthlySalary monthlySalary = new MonthlySalary();

        monthlySalary.setEmployee( employeeMapper.fromId( monthlySalaryDTO.getEmployeeId() ) );
        monthlySalary.setId( monthlySalaryDTO.getId() );
        monthlySalary.setYear( monthlySalaryDTO.getYear() );
        monthlySalary.setMonth( monthlySalaryDTO.getMonth() );
        monthlySalary.setBasic( monthlySalaryDTO.getBasic() );
        monthlySalary.setGross( monthlySalaryDTO.getGross() );
        monthlySalary.setHouseRent( monthlySalaryDTO.getHouseRent() );
        monthlySalary.setMedicalAllowance( monthlySalaryDTO.getMedicalAllowance() );
        monthlySalary.setOverTimeAllowance( monthlySalaryDTO.getOverTimeAllowance() );
        monthlySalary.setFoodAllowance( monthlySalaryDTO.getFoodAllowance() );
        monthlySalary.setArrearAllowance( monthlySalaryDTO.getArrearAllowance() );
        monthlySalary.setDriverAllowance( monthlySalaryDTO.getDriverAllowance() );
        monthlySalary.setFuelLubAllowance( monthlySalaryDTO.getFuelLubAllowance() );
        monthlySalary.setMobileAllowance( monthlySalaryDTO.getMobileAllowance() );
        monthlySalary.setTravelAllowance( monthlySalaryDTO.getTravelAllowance() );
        monthlySalary.setOtherAllowance( monthlySalaryDTO.getOtherAllowance() );
        monthlySalary.setFestivalAllowance( monthlySalaryDTO.getFestivalAllowance() );
        monthlySalary.setAbsent( monthlySalaryDTO.getAbsent() );
        monthlySalary.setFine( monthlySalaryDTO.getFine() );
        monthlySalary.setAdvanceHO( monthlySalaryDTO.getAdvanceHO() );
        monthlySalary.setAdvanceFactory( monthlySalaryDTO.getAdvanceFactory() );
        monthlySalary.setProvidentFund( monthlySalaryDTO.getProvidentFund() );
        monthlySalary.setTax( monthlySalaryDTO.getTax() );
        monthlySalary.setLoanAmount( monthlySalaryDTO.getLoanAmount() );
        monthlySalary.setBillPayable( monthlySalaryDTO.getBillPayable() );
        monthlySalary.setBillReceivable( monthlySalaryDTO.getBillReceivable() );
        monthlySalary.setPayable( monthlySalaryDTO.getPayable() );
        monthlySalary.setApproved( monthlySalaryDTO.isApproved() );
        monthlySalary.setOnHold( monthlySalaryDTO.isOnHold() );
        monthlySalary.setStatus( monthlySalaryDTO.getStatus() );
        monthlySalary.setModifiedBy( monthlySalaryDTO.getModifiedBy() );
        monthlySalary.setModifiedOn( monthlySalaryDTO.getModifiedOn() );
        monthlySalary.setVoucherGenerated( monthlySalaryDTO.isVoucherGenerated() );

        return monthlySalary;
    }

    private String monthlySalaryEmployeeFullName(MonthlySalary monthlySalary) {
        if ( monthlySalary == null ) {
            return null;
        }
        Employee employee = monthlySalary.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long monthlySalaryEmployeeId(MonthlySalary monthlySalary) {
        if ( monthlySalary == null ) {
            return null;
        }
        Employee employee = monthlySalary.getEmployee();
        if ( employee == null ) {
            return null;
        }
        Long id = employee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
