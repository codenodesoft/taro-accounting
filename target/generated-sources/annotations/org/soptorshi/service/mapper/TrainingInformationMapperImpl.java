package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.TrainingInformation;
import org.soptorshi.service.dto.TrainingInformationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:23+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class TrainingInformationMapperImpl implements TrainingInformationMapper {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<TrainingInformation> toEntity(List<TrainingInformationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrainingInformation> list = new ArrayList<TrainingInformation>( dtoList.size() );
        for ( TrainingInformationDTO trainingInformationDTO : dtoList ) {
            list.add( toEntity( trainingInformationDTO ) );
        }

        return list;
    }

    @Override
    public List<TrainingInformationDTO> toDto(List<TrainingInformation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrainingInformationDTO> list = new ArrayList<TrainingInformationDTO>( entityList.size() );
        for ( TrainingInformation trainingInformation : entityList ) {
            list.add( toDto( trainingInformation ) );
        }

        return list;
    }

    @Override
    public TrainingInformationDTO toDto(TrainingInformation trainingInformation) {
        if ( trainingInformation == null ) {
            return null;
        }

        TrainingInformationDTO trainingInformationDTO = new TrainingInformationDTO();

        Long id = trainingInformationEmployeeId( trainingInformation );
        if ( id != null ) {
            trainingInformationDTO.setEmployeeId( id );
        }
        trainingInformationDTO.setId( trainingInformation.getId() );
        trainingInformationDTO.setName( trainingInformation.getName() );
        trainingInformationDTO.setSubject( trainingInformation.getSubject() );
        trainingInformationDTO.setOrganization( trainingInformation.getOrganization() );

        return trainingInformationDTO;
    }

    @Override
    public TrainingInformation toEntity(TrainingInformationDTO trainingInformationDTO) {
        if ( trainingInformationDTO == null ) {
            return null;
        }

        TrainingInformation trainingInformation = new TrainingInformation();

        trainingInformation.setEmployee( employeeMapper.fromId( trainingInformationDTO.getEmployeeId() ) );
        trainingInformation.setId( trainingInformationDTO.getId() );
        trainingInformation.setName( trainingInformationDTO.getName() );
        trainingInformation.setSubject( trainingInformationDTO.getSubject() );
        trainingInformation.setOrganization( trainingInformationDTO.getOrganization() );

        return trainingInformation;
    }

    private Long trainingInformationEmployeeId(TrainingInformation trainingInformation) {
        if ( trainingInformation == null ) {
            return null;
        }
        Employee employee = trainingInformation.getEmployee();
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
