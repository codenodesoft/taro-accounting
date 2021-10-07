package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.InventoryLocation;
import org.soptorshi.domain.InventorySubLocation;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.domain.Requisition;
import org.soptorshi.domain.StockInProcess;
import org.soptorshi.domain.Vendor;
import org.soptorshi.service.dto.StockInProcessDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class StockInProcessMapperImpl implements StockInProcessMapper {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private InventoryLocationMapper inventoryLocationMapper;
    @Autowired
    private InventorySubLocationMapper inventorySubLocationMapper;
    @Autowired
    private VendorMapper vendorMapper;
    @Autowired
    private RequisitionMapper requisitionMapper;

    @Override
    public List<StockInProcess> toEntity(List<StockInProcessDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<StockInProcess> list = new ArrayList<StockInProcess>( dtoList.size() );
        for ( StockInProcessDTO stockInProcessDTO : dtoList ) {
            list.add( toEntity( stockInProcessDTO ) );
        }

        return list;
    }

    @Override
    public List<StockInProcessDTO> toDto(List<StockInProcess> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<StockInProcessDTO> list = new ArrayList<StockInProcessDTO>( entityList.size() );
        for ( StockInProcess stockInProcess : entityList ) {
            list.add( toDto( stockInProcess ) );
        }

        return list;
    }

    @Override
    public StockInProcessDTO toDto(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }

        StockInProcessDTO stockInProcessDTO = new StockInProcessDTO();

        Long id = stockInProcessProductsId( stockInProcess );
        if ( id != null ) {
            stockInProcessDTO.setProductsId( id );
        }
        String companyName = stockInProcessVendorCompanyName( stockInProcess );
        if ( companyName != null ) {
            stockInProcessDTO.setVendorCompanyName( companyName );
        }
        Long id1 = stockInProcessVendorId( stockInProcess );
        if ( id1 != null ) {
            stockInProcessDTO.setVendorId( id1 );
        }
        String name = stockInProcessInventoryLocationsName( stockInProcess );
        if ( name != null ) {
            stockInProcessDTO.setInventoryLocationsName( name );
        }
        String requisitionNo = stockInProcessRequisitionsRequisitionNo( stockInProcess );
        if ( requisitionNo != null ) {
            stockInProcessDTO.setRequisitionsRequisitionNo( requisitionNo );
        }
        String name1 = stockInProcessProductCategoriesName( stockInProcess );
        if ( name1 != null ) {
            stockInProcessDTO.setProductCategoriesName( name1 );
        }
        Long id2 = stockInProcessProductCategoriesId( stockInProcess );
        if ( id2 != null ) {
            stockInProcessDTO.setProductCategoriesId( id2 );
        }
        String name2 = stockInProcessProductsName( stockInProcess );
        if ( name2 != null ) {
            stockInProcessDTO.setProductsName( name2 );
        }
        String name3 = stockInProcessInventorySubLocationsName( stockInProcess );
        if ( name3 != null ) {
            stockInProcessDTO.setInventorySubLocationsName( name3 );
        }
        Long id3 = stockInProcessInventoryLocationsId( stockInProcess );
        if ( id3 != null ) {
            stockInProcessDTO.setInventoryLocationsId( id3 );
        }
        Long id4 = stockInProcessInventorySubLocationsId( stockInProcess );
        if ( id4 != null ) {
            stockInProcessDTO.setInventorySubLocationsId( id4 );
        }
        Long id5 = stockInProcessRequisitionsId( stockInProcess );
        if ( id5 != null ) {
            stockInProcessDTO.setRequisitionsId( id5 );
        }
        stockInProcessDTO.setId( stockInProcess.getId() );
        stockInProcessDTO.setTotalQuantity( stockInProcess.getTotalQuantity() );
        stockInProcessDTO.setUnit( stockInProcess.getUnit() );
        stockInProcessDTO.setUnitPrice( stockInProcess.getUnitPrice() );
        stockInProcessDTO.setTotalContainer( stockInProcess.getTotalContainer() );
        stockInProcessDTO.setContainerCategory( stockInProcess.getContainerCategory() );
        stockInProcessDTO.setContainerTrackingId( stockInProcess.getContainerTrackingId() );
        stockInProcessDTO.setQuantityPerContainer( stockInProcess.getQuantityPerContainer() );
        stockInProcessDTO.setMfgDate( stockInProcess.getMfgDate() );
        stockInProcessDTO.setExpiryDate( stockInProcess.getExpiryDate() );
        stockInProcessDTO.setTypeOfProduct( stockInProcess.getTypeOfProduct() );
        stockInProcessDTO.setStatus( stockInProcess.getStatus() );
        stockInProcessDTO.setProcessStartedBy( stockInProcess.getProcessStartedBy() );
        stockInProcessDTO.setProcessStartedOn( stockInProcess.getProcessStartedOn() );
        stockInProcessDTO.setStockInBy( stockInProcess.getStockInBy() );
        stockInProcessDTO.setStockInDate( stockInProcess.getStockInDate() );
        stockInProcessDTO.setRemarks( stockInProcess.getRemarks() );

        return stockInProcessDTO;
    }

    @Override
    public StockInProcess toEntity(StockInProcessDTO stockInProcessDTO) {
        if ( stockInProcessDTO == null ) {
            return null;
        }

        StockInProcess stockInProcess = new StockInProcess();

        stockInProcess.setProductCategories( productCategoryMapper.fromId( stockInProcessDTO.getProductCategoriesId() ) );
        stockInProcess.setInventorySubLocations( inventorySubLocationMapper.fromId( stockInProcessDTO.getInventorySubLocationsId() ) );
        stockInProcess.setInventoryLocations( inventoryLocationMapper.fromId( stockInProcessDTO.getInventoryLocationsId() ) );
        stockInProcess.setVendor( vendorMapper.fromId( stockInProcessDTO.getVendorId() ) );
        stockInProcess.setRequisitions( requisitionMapper.fromId( stockInProcessDTO.getRequisitionsId() ) );
        stockInProcess.setProducts( productMapper.fromId( stockInProcessDTO.getProductsId() ) );
        stockInProcess.setId( stockInProcessDTO.getId() );
        stockInProcess.setTotalQuantity( stockInProcessDTO.getTotalQuantity() );
        stockInProcess.setUnit( stockInProcessDTO.getUnit() );
        stockInProcess.setUnitPrice( stockInProcessDTO.getUnitPrice() );
        stockInProcess.setTotalContainer( stockInProcessDTO.getTotalContainer() );
        stockInProcess.setContainerCategory( stockInProcessDTO.getContainerCategory() );
        stockInProcess.setContainerTrackingId( stockInProcessDTO.getContainerTrackingId() );
        stockInProcess.setQuantityPerContainer( stockInProcessDTO.getQuantityPerContainer() );
        stockInProcess.setMfgDate( stockInProcessDTO.getMfgDate() );
        stockInProcess.setExpiryDate( stockInProcessDTO.getExpiryDate() );
        stockInProcess.setTypeOfProduct( stockInProcessDTO.getTypeOfProduct() );
        stockInProcess.setStatus( stockInProcessDTO.getStatus() );
        stockInProcess.setProcessStartedBy( stockInProcessDTO.getProcessStartedBy() );
        stockInProcess.setProcessStartedOn( stockInProcessDTO.getProcessStartedOn() );
        stockInProcess.setStockInBy( stockInProcessDTO.getStockInBy() );
        stockInProcess.setStockInDate( stockInProcessDTO.getStockInDate() );
        stockInProcess.setRemarks( stockInProcessDTO.getRemarks() );

        return stockInProcess;
    }

    private Long stockInProcessProductsId(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        Product products = stockInProcess.getProducts();
        if ( products == null ) {
            return null;
        }
        Long id = products.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockInProcessVendorCompanyName(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        Vendor vendor = stockInProcess.getVendor();
        if ( vendor == null ) {
            return null;
        }
        String companyName = vendor.getCompanyName();
        if ( companyName == null ) {
            return null;
        }
        return companyName;
    }

    private Long stockInProcessVendorId(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        Vendor vendor = stockInProcess.getVendor();
        if ( vendor == null ) {
            return null;
        }
        Long id = vendor.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockInProcessInventoryLocationsName(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        InventoryLocation inventoryLocations = stockInProcess.getInventoryLocations();
        if ( inventoryLocations == null ) {
            return null;
        }
        String name = inventoryLocations.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String stockInProcessRequisitionsRequisitionNo(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        Requisition requisitions = stockInProcess.getRequisitions();
        if ( requisitions == null ) {
            return null;
        }
        String requisitionNo = requisitions.getRequisitionNo();
        if ( requisitionNo == null ) {
            return null;
        }
        return requisitionNo;
    }

    private String stockInProcessProductCategoriesName(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        ProductCategory productCategories = stockInProcess.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        String name = productCategories.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockInProcessProductCategoriesId(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        ProductCategory productCategories = stockInProcess.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        Long id = productCategories.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockInProcessProductsName(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        Product products = stockInProcess.getProducts();
        if ( products == null ) {
            return null;
        }
        String name = products.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String stockInProcessInventorySubLocationsName(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        InventorySubLocation inventorySubLocations = stockInProcess.getInventorySubLocations();
        if ( inventorySubLocations == null ) {
            return null;
        }
        String name = inventorySubLocations.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockInProcessInventoryLocationsId(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        InventoryLocation inventoryLocations = stockInProcess.getInventoryLocations();
        if ( inventoryLocations == null ) {
            return null;
        }
        Long id = inventoryLocations.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long stockInProcessInventorySubLocationsId(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        InventorySubLocation inventorySubLocations = stockInProcess.getInventorySubLocations();
        if ( inventorySubLocations == null ) {
            return null;
        }
        Long id = inventorySubLocations.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long stockInProcessRequisitionsId(StockInProcess stockInProcess) {
        if ( stockInProcess == null ) {
            return null;
        }
        Requisition requisitions = stockInProcess.getRequisitions();
        if ( requisitions == null ) {
            return null;
        }
        Long id = requisitions.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
