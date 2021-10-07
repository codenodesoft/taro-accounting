package org.soptorshi.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProductPrice.class)
public abstract class ProductPrice_ {

	public static volatile SingularAttribute<ProductPrice, LocalDate> modifiedOn;
	public static volatile SingularAttribute<ProductPrice, Product> product;
	public static volatile SingularAttribute<ProductPrice, LocalDate> priceDate;
	public static volatile SingularAttribute<ProductPrice, BigDecimal> price;
	public static volatile SingularAttribute<ProductPrice, String> modifiedBy;
	public static volatile SingularAttribute<ProductPrice, Long> id;

}

