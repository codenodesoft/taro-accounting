package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.AttendanceExcelUpload;
import org.soptorshi.service.dto.AttendanceExcelUploadDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class AttendanceExcelUploadMapperImpl implements AttendanceExcelUploadMapper {

    @Override
    public AttendanceExcelUploadDTO toDto(AttendanceExcelUpload entity) {
        if ( entity == null ) {
            return null;
        }

        AttendanceExcelUploadDTO attendanceExcelUploadDTO = new AttendanceExcelUploadDTO();

        attendanceExcelUploadDTO.setId( entity.getId() );
        byte[] file = entity.getFile();
        if ( file != null ) {
            attendanceExcelUploadDTO.setFile( Arrays.copyOf( file, file.length ) );
        }
        attendanceExcelUploadDTO.setFileContentType( entity.getFileContentType() );
        attendanceExcelUploadDTO.setType( entity.getType() );
        attendanceExcelUploadDTO.setCreatedBy( entity.getCreatedBy() );
        attendanceExcelUploadDTO.setCreatedOn( entity.getCreatedOn() );
        attendanceExcelUploadDTO.setUpdatedBy( entity.getUpdatedBy() );
        attendanceExcelUploadDTO.setUpdatedOn( entity.getUpdatedOn() );

        return attendanceExcelUploadDTO;
    }

    @Override
    public List<AttendanceExcelUpload> toEntity(List<AttendanceExcelUploadDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttendanceExcelUpload> list = new ArrayList<AttendanceExcelUpload>( dtoList.size() );
        for ( AttendanceExcelUploadDTO attendanceExcelUploadDTO : dtoList ) {
            list.add( toEntity( attendanceExcelUploadDTO ) );
        }

        return list;
    }

    @Override
    public List<AttendanceExcelUploadDTO> toDto(List<AttendanceExcelUpload> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttendanceExcelUploadDTO> list = new ArrayList<AttendanceExcelUploadDTO>( entityList.size() );
        for ( AttendanceExcelUpload attendanceExcelUpload : entityList ) {
            list.add( toDto( attendanceExcelUpload ) );
        }

        return list;
    }

    @Override
    public AttendanceExcelUpload toEntity(AttendanceExcelUploadDTO attendanceExcelUploadDTO) {
        if ( attendanceExcelUploadDTO == null ) {
            return null;
        }

        AttendanceExcelUpload attendanceExcelUpload = new AttendanceExcelUpload();

        attendanceExcelUpload.setId( attendanceExcelUploadDTO.getId() );
        byte[] file = attendanceExcelUploadDTO.getFile();
        if ( file != null ) {
            attendanceExcelUpload.setFile( Arrays.copyOf( file, file.length ) );
        }
        attendanceExcelUpload.setFileContentType( attendanceExcelUploadDTO.getFileContentType() );
        attendanceExcelUpload.setType( attendanceExcelUploadDTO.getType() );
        attendanceExcelUpload.setCreatedBy( attendanceExcelUploadDTO.getCreatedBy() );
        attendanceExcelUpload.setCreatedOn( attendanceExcelUploadDTO.getCreatedOn() );
        attendanceExcelUpload.setUpdatedBy( attendanceExcelUploadDTO.getUpdatedBy() );
        attendanceExcelUpload.setUpdatedOn( attendanceExcelUploadDTO.getUpdatedOn() );

        return attendanceExcelUpload;
    }
}
