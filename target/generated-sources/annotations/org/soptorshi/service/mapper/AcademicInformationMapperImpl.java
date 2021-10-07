package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.AcademicInformation;
import org.soptorshi.domain.Employee;
import org.soptorshi.service.dto.AcademicInformationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class AcademicInformationMapperImpl implements AcademicInformationMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<AcademicInformation> toEntity(List<AcademicInformationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AcademicInformation> list = new ArrayList<AcademicInformation>( dtoList.size() );
        for ( AcademicInformationDTO academicInformationDTO : dtoList ) {
            list.add( toEntity( academicInformationDTO ) );
        }

        return list;
    }

    @Override
    public List<AcademicInformationDTO> toDto(List<AcademicInformation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AcademicInformationDTO> list = new ArrayList<AcademicInformationDTO>( entityList.size() );
        for ( AcademicInformation academicInformation : entityList ) {
            list.add( toDto( academicInformation ) );
        }

        return list;
    }

    @Override
    public AcademicInformationDTO toDto(AcademicInformation academicInformation) {
        if ( academicInformation == null ) {
            return null;
        }

        AcademicInformationDTO academicInformationDTO = new AcademicInformationDTO();

        Long id = academicInformationEmployeeId( academicInformation );
        if ( id != null ) {
            academicInformationDTO.setEmployeeId( id );
        }
        academicInformationDTO.setId( academicInformation.getId() );
        academicInformationDTO.setDegree( academicInformation.getDegree() );
        academicInformationDTO.setBoardOrUniversity( academicInformation.getBoardOrUniversity() );
        academicInformationDTO.setPassingYear( academicInformation.getPassingYear() );
        academicInformationDTO.setGroup( academicInformation.getGroup() );

        return academicInformationDTO;
    }

    @Override
    public AcademicInformation toEntity(AcademicInformationDTO academicInformationDTO) {
        if ( academicInformationDTO == null ) {
            return null;
        }

        AcademicInformation academicInformation = new AcademicInformation();

        academicInformation.setEmployee( employeeMapper.fromId( academicInformationDTO.getEmployeeId() ) );
        academicInformation.setId( academicInformationDTO.getId() );
        academicInformation.setDegree( academicInformationDTO.getDegree() );
        academicInformation.setBoardOrUniversity( academicInformationDTO.getBoardOrUniversity() );
        academicInformation.setPassingYear( academicInformationDTO.getPassingYear() );
        academicInformation.setGroup( academicInformationDTO.getGroup() );

        return academicInformation;
    }

    private Long academicInformationEmployeeId(AcademicInformation academicInformation) {
        if ( academicInformation == null ) {
            return null;
        }
        Employee employee = academicInformation.getEmployee();
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
