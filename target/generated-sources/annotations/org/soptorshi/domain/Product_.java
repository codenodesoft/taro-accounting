package org.soptorshi.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.ProductStatus;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, LocalDate> modifiedOn;
	public static volatile SingularAttribute<Product, String> scientificName;
	public static volatile SingularAttribute<Product, String> name;
	public static volatile SingularAttribute<Product, String> description;
	public static volatile SingularAttribute<Product, String> modifiedBy;
	public static volatile SingularAttribute<Product, Long> id;
	public static volatile SingularAttribute<Product, String> countryOrOrigin;
	public static volatile SingularAttribute<Product, ProductStatus> status;
	public static volatile SingularAttribute<Product, ProductCategory> productCategory;

}

