package com.hau.model;

import java.awt.Color;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;

public class LoHangPDFExporter {
    private List<LoHang> loHangs;

    public LoHangPDFExporter(List<LoHang> loHangs) {
        this.loHangs = loHangs;
    }

    private void writeTableHeader(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(5);

        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);

        cell.setPhrase(new Phrase("ID", font));

        table.addCell(cell);

        cell.setPhrase(new Phrase("Ma Lo Hang", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("San Pham", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("So Luong", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Ngay Nhap Hang", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Ngay San Xuat", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Ngay Het Han", font));
        table.addCell(cell);

    }

    private void writeTableData(PdfPTable table) {
        for (LoHang loHang : loHangs) {
            table.addCell(String.valueOf(loHang.getId()));
            table.addCell(loHang.getMaLoHang());
            table.addCell(loHang.getSanPham().toString());
            table.addCell(loHang.getSoLuong().toString());
            table.addCell(loHang.getNgayNhapHang());
            table.addCell(loHang.getNgaySanXuat());
            table.addCell(loHang.getNgayHetHan());
        }
    }

    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.BLUE);

        Paragraph p = new Paragraph("List of LoHangs", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);

        document.add(p);

        PdfPTable table = new PdfPTable(7);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {2f, 2f, 2f, 2f, 2f, 2f, 2f});
        table.setSpacingBefore(10);

        writeTableHeader(table);
        writeTableData(table);

        document.add(table);

        document.close();
    }
}
