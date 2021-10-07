package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.VendorRemarks;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Vendor.class)
public abstract class Vendor_ {

	public static volatile SingularAttribute<Vendor, String> address;
	public static volatile SingularAttribute<Vendor, String> companyName;
	public static volatile SingularAttribute<Vendor, String> contactNumber;
	public static volatile SingularAttribute<Vendor, String> description;
	public static volatile SingularAttribute<Vendor, Long> id;
	public static volatile SingularAttribute<Vendor, VendorRemarks> remarks;

}

