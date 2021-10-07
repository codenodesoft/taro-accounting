package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Department;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.Office;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.domain.Requisition;
import org.soptorshi.service.dto.RequisitionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class RequisitionMapperImpl implements RequisitionMapper {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private OfficeMapper officeMapper;
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Requisition> toEntity(List<RequisitionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Requisition> list = new ArrayList<Requisition>( dtoList.size() );
        for ( RequisitionDTO requisitionDTO : dtoList ) {
            list.add( toEntity( requisitionDTO ) );
        }

        return list;
    }

    @Override
    public List<RequisitionDTO> toDto(List<Requisition> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RequisitionDTO> list = new ArrayList<RequisitionDTO>( entityList.size() );
        for ( Requisition requisition : entityList ) {
            list.add( toDto( requisition ) );
        }

        return list;
    }

    @Override
    public RequisitionDTO toDto(Requisition requisition) {
        if ( requisition == null ) {
            return null;
        }

        RequisitionDTO requisitionDTO = new RequisitionDTO();

        String name = requisitionDepartmentName( requisition );
        if ( name != null ) {
            requisitionDTO.setDepartmentName( name );
        }
        String name1 = requisitionOfficeName( requisition );
        if ( name1 != null ) {
            requisitionDTO.setOfficeName( name1 );
        }
        Long id = requisitionProductCategoryId( requisition );
        if ( id != null ) {
            requisitionDTO.setProductCategoryId( id );
        }
        String fullName = requisitionEmployeeFullName( requisition );
        if ( fullName != null ) {
            requisitionDTO.setEmployeeFullName( fullName );
        }
        Long id1 = requisitionOfficeId( requisition );
        if ( id1 != null ) {
            requisitionDTO.setOfficeId( id1 );
        }
        String name2 = requisitionProductCategoryName( requisition );
        if ( name2 != null ) {
            requisitionDTO.setProductCategoryName( name2 );
        }
        Long id2 = requisitionDepartmentId( requisition );
        if ( id2 != null ) {
            requisitionDTO.setDepartmentId( id2 );
        }
        Long id3 = requisitionEmployeeId( requisition );
        if ( id3 != null ) {
            requisitionDTO.setEmployeeId( id3 );
        }
        requisitionDTO.setId( requisition.getId() );
        requisitionDTO.setRequisitionNo( requisition.getRequisitionNo() );
        requisitionDTO.setRequisitionType( requisition.getRequisitionType() );
        requisitionDTO.setReason( requisition.getReason() );
        requisitionDTO.setRequisitionDate( requisition.getRequisitionDate() );
        requisitionDTO.setAmount( requisition.getAmount() );
        requisitionDTO.setStatus( requisition.getStatus() );
        requisitionDTO.setSelected( requisition.isSelected() );
        requisitionDTO.setHeadRemarks( requisition.getHeadRemarks() );
        requisitionDTO.setRefToHead( requisition.getRefToHead() );
        requisitionDTO.setPurchaseCommitteeRemarks( requisition.getPurchaseCommitteeRemarks() );
        requisitionDTO.setRefToPurchaseCommittee( requisition.getRefToPurchaseCommittee() );
        requisitionDTO.setCfoRemarks( requisition.getCfoRemarks() );
        requisitionDTO.setRefToCfo( requisition.getRefToCfo() );
        requisitionDTO.setCommercialId( requisition.getCommercialId() );
        requisitionDTO.setModifiedBy( requisition.getModifiedBy() );
        requisitionDTO.setModifiedOn( requisition.getModifiedOn() );

        return requisitionDTO;
    }

    @Override
    public Requisition toEntity(RequisitionDTO requisitionDTO) {
        if ( requisitionDTO == null ) {
            return null;
        }

        Requisition requisition = new Requisition();

        requisition.setOffice( officeMapper.fromId( requisitionDTO.getOfficeId() ) );
        requisition.setEmployee( employeeMapper.fromId( requisitionDTO.getEmployeeId() ) );
        requisition.setDepartment( departmentMapper.fromId( requisitionDTO.getDepartmentId() ) );
        requisition.setProductCategory( productCategoryMapper.fromId( requisitionDTO.getProductCategoryId() ) );
        requisition.setId( requisitionDTO.getId() );
        requisition.setRequisitionNo( requisitionDTO.getRequisitionNo() );
        requisition.setRequisitionType( requisitionDTO.getRequisitionType() );
        requisition.setReason( requisitionDTO.getReason() );
        requisition.setRequisitionDate( requisitionDTO.getRequisitionDate() );
        requisition.setAmount( requisitionDTO.getAmount() );
        requisition.setStatus( requisitionDTO.getStatus() );
        requisition.setSelected( requisitionDTO.isSelected() );
        requisition.setHeadRemarks( requisitionDTO.getHeadRemarks() );
        requisition.setRefToHead( requisitionDTO.getRefToHead() );
        requisition.setPurchaseCommitteeRemarks( requisitionDTO.getPurchaseCommitteeRemarks() );
        requisition.setRefToPurchaseCommittee( requisitionDTO.getRefToPurchaseCommittee() );
        requisition.setCfoRemarks( requisitionDTO.getCfoRemarks() );
        requisition.setRefToCfo( requisitionDTO.getRefToCfo() );
        requisition.setCommercialId( requisitionDTO.getCommercialId() );
        requisition.setModifiedBy( requisitionDTO.getModifiedBy() );
        requisition.setModifiedOn( requisitionDTO.getModifiedOn() );

        return requisition;
    }

    private String requisitionDepartmentName(Requisition requisition) {
        if ( requisition == null ) {
            return null;
        }
        Department department = requisition.getDepartment();
        if ( department == null ) {
            return null;
        }
        String name = department.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String requisitionOfficeName(Requisition requisition) {
        if ( requisition == null ) {
            return null;
        }
        Office office = requisition.getOffice();
        if ( office == null ) {
            return null;
        }
        String name = office.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long requisitionProductCategoryId(Requisition requisition) {
        if ( requisition == null ) {
            return null;
        }
        ProductCategory productCategory = requisition.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        Long id = productCategory.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String requisitionEmployeeFullName(Requisition requisition) {
        if ( requisition == null ) {
            return null;
        }
        Employee employee = requisition.getEmployee();
        if ( employee == null ) {
            return null;
        }
        String fullName = employee.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long requisitionOfficeId(Requisition requisition) {
        if ( requisition == null ) {
            return null;
        }
        Office office = requisition.getOffice();
        if ( office == null ) {
            return null;
        }
        Long id = office.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String requisitionProductCategoryName(Requisition requisition) {
        if ( requisition == null ) {
            return null;
        }
        ProductCategory productCategory = requisition.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        String name = productCategory.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long requisitionDepartmentId(Requisition requisition) {
        if ( requisition == null ) {
            return null;
        }
        Department department = requisition.getDepartment();
        if ( department == null ) {
            return null;
        }
        Long id = department.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long requisitionEmployeeId(Requisition requisition) {
        if ( requisition == null ) {
            return null;
        }
        Employee employee = requisition.getEmployee();
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
