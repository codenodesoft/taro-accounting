package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.CommercialBudget;
import org.soptorshi.domain.CommercialProductInfo;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.service.dto.CommercialProductInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class CommercialProductInfoMapperImpl implements CommercialProductInfoMapper {

    @Autowired
    private CommercialBudgetMapper commercialBudgetMapper;
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<CommercialProductInfo> toEntity(List<CommercialProductInfoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CommercialProductInfo> list = new ArrayList<CommercialProductInfo>( dtoList.size() );
        for ( CommercialProductInfoDTO commercialProductInfoDTO : dtoList ) {
            list.add( toEntity( commercialProductInfoDTO ) );
        }

        return list;
    }

    @Override
    public List<CommercialProductInfoDTO> toDto(List<CommercialProductInfo> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CommercialProductInfoDTO> list = new ArrayList<CommercialProductInfoDTO>( entityList.size() );
        for ( CommercialProductInfo commercialProductInfo : entityList ) {
            list.add( toDto( commercialProductInfo ) );
        }

        return list;
    }

    @Override
    public CommercialProductInfoDTO toDto(CommercialProductInfo commercialProductInfo) {
        if ( commercialProductInfo == null ) {
            return null;
        }

        CommercialProductInfoDTO commercialProductInfoDTO = new CommercialProductInfoDTO();

        Long id = commercialProductInfoProductsId( commercialProductInfo );
        if ( id != null ) {
            commercialProductInfoDTO.setProductsId( id );
        }
        Long id1 = commercialProductInfoCommercialBudgetId( commercialProductInfo );
        if ( id1 != null ) {
            commercialProductInfoDTO.setCommercialBudgetId( id1 );
        }
        String budgetNo = commercialProductInfoCommercialBudgetBudgetNo( commercialProductInfo );
        if ( budgetNo != null ) {
            commercialProductInfoDTO.setCommercialBudgetBudgetNo( budgetNo );
        }
        String name = commercialProductInfoProductCategoriesName( commercialProductInfo );
        if ( name != null ) {
            commercialProductInfoDTO.setProductCategoriesName( name );
        }
        Long id2 = commercialProductInfoProductCategoriesId( commercialProductInfo );
        if ( id2 != null ) {
            commercialProductInfoDTO.setProductCategoriesId( id2 );
        }
        String name1 = commercialProductInfoProductsName( commercialProductInfo );
        if ( name1 != null ) {
            commercialProductInfoDTO.setProductsName( name1 );
        }
        commercialProductInfoDTO.setId( commercialProductInfo.getId() );
        commercialProductInfoDTO.setTaskNo( commercialProductInfo.getTaskNo() );
        commercialProductInfoDTO.setProductSpecification( commercialProductInfo.getProductSpecification() );
        commercialProductInfoDTO.setSpSize( commercialProductInfo.getSpSize() );
        commercialProductInfoDTO.setOfferedQuantity( commercialProductInfo.getOfferedQuantity() );
        commercialProductInfoDTO.setOfferedUnit( commercialProductInfo.getOfferedUnit() );
        commercialProductInfoDTO.setOfferedUnitPrice( commercialProductInfo.getOfferedUnitPrice() );
        commercialProductInfoDTO.setOfferedTotalPrice( commercialProductInfo.getOfferedTotalPrice() );
        commercialProductInfoDTO.setSpGlazing( commercialProductInfo.getSpGlazing() );
        commercialProductInfoDTO.setSpSurfaceType( commercialProductInfo.getSpSurfaceType() );
        commercialProductInfoDTO.setSpOthersDescription( commercialProductInfo.getSpOthersDescription() );
        commercialProductInfoDTO.setSpSticker( commercialProductInfo.getSpSticker() );
        commercialProductInfoDTO.setSpLabel( commercialProductInfo.getSpLabel() );
        commercialProductInfoDTO.setSpQtyInPack( commercialProductInfo.getSpQtyInPack() );
        commercialProductInfoDTO.setSpQtyInMc( commercialProductInfo.getSpQtyInMc() );
        commercialProductInfoDTO.setIpColor( commercialProductInfo.getIpColor() );
        commercialProductInfoDTO.setIpSize( commercialProductInfo.getIpSize() );
        commercialProductInfoDTO.setIpSticker( commercialProductInfo.getIpSticker() );
        commercialProductInfoDTO.setIpLabel( commercialProductInfo.getIpLabel() );
        commercialProductInfoDTO.setIpQtyInMc( commercialProductInfo.getIpQtyInMc() );
        commercialProductInfoDTO.setIpCost( commercialProductInfo.getIpCost() );
        commercialProductInfoDTO.setMcColor( commercialProductInfo.getMcColor() );
        commercialProductInfoDTO.setMcPly( commercialProductInfo.getMcPly() );
        commercialProductInfoDTO.setMcSize( commercialProductInfo.getMcSize() );
        commercialProductInfoDTO.setMcSticker( commercialProductInfo.getMcSticker() );
        commercialProductInfoDTO.setMcLabel( commercialProductInfo.getMcLabel() );
        commercialProductInfoDTO.setMcCost( commercialProductInfo.getMcCost() );
        commercialProductInfoDTO.setCylColor( commercialProductInfo.getCylColor() );
        commercialProductInfoDTO.setCylSize( commercialProductInfo.getCylSize() );
        commercialProductInfoDTO.setCylQty( commercialProductInfo.getCylQty() );
        commercialProductInfoDTO.setCylCost( commercialProductInfo.getCylCost() );
        commercialProductInfoDTO.setBuyingQuantity( commercialProductInfo.getBuyingQuantity() );
        commercialProductInfoDTO.setBuyingUnit( commercialProductInfo.getBuyingUnit() );
        commercialProductInfoDTO.setBuyingUnitPrice( commercialProductInfo.getBuyingUnitPrice() );
        commercialProductInfoDTO.setBuyingPrice( commercialProductInfo.getBuyingPrice() );
        commercialProductInfoDTO.setBuyingTotalPrice( commercialProductInfo.getBuyingTotalPrice() );
        commercialProductInfoDTO.setCreatedBy( commercialProductInfo.getCreatedBy() );
        commercialProductInfoDTO.setCreatedOn( commercialProductInfo.getCreatedOn() );
        commercialProductInfoDTO.setUpdatedBy( commercialProductInfo.getUpdatedBy() );
        commercialProductInfoDTO.setUpdatedOn( commercialProductInfo.getUpdatedOn() );

        return commercialProductInfoDTO;
    }

    @Override
    public CommercialProductInfo toEntity(CommercialProductInfoDTO commercialProductInfoDTO) {
        if ( commercialProductInfoDTO == null ) {
            return null;
        }

        CommercialProductInfo commercialProductInfo = new CommercialProductInfo();

        commercialProductInfo.setProductCategories( productCategoryMapper.fromId( commercialProductInfoDTO.getProductCategoriesId() ) );
        commercialProductInfo.setCommercialBudget( commercialBudgetMapper.fromId( commercialProductInfoDTO.getCommercialBudgetId() ) );
        commercialProductInfo.setProducts( productMapper.fromId( commercialProductInfoDTO.getProductsId() ) );
        commercialProductInfo.setId( commercialProductInfoDTO.getId() );
        commercialProductInfo.setTaskNo( commercialProductInfoDTO.getTaskNo() );
        commercialProductInfo.setProductSpecification( commercialProductInfoDTO.getProductSpecification() );
        commercialProductInfo.setSpSize( commercialProductInfoDTO.getSpSize() );
        commercialProductInfo.setOfferedQuantity( commercialProductInfoDTO.getOfferedQuantity() );
        commercialProductInfo.setOfferedUnit( commercialProductInfoDTO.getOfferedUnit() );
        commercialProductInfo.setOfferedUnitPrice( commercialProductInfoDTO.getOfferedUnitPrice() );
        commercialProductInfo.setOfferedTotalPrice( commercialProductInfoDTO.getOfferedTotalPrice() );
        commercialProductInfo.setSpGlazing( commercialProductInfoDTO.getSpGlazing() );
        commercialProductInfo.setSpSurfaceType( commercialProductInfoDTO.getSpSurfaceType() );
        commercialProductInfo.setSpOthersDescription( commercialProductInfoDTO.getSpOthersDescription() );
        commercialProductInfo.setSpSticker( commercialProductInfoDTO.getSpSticker() );
        commercialProductInfo.setSpLabel( commercialProductInfoDTO.getSpLabel() );
        commercialProductInfo.setSpQtyInPack( commercialProductInfoDTO.getSpQtyInPack() );
        commercialProductInfo.setSpQtyInMc( commercialProductInfoDTO.getSpQtyInMc() );
        commercialProductInfo.setIpColor( commercialProductInfoDTO.getIpColor() );
        commercialProductInfo.setIpSize( commercialProductInfoDTO.getIpSize() );
        commercialProductInfo.setIpSticker( commercialProductInfoDTO.getIpSticker() );
        commercialProductInfo.setIpLabel( commercialProductInfoDTO.getIpLabel() );
        commercialProductInfo.setIpQtyInMc( commercialProductInfoDTO.getIpQtyInMc() );
        commercialProductInfo.setIpCost( commercialProductInfoDTO.getIpCost() );
        commercialProductInfo.setMcColor( commercialProductInfoDTO.getMcColor() );
        commercialProductInfo.setMcPly( commercialProductInfoDTO.getMcPly() );
        commercialProductInfo.setMcSize( commercialProductInfoDTO.getMcSize() );
        commercialProductInfo.setMcSticker( commercialProductInfoDTO.getMcSticker() );
        commercialProductInfo.setMcLabel( commercialProductInfoDTO.getMcLabel() );
        commercialProductInfo.setMcCost( commercialProductInfoDTO.getMcCost() );
        commercialProductInfo.setCylColor( commercialProductInfoDTO.getCylColor() );
        commercialProductInfo.setCylSize( commercialProductInfoDTO.getCylSize() );
        commercialProductInfo.setCylQty( commercialProductInfoDTO.getCylQty() );
        commercialProductInfo.setCylCost( commercialProductInfoDTO.getCylCost() );
        commercialProductInfo.setBuyingQuantity( commercialProductInfoDTO.getBuyingQuantity() );
        commercialProductInfo.setBuyingUnit( commercialProductInfoDTO.getBuyingUnit() );
        commercialProductInfo.setBuyingUnitPrice( commercialProductInfoDTO.getBuyingUnitPrice() );
        commercialProductInfo.setBuyingPrice( commercialProductInfoDTO.getBuyingPrice() );
        commercialProductInfo.setBuyingTotalPrice( commercialProductInfoDTO.getBuyingTotalPrice() );
        commercialProductInfo.setCreatedBy( commercialProductInfoDTO.getCreatedBy() );
        commercialProductInfo.setCreatedOn( commercialProductInfoDTO.getCreatedOn() );
        commercialProductInfo.setUpdatedBy( commercialProductInfoDTO.getUpdatedBy() );
        commercialProductInfo.setUpdatedOn( commercialProductInfoDTO.getUpdatedOn() );

        return commercialProductInfo;
    }

    private Long commercialProductInfoProductsId(CommercialProductInfo commercialProductInfo) {
        if ( commercialProductInfo == null ) {
            return null;
        }
        Product products = commercialProductInfo.getProducts();
        if ( products == null ) {
            return null;
        }
        Long id = products.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long commercialProductInfoCommercialBudgetId(CommercialProductInfo commercialProductInfo) {
        if ( commercialProductInfo == null ) {
            return null;
        }
        CommercialBudget commercialBudget = commercialProductInfo.getCommercialBudget();
        if ( commercialBudget == null ) {
            return null;
        }
        Long id = commercialBudget.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String commercialProductInfoCommercialBudgetBudgetNo(CommercialProductInfo commercialProductInfo) {
        if ( commercialProductInfo == null ) {
            return null;
        }
        CommercialBudget commercialBudget = commercialProductInfo.getCommercialBudget();
        if ( commercialBudget == null ) {
            return null;
        }
        String budgetNo = commercialBudget.getBudgetNo();
        if ( budgetNo == null ) {
            return null;
        }
        return budgetNo;
    }

    private String commercialProductInfoProductCategoriesName(CommercialProductInfo commercialProductInfo) {
        if ( commercialProductInfo == null ) {
            return null;
        }
        ProductCategory productCategories = commercialProductInfo.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        String name = productCategories.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long commercialProductInfoProductCategoriesId(CommercialProductInfo commercialProductInfo) {
        if ( commercialProductInfo == null ) {
            return null;
        }
        ProductCategory productCategories = commercialProductInfo.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        Long id = productCategories.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String commercialProductInfoProductsName(CommercialProductInfo commercialProductInfo) {
        if ( commercialProductInfo == null ) {
            return null;
        }
        Product products = commercialProductInfo.getProducts();
        if ( products == null ) {
            return null;
        }
        String name = products.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
