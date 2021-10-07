package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.BudgetAllocation;
import org.soptorshi.domain.Department;
import org.soptorshi.domain.FinancialAccountYear;
import org.soptorshi.domain.Office;
import org.soptorshi.service.dto.BudgetAllocationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class BudgetAllocationMapperImpl implements BudgetAllocationMapper {

    @Autowired
    private OfficeMapper officeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private FinancialAccountYearMapper financialAccountYearMapper;

    @Override
    public List<BudgetAllocation> toEntity(List<BudgetAllocationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<BudgetAllocation> list = new ArrayList<BudgetAllocation>( dtoList.size() );
        for ( BudgetAllocationDTO budgetAllocationDTO : dtoList ) {
            list.add( toEntity( budgetAllocationDTO ) );
        }

        return list;
    }

    @Override
    public List<BudgetAllocationDTO> toDto(List<BudgetAllocation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<BudgetAllocationDTO> list = new ArrayList<BudgetAllocationDTO>( entityList.size() );
        for ( BudgetAllocation budgetAllocation : entityList ) {
            list.add( toDto( budgetAllocation ) );
        }

        return list;
    }

    @Override
    public BudgetAllocationDTO toDto(BudgetAllocation budgetAllocation) {
        if ( budgetAllocation == null ) {
            return null;
        }

        BudgetAllocationDTO budgetAllocationDTO = new BudgetAllocationDTO();

        String name = budgetAllocationDepartmentName( budgetAllocation );
        if ( name != null ) {
            budgetAllocationDTO.setDepartmentName( name );
        }
        String name1 = budgetAllocationOfficeName( budgetAllocation );
        if ( name1 != null ) {
            budgetAllocationDTO.setOfficeName( name1 );
        }
        Long id = budgetAllocationFinancialAccountYearId( budgetAllocation );
        if ( id != null ) {
            budgetAllocationDTO.setFinancialAccountYearId( id );
        }
        Long id1 = budgetAllocationOfficeId( budgetAllocation );
        if ( id1 != null ) {
            budgetAllocationDTO.setOfficeId( id1 );
        }
        Long id2 = budgetAllocationDepartmentId( budgetAllocation );
        if ( id2 != null ) {
            budgetAllocationDTO.setDepartmentId( id2 );
        }
        budgetAllocationDTO.setId( budgetAllocation.getId() );
        budgetAllocationDTO.setAmount( budgetAllocation.getAmount() );

        return budgetAllocationDTO;
    }

    @Override
    public BudgetAllocation toEntity(BudgetAllocationDTO budgetAllocationDTO) {
        if ( budgetAllocationDTO == null ) {
            return null;
        }

        BudgetAllocation budgetAllocation = new BudgetAllocation();

        budgetAllocation.setOffice( officeMapper.fromId( budgetAllocationDTO.getOfficeId() ) );
        budgetAllocation.setDepartment( departmentMapper.fromId( budgetAllocationDTO.getDepartmentId() ) );
        budgetAllocation.setFinancialAccountYear( financialAccountYearMapper.fromId( budgetAllocationDTO.getFinancialAccountYearId() ) );
        budgetAllocation.setId( budgetAllocationDTO.getId() );
        budgetAllocation.setAmount( budgetAllocationDTO.getAmount() );

        return budgetAllocation;
    }

    private String budgetAllocationDepartmentName(BudgetAllocation budgetAllocation) {
        if ( budgetAllocation == null ) {
            return null;
        }
        Department department = budgetAllocation.getDepartment();
        if ( department == null ) {
            return null;
        }
        String name = department.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String budgetAllocationOfficeName(BudgetAllocation budgetAllocation) {
        if ( budgetAllocation == null ) {
            return null;
        }
        Office office = budgetAllocation.getOffice();
        if ( office == null ) {
            return null;
        }
        String name = office.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long budgetAllocationFinancialAccountYearId(BudgetAllocation budgetAllocation) {
        if ( budgetAllocation == null ) {
            return null;
        }
        FinancialAccountYear financialAccountYear = budgetAllocation.getFinancialAccountYear();
        if ( financialAccountYear == null ) {
            return null;
        }
        Long id = financialAccountYear.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long budgetAllocationOfficeId(BudgetAllocation budgetAllocation) {
        if ( budgetAllocation == null ) {
            return null;
        }
        Office office = budgetAllocation.getOffice();
        if ( office == null ) {
            return null;
        }
        Long id = office.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long budgetAllocationDepartmentId(BudgetAllocation budgetAllocation) {
        if ( budgetAllocation == null ) {
            return null;
        }
        Department department = budgetAllocation.getDepartment();
        if ( department == null ) {
            return null;
        }
        Long id = department.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
