package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Office;
import org.soptorshi.domain.SalaryVoucherRelation;
import org.soptorshi.service.dto.SalaryVoucherRelationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SalaryVoucherRelationMapperImpl implements SalaryVoucherRelationMapper {

    @Autowired
    private OfficeMapper officeMapper;

    @Override
    public List<SalaryVoucherRelation> toEntity(List<SalaryVoucherRelationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalaryVoucherRelation> list = new ArrayList<SalaryVoucherRelation>( dtoList.size() );
        for ( SalaryVoucherRelationDTO salaryVoucherRelationDTO : dtoList ) {
            list.add( toEntity( salaryVoucherRelationDTO ) );
        }

        return list;
    }

    @Override
    public List<SalaryVoucherRelationDTO> toDto(List<SalaryVoucherRelation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalaryVoucherRelationDTO> list = new ArrayList<SalaryVoucherRelationDTO>( entityList.size() );
        for ( SalaryVoucherRelation salaryVoucherRelation : entityList ) {
            list.add( toDto( salaryVoucherRelation ) );
        }

        return list;
    }

    @Override
    public SalaryVoucherRelationDTO toDto(SalaryVoucherRelation salaryVoucherRelation) {
        if ( salaryVoucherRelation == null ) {
            return null;
        }

        SalaryVoucherRelationDTO salaryVoucherRelationDTO = new SalaryVoucherRelationDTO();

        String name = salaryVoucherRelationOfficeName( salaryVoucherRelation );
        if ( name != null ) {
            salaryVoucherRelationDTO.setOfficeName( name );
        }
        Long id = salaryVoucherRelationOfficeId( salaryVoucherRelation );
        if ( id != null ) {
            salaryVoucherRelationDTO.setOfficeId( id );
        }
        salaryVoucherRelationDTO.setId( salaryVoucherRelation.getId() );
        salaryVoucherRelationDTO.setYear( salaryVoucherRelation.getYear() );
        salaryVoucherRelationDTO.setMonth( salaryVoucherRelation.getMonth() );
        salaryVoucherRelationDTO.setVoucherNo( salaryVoucherRelation.getVoucherNo() );
        salaryVoucherRelationDTO.setModifiedBy( salaryVoucherRelation.getModifiedBy() );
        salaryVoucherRelationDTO.setModifiedOn( salaryVoucherRelation.getModifiedOn() );

        return salaryVoucherRelationDTO;
    }

    @Override
    public SalaryVoucherRelation toEntity(SalaryVoucherRelationDTO salaryVoucherRelationDTO) {
        if ( salaryVoucherRelationDTO == null ) {
            return null;
        }

        SalaryVoucherRelation salaryVoucherRelation = new SalaryVoucherRelation();

        salaryVoucherRelation.setOffice( officeMapper.fromId( salaryVoucherRelationDTO.getOfficeId() ) );
        salaryVoucherRelation.setId( salaryVoucherRelationDTO.getId() );
        salaryVoucherRelation.setYear( salaryVoucherRelationDTO.getYear() );
        salaryVoucherRelation.setMonth( salaryVoucherRelationDTO.getMonth() );
        salaryVoucherRelation.setVoucherNo( salaryVoucherRelationDTO.getVoucherNo() );
        salaryVoucherRelation.setModifiedBy( salaryVoucherRelationDTO.getModifiedBy() );
        salaryVoucherRelation.setModifiedOn( salaryVoucherRelationDTO.getModifiedOn() );

        return salaryVoucherRelation;
    }

    private String salaryVoucherRelationOfficeName(SalaryVoucherRelation salaryVoucherRelation) {
        if ( salaryVoucherRelation == null ) {
            return null;
        }
        Office office = salaryVoucherRelation.getOffice();
        if ( office == null ) {
            return null;
        }
        String name = office.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long salaryVoucherRelationOfficeId(SalaryVoucherRelation salaryVoucherRelation) {
        if ( salaryVoucherRelation == null ) {
            return null;
        }
        Office office = salaryVoucherRelation.getOffice();
        if ( office == null ) {
            return null;
        }
        Long id = office.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
