package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.InventoryLocation;
import org.soptorshi.domain.InventorySubLocation;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.domain.StockInItem;
import org.soptorshi.domain.StockStatus;
import org.soptorshi.service.dto.StockStatusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class StockStatusMapperImpl implements StockStatusMapper {

    @Autowired
    private StockInItemMapper stockInItemMapper;
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private InventoryLocationMapper inventoryLocationMapper;
    @Autowired
    private InventorySubLocationMapper inventorySubLocationMapper;

    @Override
    public List<StockStatus> toEntity(List<StockStatusDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<StockStatus> list = new ArrayList<StockStatus>( dtoList.size() );
        for ( StockStatusDTO stockStatusDTO : dtoList ) {
            list.add( toEntity( stockStatusDTO ) );
        }

        return list;
    }

    @Override
    public List<StockStatusDTO> toDto(List<StockStatus> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<StockStatusDTO> list = new ArrayList<StockStatusDTO>( entityList.size() );
        for ( StockStatus stockStatus : entityList ) {
            list.add( toDto( stockStatus ) );
        }

        return list;
    }

    @Override
    public StockStatusDTO toDto(StockStatus stockStatus) {
        if ( stockStatus == null ) {
            return null;
        }

        StockStatusDTO stockStatusDTO = new StockStatusDTO();

        String name = stockStatusInventorySubLocationsName( stockStatus );
        if ( name != null ) {
            stockStatusDTO.setInventorySubLocationsName( name );
        }
        Long id = stockStatusProductsId( stockStatus );
        if ( id != null ) {
            stockStatusDTO.setProductsId( id );
        }
        Long id1 = stockStatusStockInItemId( stockStatus );
        if ( id1 != null ) {
            stockStatusDTO.setStockInItemId( id1 );
        }
        String name1 = stockStatusInventoryLocationsName( stockStatus );
        if ( name1 != null ) {
            stockStatusDTO.setInventoryLocationsName( name1 );
        }
        String name2 = stockStatusProductCategoriesName( stockStatus );
        if ( name2 != null ) {
            stockStatusDTO.setProductCategoriesName( name2 );
        }
        Long id2 = stockStatusProductCategoriesId( stockStatus );
        if ( id2 != null ) {
            stockStatusDTO.setProductCategoriesId( id2 );
        }
        String name3 = stockStatusProductsName( stockStatus );
        if ( name3 != null ) {
            stockStatusDTO.setProductsName( name3 );
        }
        Long id3 = stockStatusInventoryLocationsId( stockStatus );
        if ( id3 != null ) {
            stockStatusDTO.setInventoryLocationsId( id3 );
        }
        Long id4 = stockStatusInventorySubLocationsId( stockStatus );
        if ( id4 != null ) {
            stockStatusDTO.setInventorySubLocationsId( id4 );
        }
        stockStatusDTO.setId( stockStatus.getId() );
        stockStatusDTO.setContainerTrackingId( stockStatus.getContainerTrackingId() );
        stockStatusDTO.setTotalQuantity( stockStatus.getTotalQuantity() );
        stockStatusDTO.setUnit( stockStatus.getUnit() );
        stockStatusDTO.setAvailableQuantity( stockStatus.getAvailableQuantity() );
        stockStatusDTO.setTotalPrice( stockStatus.getTotalPrice() );
        stockStatusDTO.setAvailablePrice( stockStatus.getAvailablePrice() );
        stockStatusDTO.setStockInBy( stockStatus.getStockInBy() );
        stockStatusDTO.setStockInDate( stockStatus.getStockInDate() );

        return stockStatusDTO;
    }

    @Override
    public StockStatus toEntity(StockStatusDTO stockStatusDTO) {
        if ( stockStatusDTO == null ) {
            return null;
        }

        StockStatus stockStatus = new StockStatus();

        stockStatus.setProductCategories( productCategoryMapper.fromId( stockStatusDTO.getProductCategoriesId() ) );
        stockStatus.setInventorySubLocations( inventorySubLocationMapper.fromId( stockStatusDTO.getInventorySubLocationsId() ) );
        stockStatus.setInventoryLocations( inventoryLocationMapper.fromId( stockStatusDTO.getInventoryLocationsId() ) );
        stockStatus.setStockInItem( stockInItemMapper.fromId( stockStatusDTO.getStockInItemId() ) );
        stockStatus.setProducts( productMapper.fromId( stockStatusDTO.getProductsId() ) );
        stockStatus.setId( stockStatusDTO.getId() );
        stockStatus.setContainerTrackingId( stockStatusDTO.getContainerTrackingId() );
        stockStatus.setTotalQuantity( stockStatusDTO.getTotalQuantity() );
        stockStatus.setUnit( stockStatusDTO.getUnit() );
        stockStatus.setAvailableQuantity( stockStatusDTO.getAvailableQuantity() );
        stockStatus.setTotalPrice( stockStatusDTO.getTotalPrice() );
        stockStatus.setAvailablePrice( stockStatusDTO.getAvailablePrice() );
        stockStatus.setStockInBy( stockStatusDTO.getStockInBy() );
        stockStatus.setStockInDate( stockStatusDTO.getStockInDate() );

        return stockStatus;
    }

    private String stockStatusInventorySubLocationsName(StockStatus stockStatus) {
        if ( stockStatus == null ) {
            return null;
        }
        InventorySubLocation inventorySubLocations = stockStatus.getInventorySubLocations();
        if ( inventorySubLocations == null ) {
            return null;
        }
        String name = inventorySubLocations.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockStatusProductsId(StockStatus stockStatus) {
        if ( stockStatus == null ) {
            return null;
        }
        Product products = stockStatus.getProducts();
        if ( products == null ) {
            return null;
        }
        Long id = products.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long stockStatusStockInItemId(StockStatus stockStatus) {
        if ( stockStatus == null ) {
            return null;
        }
        StockInItem stockInItem = stockStatus.getStockInItem();
        if ( stockInItem == null ) {
            return null;
        }
        Long id = stockInItem.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockStatusInventoryLocationsName(StockStatus stockStatus) {
        if ( stockStatus == null ) {
            return null;
        }
        InventoryLocation inventoryLocations = stockStatus.getInventoryLocations();
        if ( inventoryLocations == null ) {
            return null;
        }
        String name = inventoryLocations.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String stockStatusProductCategoriesName(StockStatus stockStatus) {
        if ( stockStatus == null ) {
            return null;
        }
        ProductCategory productCategories = stockStatus.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        String name = productCategories.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockStatusProductCategoriesId(StockStatus stockStatus) {
        if ( stockStatus == null ) {
            return null;
        }
        ProductCategory productCategories = stockStatus.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        Long id = productCategories.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockStatusProductsName(StockStatus stockStatus) {
        if ( stockStatus == null ) {
            return null;
        }
        Product products = stockStatus.getProducts();
        if ( products == null ) {
            return null;
        }
        String name = products.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockStatusInventoryLocationsId(StockStatus stockStatus) {
        if ( stockStatus == null ) {
            return null;
        }
        InventoryLocation inventoryLocations = stockStatus.getInventoryLocations();
        if ( inventoryLocations == null ) {
            return null;
        }
        Long id = inventoryLocations.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long stockStatusInventorySubLocationsId(StockStatus stockStatus) {
        if ( stockStatus == null ) {
            return null;
        }
        InventorySubLocation inventorySubLocations = stockStatus.getInventorySubLocations();
        if ( inventorySubLocations == null ) {
            return null;
        }
        Long id = inventorySubLocations.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
