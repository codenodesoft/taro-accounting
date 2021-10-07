package org.soptorshi.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.soptorshi.domain.enumeration.AttendanceType;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AttendanceExcelUpload.class)
public abstract class AttendanceExcelUpload_ {

	public static volatile SingularAttribute<AttendanceExcelUpload, byte[]> file;
	public static volatile SingularAttribute<AttendanceExcelUpload, String> updatedBy;
	public static volatile SingularAttribute<AttendanceExcelUpload, String> createdBy;
	public static volatile SingularAttribute<AttendanceExcelUpload, Long> id;
	public static volatile SingularAttribute<AttendanceExcelUpload, Instant> updatedOn;
	public static volatile SingularAttribute<AttendanceExcelUpload, AttendanceType> type;
	public static volatile SingularAttribute<AttendanceExcelUpload, Instant> createdOn;
	public static volatile SingularAttribute<AttendanceExcelUpload, String> fileContentType;
	public static volatile SetAttribute<AttendanceExcelUpload, Attendance> attendances;

}

