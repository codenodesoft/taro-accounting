package org.soptorshi.service.extended;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.soptorshi.domain.Employee;
import org.soptorshi.domain.OverTime;
import org.soptorshi.repository.extended.EmployeeExtendedRepository;
import org.soptorshi.security.SecurityUtils;
import org.soptorshi.utils.SoptorshiUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.*;

import static java.util.stream.Collectors.groupingBy;

@Service
@Transactional
public class OverTimeReportService {

    private final Logger log = LoggerFactory.getLogger(OverTimeReportService.class);

    private final OverTimeExtendedService overTimeExtendedService;

    private final EmployeeExtendedRepository employeeExtendedRepository;

    public static Font mBoldFont = new Font(Font.FontFamily.TIMES_ROMAN, 10f, Font.BOLD, BaseColor.BLACK);

    static Font TIME_ROMAN_11 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 11);
    static Font TIMES_BOLD_11 = FontFactory.getFont(FontFactory.TIMES_BOLD, 11);
    static Font TIME_ROMAN_12 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12);
    static Font TIME_BOLD_12 = FontFactory.getFont(FontFactory.TIMES_BOLD, 12);
    static Font TIMES_BOLD_14 = FontFactory.getFont(FontFactory.TIMES_BOLD, 14);

    public OverTimeReportService(OverTimeExtendedService overTimeExtendedService, EmployeeExtendedRepository employeeExtendedRepository) {
        this.overTimeExtendedService = overTimeExtendedService;
        this.employeeExtendedRepository = employeeExtendedRepository;
    }

    public ByteArrayInputStream getOverTimes(LocalDate from, LocalDate to, String employeeId) throws DocumentException {
        Document document = new Document();
        document.setPageSize(PageSize.A4);
        document.setMargins(20, 20, 40, 40);
        document.addTitle("OverTimes");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfWriter writer = PdfWriter.getInstance(document, baos);
        writer.setPageEvent(new headerAndFooter());
        document.open();

        Chunk chunk = null;
        Paragraph paragraph = null;
        PdfPTable pdfPTable = null;
        PdfPCell pdfPCell = null;

        paragraph = new Paragraph(new Chunk("Codenode Software Technology Limited.", SoptorshiUtils.mBigBoldFont));
        paragraph.setAlignment(Element.ALIGN_CENTER);
        document.add(paragraph);
        document.add(Chunk.NEWLINE);

        paragraph = new Paragraph(new Chunk("Over-Times", TIMES_BOLD_11));
        paragraph.setAlignment(Element.ALIGN_CENTER);
        document.add(paragraph);

        paragraph = new Paragraph();
        lineBreak(paragraph, 1);
        document.add(paragraph);

        paragraph = new Paragraph(new Chunk("From-To: " + from.format(DateTimeFormatter.ofPattern("dd MMMM, yyyy")) + " to " + to.format(DateTimeFormatter.ofPattern("dd MMMM, yyyy")), TIMES_BOLD_11));
        document.add(paragraph);

        paragraph = new Paragraph();
        lineBreak(paragraph, 1);
        document.add(paragraph);

        Optional<Employee> employee = employeeExtendedRepository.findByEmployeeId(employeeId);

        if (employee.isPresent()) {
            List<OverTime> overTimes = overTimeExtendedService.getOverTimes(from, to, employee.get());
            createOverTimeTable(document, overTimes, employee.get());
        }
        else {
            paragraph = new Paragraph(new Chunk("No records found.", TIME_ROMAN_11));
            document.add(paragraph);
        }

        document.close();
        return new ByteArrayInputStream(baos.toByteArray());
    }

    public ByteArrayInputStream getOverTimes(LocalDate from, LocalDate to) throws DocumentException {
        Document document = new Document();
        document.setPageSize(PageSize.A4);
        document.setMargins(20, 20, 40, 40);
        document.addTitle("OverTimes");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfWriter writer = PdfWriter.getInstance(document, baos);
        writer.setPageEvent(new headerAndFooter());
        document.open();

        Chunk chunk = null;
        Paragraph paragraph = null;
        PdfPTable pdfPTable = null;
        PdfPCell pdfPCell = null;

        paragraph = new Paragraph(new Chunk("Codenode Software Technology Limited.", SoptorshiUtils.mBigBoldFont));
        paragraph.setAlignment(Element.ALIGN_CENTER);
        document.add(paragraph);
        document.add(Chunk.NEWLINE);

        paragraph = new Paragraph(new Chunk("Over-Times", TIMES_BOLD_11));
        paragraph.setAlignment(Element.ALIGN_CENTER);
        document.add(paragraph);

        paragraph = new Paragraph();
        lineBreak(paragraph, 1);
        document.add(paragraph);

        paragraph = new Paragraph(new Chunk("From-To: " + from.format(DateTimeFormatter.ofPattern("dd MMMM, yyyy")) + " to " + to.format(DateTimeFormatter.ofPattern("dd MMMM, yyyy")), TIMES_BOLD_11));
        document.add(paragraph);

        paragraph = new Paragraph();
        lineBreak(paragraph, 1);
        document.add(paragraph);

        List<OverTime> overTimes = overTimeExtendedService.getOverTimes(from, to);

        if (overTimes.size() > 0) {
            Map<Employee, List<OverTime>> listMap = overTimes.stream()
                .collect(groupingBy(OverTime::getEmployee));
            int len = listMap.size();
            int i = 0;
            for(Map.Entry<Employee, List<OverTime>> map: listMap.entrySet()) {
                i++;
                createOverTimeTable(document, map.getValue(), map.getKey());

                if(i < len) {
                    document.newPage();
                }
            }
        }
        else {
            paragraph = new Paragraph(new Chunk("No records found.", TIME_ROMAN_11));
            document.add(paragraph);
        }

        document.close();
        return new ByteArrayInputStream(baos.toByteArray());
    }

    public ByteArrayInputStream getOverTimes(String employeeId) throws DocumentException {
        Document document = new Document();
        document.setPageSize(PageSize.A4);
        document.setMargins(20, 20, 40, 40);
        document.addTitle("OverTimes");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfWriter writer = PdfWriter.getInstance(document, baos);
        writer.setPageEvent(new headerAndFooter());
        document.open();

        Chunk chunk = null;
        Paragraph paragraph = null;
        PdfPTable pdfPTable = null;
        PdfPCell pdfPCell = null;

        paragraph = new Paragraph(new Chunk("Codenode Software Technology Limited.", SoptorshiUtils.mBigBoldFont));
        paragraph.setAlignment(Element.ALIGN_CENTER);
        document.add(paragraph);
        document.add(Chunk.NEWLINE);

        paragraph = new Paragraph(new Chunk("Over-Times", TIMES_BOLD_11));
        paragraph.setAlignment(Element.ALIGN_CENTER);
        document.add(paragraph);

        paragraph = new Paragraph();
        lineBreak(paragraph, 1);
        document.add(paragraph);

        Optional<Employee> employee = employeeExtendedRepository.findByEmployeeId(employeeId);

        if (employee.isPresent()) {
            List<OverTime> overTimes = overTimeExtendedService.getOverTimes(employee.get());
            createOverTimeTable(document, overTimes, employee.get());
        }
        else {
            paragraph = new Paragraph(new Chunk("No records found.", TIME_ROMAN_11));
            document.add(paragraph);
        }

        document.close();
        return new ByteArrayInputStream(baos.toByteArray());
    }

    private void createOverTimeTable(Document document, List<OverTime> overTimes, Employee employee) throws DocumentException {
        PdfPTable pdfPTable;
        PdfPCell pdfPCell;

        Paragraph paragraph = new Paragraph(new Chunk("Employee: " + employee.getFullName() + " [" + employee.getEmployeeId() + "]", TIMES_BOLD_11));
        document.add(paragraph);

        paragraph = new Paragraph();
        lineBreak(paragraph, 1);
        document.add(paragraph);

        if (overTimes.size() > 0) {

            DateTimeFormatter formatter =
                DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                    .withLocale( Locale.getDefault() )
                    .withZone( ZoneId.systemDefault() );

            pdfPTable = new PdfPTable(5);
            pdfPTable.setWidthPercentage(100);
            pdfPTable.setTotalWidth(new float[]{10, 20, 25, 25, 20});

            pdfPCell = new PdfPCell(new Paragraph("#", TIMES_BOLD_11));
            pdfPCell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
            pdfPTable.addCell(pdfPCell);

            pdfPCell = new PdfPCell(new Paragraph("Date", TIMES_BOLD_11));
            pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
            pdfPTable.addCell(pdfPCell);

            pdfPCell = new PdfPCell(new Paragraph("From", TIMES_BOLD_11));
            pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
            pdfPTable.addCell(pdfPCell);

            pdfPCell = new PdfPCell(new Paragraph("To", TIMES_BOLD_11));
            pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
            pdfPTable.addCell(pdfPCell);

            pdfPCell = new PdfPCell(new Paragraph("Duration", TIMES_BOLD_11));
            pdfPCell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
            pdfPTable.addCell(pdfPCell);

            int counter = 0;

            for (OverTime overTime : overTimes) {
                counter = counter + 1;
                pdfPCell = new PdfPCell(new Paragraph(counter + "", TIME_ROMAN_11));
                pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
                pdfPCell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                pdfPTable.addCell(pdfPCell);

                pdfPCell = new PdfPCell(new Paragraph(overTime.getOverTimeDate().format(DateTimeFormatter.ofPattern("dd MMMM, yyyy")), TIME_ROMAN_11));
                pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
                pdfPTable.addCell(pdfPCell);

                pdfPCell = new PdfPCell(new Paragraph(overTime.getFromTime() == null ? "" : formatter.format(overTime.getFromTime()), TIME_ROMAN_11));
                pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
                pdfPTable.addCell(pdfPCell);

                pdfPCell = new PdfPCell(new Paragraph(overTime.getToTime() == null ? "" : formatter.format(overTime.getToTime()), TIME_ROMAN_11));
                pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
                pdfPTable.addCell(pdfPCell);

                pdfPCell = new PdfPCell(new Paragraph(overTime.getDuration() == null ? "" : overTime.getDuration(), TIME_ROMAN_11));
                pdfPCell.setVerticalAlignment(Element.ALIGN_CENTER);
                pdfPCell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                pdfPTable.addCell(pdfPCell);
            }
            document.add(pdfPTable);
        } else {
            paragraph = new Paragraph(new Chunk("No records found.", TIME_ROMAN_11));
            document.add(paragraph);
        }
    }

    static class headerAndFooter extends PdfPageEventHelper {

        @Override
        public void onStartPage(PdfWriter writer, Document document) {
            PdfContentByte cb = writer.getDirectContent();
            Font headerFont = new Font(Font.FontFamily.TIMES_ROMAN, 8.0f, Font.BOLDITALIC, BaseColor.GRAY);
            DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
            String loggedInUserId = SecurityUtils.getCurrentUserLogin().isPresent() ? SecurityUtils.getCurrentUserLogin().get() : "Anonymous";
            Paragraph header =
                new Paragraph("Generated by " + loggedInUserId + " on " + new SimpleDateFormat("dd MMMM, yyyy").format(new Date()) + " at "
                    + dateFormat.format(new Date()), headerFont);
            header.setAlignment(Element.ALIGN_RIGHT);
            ColumnText.showTextAligned(cb, Element.ALIGN_RIGHT, new Phrase(header),
                document.right() + 10, document.top() + 10, 0);
        }

        @Override
        public void onEndPage(PdfWriter writer, Document document) {
            PdfContentByte cb = writer.getDirectContent();
            String text = String.format("Page %s", writer.getCurrentPageNumber());
            Paragraph paragraph = new Paragraph(text, mBoldFont);
            ColumnText.showTextAligned(cb, Element.ALIGN_RIGHT, new Phrase(paragraph), (document.right() - document.left())
                / 2 + document.leftMargin(), document.bottom() - 10, 0);
        }

    }

    void lineBreak(Paragraph p, int number) {
        for (int i = 0; i < number; i++) {
            p.add(new Paragraph(" "));
        }
    }
}
