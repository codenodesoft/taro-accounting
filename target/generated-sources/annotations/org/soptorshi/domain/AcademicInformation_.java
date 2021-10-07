package org.soptorshi.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AcademicInformation.class)
public abstract class AcademicInformation_ {

	public static volatile SingularAttribute<AcademicInformation, Integer> passingYear;
	public static volatile SingularAttribute<AcademicInformation, String> boardOrUniversity;
	public static volatile SingularAttribute<AcademicInformation, String> degree;
	public static volatile SingularAttribute<AcademicInformation, Long> id;
	public static volatile SingularAttribute<AcademicInformation, Employee> employee;
	public static volatile SingularAttribute<AcademicInformation, String> group;

}

