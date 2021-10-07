package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.InventoryLocation;
import org.soptorshi.domain.InventorySubLocation;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.domain.StockInItem;
import org.soptorshi.domain.StockOutItem;
import org.soptorshi.service.dto.StockOutItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class StockOutItemMapperImpl implements StockOutItemMapper {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private InventoryLocationMapper inventoryLocationMapper;
    @Autowired
    private InventorySubLocationMapper inventorySubLocationMapper;
    @Autowired
    private StockInItemMapper stockInItemMapper;

    @Override
    public List<StockOutItem> toEntity(List<StockOutItemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<StockOutItem> list = new ArrayList<StockOutItem>( dtoList.size() );
        for ( StockOutItemDTO stockOutItemDTO : dtoList ) {
            list.add( toEntity( stockOutItemDTO ) );
        }

        return list;
    }

    @Override
    public List<StockOutItemDTO> toDto(List<StockOutItem> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<StockOutItemDTO> list = new ArrayList<StockOutItemDTO>( entityList.size() );
        for ( StockOutItem stockOutItem : entityList ) {
            list.add( toDto( stockOutItem ) );
        }

        return list;
    }

    @Override
    public StockOutItemDTO toDto(StockOutItem stockOutItem) {
        if ( stockOutItem == null ) {
            return null;
        }

        StockOutItemDTO stockOutItemDTO = new StockOutItemDTO();

        String name = stockOutItemInventorySubLocationsName( stockOutItem );
        if ( name != null ) {
            stockOutItemDTO.setInventorySubLocationsName( name );
        }
        Long id = stockOutItemProductsId( stockOutItem );
        if ( id != null ) {
            stockOutItemDTO.setProductsId( id );
        }
        String name1 = stockOutItemInventoryLocationsName( stockOutItem );
        if ( name1 != null ) {
            stockOutItemDTO.setInventoryLocationsName( name1 );
        }
        Long id1 = stockOutItemStockInItemsId( stockOutItem );
        if ( id1 != null ) {
            stockOutItemDTO.setStockInItemsId( id1 );
        }
        String name2 = stockOutItemProductCategoriesName( stockOutItem );
        if ( name2 != null ) {
            stockOutItemDTO.setProductCategoriesName( name2 );
        }
        Long id2 = stockOutItemProductCategoriesId( stockOutItem );
        if ( id2 != null ) {
            stockOutItemDTO.setProductCategoriesId( id2 );
        }
        String name3 = stockOutItemProductsName( stockOutItem );
        if ( name3 != null ) {
            stockOutItemDTO.setProductsName( name3 );
        }
        Long id3 = stockOutItemInventoryLocationsId( stockOutItem );
        if ( id3 != null ) {
            stockOutItemDTO.setInventoryLocationsId( id3 );
        }
        Long id4 = stockOutItemInventorySubLocationsId( stockOutItem );
        if ( id4 != null ) {
            stockOutItemDTO.setInventorySubLocationsId( id4 );
        }
        stockOutItemDTO.setId( stockOutItem.getId() );
        stockOutItemDTO.setContainerTrackingId( stockOutItem.getContainerTrackingId() );
        stockOutItemDTO.setQuantity( stockOutItem.getQuantity() );
        stockOutItemDTO.setStockOutBy( stockOutItem.getStockOutBy() );
        stockOutItemDTO.setStockOutDate( stockOutItem.getStockOutDate() );
        stockOutItemDTO.setReceiverId( stockOutItem.getReceiverId() );
        stockOutItemDTO.setReceivingPlace( stockOutItem.getReceivingPlace() );
        stockOutItemDTO.setRemarks( stockOutItem.getRemarks() );

        return stockOutItemDTO;
    }

    @Override
    public StockOutItem toEntity(StockOutItemDTO stockOutItemDTO) {
        if ( stockOutItemDTO == null ) {
            return null;
        }

        StockOutItem stockOutItem = new StockOutItem();

        stockOutItem.setProductCategories( productCategoryMapper.fromId( stockOutItemDTO.getProductCategoriesId() ) );
        stockOutItem.setInventorySubLocations( inventorySubLocationMapper.fromId( stockOutItemDTO.getInventorySubLocationsId() ) );
        stockOutItem.setStockInItems( stockInItemMapper.fromId( stockOutItemDTO.getStockInItemsId() ) );
        stockOutItem.setInventoryLocations( inventoryLocationMapper.fromId( stockOutItemDTO.getInventoryLocationsId() ) );
        stockOutItem.setProducts( productMapper.fromId( stockOutItemDTO.getProductsId() ) );
        stockOutItem.setId( stockOutItemDTO.getId() );
        stockOutItem.setContainerTrackingId( stockOutItemDTO.getContainerTrackingId() );
        stockOutItem.setQuantity( stockOutItemDTO.getQuantity() );
        stockOutItem.setStockOutBy( stockOutItemDTO.getStockOutBy() );
        stockOutItem.setStockOutDate( stockOutItemDTO.getStockOutDate() );
        stockOutItem.setReceiverId( stockOutItemDTO.getReceiverId() );
        stockOutItem.setReceivingPlace( stockOutItemDTO.getReceivingPlace() );
        stockOutItem.setRemarks( stockOutItemDTO.getRemarks() );

        return stockOutItem;
    }

    private String stockOutItemInventorySubLocationsName(StockOutItem stockOutItem) {
        if ( stockOutItem == null ) {
            return null;
        }
        InventorySubLocation inventorySubLocations = stockOutItem.getInventorySubLocations();
        if ( inventorySubLocations == null ) {
            return null;
        }
        String name = inventorySubLocations.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockOutItemProductsId(StockOutItem stockOutItem) {
        if ( stockOutItem == null ) {
            return null;
        }
        Product products = stockOutItem.getProducts();
        if ( products == null ) {
            return null;
        }
        Long id = products.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockOutItemInventoryLocationsName(StockOutItem stockOutItem) {
        if ( stockOutItem == null ) {
            return null;
        }
        InventoryLocation inventoryLocations = stockOutItem.getInventoryLocations();
        if ( inventoryLocations == null ) {
            return null;
        }
        String name = inventoryLocations.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockOutItemStockInItemsId(StockOutItem stockOutItem) {
        if ( stockOutItem == null ) {
            return null;
        }
        StockInItem stockInItems = stockOutItem.getStockInItems();
        if ( stockInItems == null ) {
            return null;
        }
        Long id = stockInItems.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockOutItemProductCategoriesName(StockOutItem stockOutItem) {
        if ( stockOutItem == null ) {
            return null;
        }
        ProductCategory productCategories = stockOutItem.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        String name = productCategories.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockOutItemProductCategoriesId(StockOutItem stockOutItem) {
        if ( stockOutItem == null ) {
            return null;
        }
        ProductCategory productCategories = stockOutItem.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        Long id = productCategories.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String stockOutItemProductsName(StockOutItem stockOutItem) {
        if ( stockOutItem == null ) {
            return null;
        }
        Product products = stockOutItem.getProducts();
        if ( products == null ) {
            return null;
        }
        String name = products.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long stockOutItemInventoryLocationsId(StockOutItem stockOutItem) {
        if ( stockOutItem == null ) {
            return null;
        }
        InventoryLocation inventoryLocations = stockOutItem.getInventoryLocations();
        if ( inventoryLocations == null ) {
            return null;
        }
        Long id = inventoryLocations.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long stockOutItemInventorySubLocationsId(StockOutItem stockOutItem) {
        if ( stockOutItem == null ) {
            return null;
        }
        InventorySubLocation inventorySubLocations = stockOutItem.getInventorySubLocations();
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
