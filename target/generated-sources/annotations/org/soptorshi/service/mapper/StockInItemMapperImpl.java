package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.InventoryLocation;
import org.soptorshi.domain.InventorySubLocation;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.domain.Requisition;
import org.soptorshi.domain.StockInItem;
import org.soptorshi.domain.StockInProcess;
import org.soptorshi.domain.Vendor;
import org.soptorshi.service.dto.StockInItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class StockInItemMapperImpl implements StockInItemMapper {

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
    private StockInProcessMapper stockInProcessMapper;
    @Autowired
    private RequisitionMapper requisitionMapper;

    @Override
    public List<StockInItem> toEntity(List<StockInItemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<StockInItem> list = new ArrayList<StockInItem>( dtoList.size() );
        for ( StockInItemDTO stockInItemDTO : dtoList ) {
            list.add( toEntity( stockInItemDTO ) );
        }

        return list;
    }

    @Override
    public List<StockInItemDTO> toDto(List<StockInItem> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<StockInItemDTO> list = new ArrayList<StockInItemDTO>( entityList.size() );
        for ( StockInItem stockInItem : entityList ) {
            list.add( toDto( stockInItem ) );
        }

        return list;
    }

    @Override
    public StockInItemDTO toDto(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }

        StockInItemDTO stockInItemDTO = new StockInItemDTO();

        Long id = stockInItemProductsId( stockInItem );
        if ( id != null ) {
            stockInItemDTO.setProductsId( id );
        }
        String companyName = stockInItemVendorCompanyName( stockInItem );
        if ( companyName != null ) {
            stockInItemDTO.setVendorCompanyName( companyName );
        }
        Long id1 = stockInItemVendorId( stockInItem );
        if ( id1 != null ) {
            stockInItemDTO.setVendorId( id1 );
        }
        String name = stockInItemInventoryLocationsName( stockInItem );
        if ( name != null ) {
            stockInItemDTO.setInventoryLocationsName( name );
        }
        String requisitionNo = stockInItemRequisitionsRequisitionNo( stockInItem );
        if ( requisitionNo != null ) {
            stockInItemDTO.setRequisitionsRequisitionNo( requisitionNo );
        }
        String name1 = stockInItemProductCategoriesName( stockInItem );
        if ( name1 != null ) {
            stockInItemDTO.setProductCategoriesName( name1 );
        }
        Long id2 = stockInItemProductCategoriesId( stockInItem );
        if ( id2 != null ) {
            stockInItemDTO.setProductCategoriesId( id2 );
        }
        String name2 = stockInItemProductsName( stockInItem );
        if ( name2 != null ) {
            stockInItemDTO.setProductsName( name2 );
        }
        String name3 = stockInItemInventorySubLocationsName( stockInItem );
        if ( name3 != null ) {
            stockInItemDTO.setInventorySubLocationsName( name3 );
        }
        Long id3 = stockInItemInventoryLocationsId( stockInItem );
        if ( id3 != null ) {
            stockInItemDTO.setInventoryLocationsId( id3 );
        }
        Long id4 = stockInItemInventorySubLocationsId( stockInItem );
        if ( id4 != null ) {
            stockInItemDTO.setInventorySubLocationsId( id4 );
        }
        Long id5 = stockInItemStockInProcessesId( stockInItem );
        if ( id5 != null ) {
            stockInItemDTO.setStockInProcessesId( id5 );
        }
        Long id6 = stockInItemRequisitionsId( stockInItem );
        if ( id6 != null ) {
            stockInItemDTO.setRequisitionsId( id6 );
        }
        stockInItemDTO.setId( stockInItem.getId() );
        stockInItemDTO.setQuantity( stockInItem.getQuantity() );
        stockInItemDTO.setUnit( stockInItem.getUnit() );
        stockInItemDTO.setPrice( stockInItem.getPrice() );
        stockInItemDTO.setContainerCategory( stockInItem.getContainerCategory() );
        stockInItemDTO.setContainerTrackingId( stockInItem.getContainerTrackingId() );
        stockInItemDTO.setMfgDate( stockInItem.getMfgDate() );
        stockInItemDTO.setExpiryDate( stockInItem.getExpiryDate() );
        stockInItemDTO.setTypeOfProduct( stockInItem.getTypeOfProduct() );
        stockInItemDTO.setStockInBy( stockInItem.getStockInBy() );
        stockInItemDTO.setStockInDate( stockInItem.getStockInDate() );
        stockInItemDTO.setRemarks( stockInItem.getRemarks() );

        return stockInItemDTO;
    }

    @Override
    public StockInItem toEntity(StockInItemDTO stockInItemDTO) {
        if ( stockInItemDTO == null ) {
            return null;
        }

        StockInItem stockInItem = new StockInItem();

        stockInItem.setProductCategories( productCategoryMapper.fromId( stockInItemDTO.getProductCategoriesId() ) );
        stockInItem.setInventorySubLocations( inventorySubLocationMapper.fromId( stockInItemDTO.getInventorySubLocationsId() ) );
        stockInItem.setInventoryLocations( inventoryLocationMapper.fromId( stockInItemDTO.getInventoryLocationsId() ) );
        stockInItem.setVendor( vendorMapper.fromId( stockInItemDTO.getVendorId() ) );
        stockInItem.setRequisitions( requisitionMapper.fromId( stockInItemDTO.getRequisitionsId() ) );
        stockInItem.setStockInProcesses( stockInProcessMapper.fromId( stockInItemDTO.getStockInProcessesId() ) );
        stockInItem.setProducts( productMapper.fromId( stockInItemDTO.getProductsId() ) );
        stockInItem.setId( stockInItemDTO.getId() );
        stockInItem.setQuantity( stockInItemDTO.getQuantity() );
        stockInItem.setUnit( stockInItemDTO.getUnit() );
        stockInItem.setPrice( stockInItemDTO.getPrice() );
        stockInItem.setContainerCategory( stockInItemDTO.getContainerCategory() );
        stockInItem.setContainerTrackingId( stockInItemDTO.getContainerTrackingId() );
        stockInItem.setMfgDate( stockInItemDTO.getMfgDate() );
        stockInItem.setExpiryDate( stockInItemDTO.getExpiryDate() );
        stockInItem.setTypeOfProduct( stockInItemDTO.getTypeOfProduct() );
        stockInItem.setStockInBy( stockInItemDTO.getStockInBy() );
        stockInItem.setStockInDate( stockInItemDTO.getStockInDate() );
        stockInItem.setRemarks( stockInItemDTO.getRemarks() );

        return stockInItem;
    }

    private Long stockInItemProductsId(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        Product products = stockInItem.getProducts();
        if ( products == null ) {
            return null;
        }
        Long id = products.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockInItemVendorCompanyName(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        Vendor vendor = stockInItem.getVendor();
        if ( vendor == null ) {
            return null;
        }
        String companyName = vendor.getCompanyName();
        if ( companyName == null ) {
            return null;
        }
        return companyName;
    }

    private Long stockInItemVendorId(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        Vendor vendor = stockInItem.getVendor();
        if ( vendor == null ) {
            return null;
        }
        Long id = vendor.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockInItemInventoryLocationsName(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        InventoryLocation inventoryLocations = stockInItem.getInventoryLocations();
        if ( inventoryLocations == null ) {
            return null;
        }
        String name = inventoryLocations.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String stockInItemRequisitionsRequisitionNo(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        Requisition requisitions = stockInItem.getRequisitions();
        if ( requisitions == null ) {
            return null;
        }
        String requisitionNo = requisitions.getRequisitionNo();
        if ( requisitionNo == null ) {
            return null;
        }
        return requisitionNo;
    }

    private String stockInItemProductCategoriesName(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        ProductCategory productCategories = stockInItem.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        String name = productCategories.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockInItemProductCategoriesId(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        ProductCategory productCategories = stockInItem.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        Long id = productCategories.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockInItemProductsName(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        Product products = stockInItem.getProducts();
        if ( products == null ) {
            return null;
        }
        String name = products.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String stockInItemInventorySubLocationsName(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        InventorySubLocation inventorySubLocations = stockInItem.getInventorySubLocations();
        if ( inventorySubLocations == null ) {
            return null;
        }
        String name = inventorySubLocations.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockInItemInventoryLocationsId(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        InventoryLocation inventoryLocations = stockInItem.getInventoryLocations();
        if ( inventoryLocations == null ) {
            return null;
        }
        Long id = inventoryLocations.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long stockInItemInventorySubLocationsId(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        InventorySubLocation inventorySubLocations = stockInItem.getInventorySubLocations();
        if ( inventorySubLocations == null ) {
            return null;
        }
        Long id = inventorySubLocations.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long stockInItemStockInProcessesId(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        StockInProcess stockInProcesses = stockInItem.getStockInProcesses();
        if ( stockInProcesses == null ) {
            return null;
        }
        Long id = stockInProcesses.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long stockInItemRequisitionsId(StockInItem stockInItem) {
        if ( stockInItem == null ) {
            return null;
        }
        Requisition requisitions = stockInItem.getRequisitions();
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
