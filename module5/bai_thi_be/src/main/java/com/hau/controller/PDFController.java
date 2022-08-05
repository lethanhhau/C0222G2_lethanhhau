package com.hau.controller;

import com.hau.model.LoHang;
import com.hau.model.LoHangPDFExporter;
import com.hau.model.SanPham;
import com.hau.service.ILoHangService;
import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RequestMapping("/rest/pdf")
@RestController
@CrossOrigin
public class PDFController {

    @Autowired
    private ILoHangService iLoHangService;

    @GetMapping("/export/pdf")
    public ResponseEntity<List<LoHang>> getAllPDF(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=loHangs_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);

        List<LoHang> loHangs = iLoHangService.findAllPDF();

        LoHangPDFExporter exporter = new LoHangPDFExporter(loHangs);
        exporter.export(response);

        return new ResponseEntity<>(loHangs, HttpStatus.OK);
    }
}
