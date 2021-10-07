package org.soptorshi.domain;

import java.time.Instant;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Attendance.class)
public abstract class Attendance_ {

	public static volatile SingularAttribute<Attendance, Instant> inTime;
	public static volatile SingularAttribute<Attendance, String> duration;
	public static volatile SingularAttribute<Attendance, AttendanceExcelUpload> attendanceExcelUpload;
	public static volatile SingularAttribute<Attendance, String> updatedBy;
	public static volatile SingularAttribute<Attendance, String> createdBy;
	public static volatile SingularAttribute<Attendance, Long> id;
	public static volatile SingularAttribute<Attendance, Instant> updatedOn;
	public static volatile SingularAttribute<Attendance, Employee> employee;
	public static volatile SingularAttribute<Attendance, LocalDate> attendanceDate;
	public static volatile SingularAttribute<Attendance, Instant> createdOn;
	public static volatile SingularAttribute<Attendance, Instant> outTime;
	public static volatile SingularAttribute<Attendance, String> remarks;

}

