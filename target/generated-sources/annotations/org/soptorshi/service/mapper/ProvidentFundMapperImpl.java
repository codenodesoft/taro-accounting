package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.ProvidentFund;
import org.soptorshi.service.dto.ProvidentFundDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ProvidentFundMapperImpl implements ProvidentFundMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<ProvidentFund> toEntity(List<ProvidentFundDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ProvidentFund> list = new ArrayList<ProvidentFund>( dtoList.size() );
        for ( ProvidentFundDTO providentFundDTO : dtoList ) {
            list.add( toEntity( providentFundDTO ) );
        }

        return list;
    }

    @Override
    public List<ProvidentFundDTO> toDto(List<ProvidentFund> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProvidentFundDTO> list = new ArrayList<ProvidentFundDTO>( entityList.size() );
        for ( ProvidentFund providentFund : entityList ) {
            list.add( toDto( providentFund ) );
        }

        return list;
    }

    @Override
    public ProvidentFundDTO toDto(ProvidentFund providentFund) {
        if ( providentFund == null ) {
            return null;
        }

        ProvidentFundDTO providentFundDTO = new ProvidentFundDTO();

        String fullName = providentFundEmployeeFullName( providentFund );
        if ( fullName != null ) {
            providentFundDTO.setEmployeeFullName( fullName );
        }
        Long id = providentFundEmployeeId( providentFund );
        if ( id != null ) {
            providentFundDTO.setEmployeeId( id );
        }
        providentFundDTO.setId( providentFund.getId() );
        providentFundDTO.setStartDate( providentFund.getStartDate() );
        providentFundDTO.setRate( providentFund.getRate() );
        providentFundDTO.setStatus( providentFund.getStatus() );
        providentFundDTO.setModifiedBy( providentFund.getModifiedBy() );
        providentFundDTO.setModifiedOn( providentFund.getModifiedOn() );

        return providentFundDTO;
    }

    @Override
    public ProvidentFund toEntity(ProvidentFundDTO providentFundDTO) {
        if ( providentFundDTO == null ) {
            return null;
        }

        ProvidentFund providentFund = new ProvidentFund();

        providentFund.setEmployee( employeeMapper.fromId( providentFundDTO.getEmployeeId() ) );
        providentFund.setId( providentFundDTO.getId() );
        providentFund.setStartDate( providentFundDTO.getStartDate() );
        providentFund.setRate( providentFundDTO.getRate() );
        providentFund.setStatus( providentFundDTO.getStatus() );
        providentFund.setModifiedBy( providentFundDTO.getModifiedBy() );
        providentFund.setModifiedOn( providentFundDTO.getModifiedOn() );

        return providentFund;
    }

    private String providentFundEmployeeFullName(ProvidentFund providentFund) {
        if ( providentFund == null ) {
            return null;
        }
        Employee employee = providentFund.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long providentFundEmployeeId(ProvidentFund providentFund) {
        if ( providentFund == null ) {
            return null;
        }
        Employee employee = providentFund.getEmployee();
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
