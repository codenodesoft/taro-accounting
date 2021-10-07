package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Customer;
import org.soptorshi.service.dto.CustomerDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer toEntity(CustomerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( dto.getId() );
        customer.setName( dto.getName() );
        customer.setDescription( dto.getDescription() );
        customer.setAddress( dto.getAddress() );
        customer.setContactNo( dto.getContactNo() );
        customer.setModifiedBy( dto.getModifiedBy() );
        customer.setModifiedOn( dto.getModifiedOn() );

        return customer;
    }

    @Override
    public CustomerDTO toDto(Customer entity) {
        if ( entity == null ) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setId( entity.getId() );
        customerDTO.setName( entity.getName() );
        customerDTO.setDescription( entity.getDescription() );
        customerDTO.setAddress( entity.getAddress() );
        customerDTO.setContactNo( entity.getContactNo() );
        customerDTO.setModifiedBy( entity.getModifiedBy() );
        customerDTO.setModifiedOn( entity.getModifiedOn() );

        return customerDTO;
    }

    @Override
    public List<Customer> toEntity(List<CustomerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Customer> list = new ArrayList<Customer>( dtoList.size() );
        for ( CustomerDTO customerDTO : dtoList ) {
            list.add( toEntity( customerDTO ) );
        }

        return list;
    }

    @Override
    public List<CustomerDTO> toDto(List<Customer> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CustomerDTO> list = new ArrayList<CustomerDTO>( entityList.size() );
        for ( Customer customer : entityList ) {
            list.add( toDto( customer ) );
        }

        return list;
    }
}
