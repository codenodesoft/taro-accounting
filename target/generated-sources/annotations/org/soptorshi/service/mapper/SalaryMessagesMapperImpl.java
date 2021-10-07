package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.MonthlySalary;
import org.soptorshi.domain.SalaryMessages;
import org.soptorshi.service.dto.SalaryMessagesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SalaryMessagesMapperImpl implements SalaryMessagesMapper {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private MonthlySalaryMapper monthlySalaryMapper;

    @Override
    public List<SalaryMessages> toEntity(List<SalaryMessagesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalaryMessages> list = new ArrayList<SalaryMessages>( dtoList.size() );
        for ( SalaryMessagesDTO salaryMessagesDTO : dtoList ) {
            list.add( toEntity( salaryMessagesDTO ) );
        }

        return list;
    }

    @Override
    public List<SalaryMessagesDTO> toDto(List<SalaryMessages> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalaryMessagesDTO> list = new ArrayList<SalaryMessagesDTO>( entityList.size() );
        for ( SalaryMessages salaryMessages : entityList ) {
            list.add( toDto( salaryMessages ) );
        }

        return list;
    }

    @Override
    public SalaryMessagesDTO toDto(SalaryMessages salaryMessages) {
        if ( salaryMessages == null ) {
            return null;
        }

        SalaryMessagesDTO salaryMessagesDTO = new SalaryMessagesDTO();

        String fullName = salaryMessagesCommenterFullName( salaryMessages );
        if ( fullName != null ) {
            salaryMessagesDTO.setCommenterFullName( fullName );
        }
        Long id = salaryMessagesCommenterId( salaryMessages );
        if ( id != null ) {
            salaryMessagesDTO.setCommenterId( id );
        }
        Long id1 = salaryMessagesMonthlySalaryId( salaryMessages );
        if ( id1 != null ) {
            salaryMessagesDTO.setMonthlySalaryId( id1 );
        }
        salaryMessagesDTO.setId( salaryMessages.getId() );
        salaryMessagesDTO.setComments( salaryMessages.getComments() );
        salaryMessagesDTO.setCommentedOn( salaryMessages.getCommentedOn() );

        return salaryMessagesDTO;
    }

    @Override
    public SalaryMessages toEntity(SalaryMessagesDTO salaryMessagesDTO) {
        if ( salaryMessagesDTO == null ) {
            return null;
        }

        SalaryMessages salaryMessages = new SalaryMessages();

        salaryMessages.setMonthlySalary( monthlySalaryMapper.fromId( salaryMessagesDTO.getMonthlySalaryId() ) );
        salaryMessages.setCommenter( employeeMapper.fromId( salaryMessagesDTO.getCommenterId() ) );
        salaryMessages.setId( salaryMessagesDTO.getId() );
        salaryMessages.setComments( salaryMessagesDTO.getComments() );
        salaryMessages.setCommentedOn( salaryMessagesDTO.getCommentedOn() );

        return salaryMessages;
    }

    private String salaryMessagesCommenterFullName(SalaryMessages salaryMessages) {
        if ( salaryMessages == null ) {
            return null;
        }
        Employee commenter = salaryMessages.getCommenter();
        if ( commenter == null ) {
            return null;
        }
        String fullName = commenter.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long salaryMessagesCommenterId(SalaryMessages salaryMessages) {
        if ( salaryMessages == null ) {
            return null;
        }
        Employee commenter = salaryMessages.getCommenter();
        if ( commenter == null ) {
            return null;
        }
        Long id = commenter.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long salaryMessagesMonthlySalaryId(SalaryMessages salaryMessages) {
        if ( salaryMessages == null ) {
            return null;
        }
        MonthlySalary monthlySalary = salaryMessages.getMonthlySalary();
        if ( monthlySalary == null ) {
            return null;
        }
        Long id = monthlySalary.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
