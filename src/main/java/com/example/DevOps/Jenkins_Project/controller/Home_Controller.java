package com.example.DevOps.Jenkins_Project.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@RestController
public class Home_Controller {
	
	@GetMapping
	public String HomePage() throws DocumentException, FileNotFoundException {
		LocalDateTime date_time=LocalDateTime.now();
		return "Hi Faiyaz,\n Date & Time  "+date_time;
	}
	
	@GetMapping("/getpdf")
	public void HomePage1() throws FileNotFoundException, DocumentException {
		Document document = new Document(); 
       PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Itext_table_example.pdf"));
       document.open();
       
       
       
       PdfPTable table1=new PdfPTable(7);  
       int[] table1columnWidths = {200,50,50,20,60,30,20};
       table1.setWidths(table1columnWidths);
       table1.setWidthPercentage(100); //Width 
       table1.setSpacingBefore(30f); //Space before table
       table1.setSpacingAfter(30f); //Space after table

       table1.addCell("table1_column1");
       table1.addCell("table1_column2");
       table1.addCell("table1_column3");
       table1.addCell("table1_column4");
       table1.addCell("table1_column5");
       PdfPCell cell1 = new PdfPCell();
       cell1.setBorder(0);
       PdfPCell cell2 = new PdfPCell();
       cell2.setBorder(0);
       table1.addCell(cell1);
       table1.addCell(cell2);
       
       PdfPTable table2=new PdfPTable(7);
       int[] table2columnWidths = {200,50,50,20,60,30,20};
       table2.setWidths(table2columnWidths);
       table2.setSpacingBefore(30f); //Space before table
       table2.setWidthPercentage(100); //Width 

       
       table2.addCell("table2_column1");
       table2.addCell("table2_column2");
       table2.addCell("table2_column3");
       table2.addCell("table2_column4");
       table2.addCell("table2_column5");
       table2.addCell("table2_column6");
       table2.addCell("table2_column7");
       
       document.add(new Paragraph("  table1 with 5 column..............................................................."));
       document.add(table1);
       
       document.add(new Paragraph("  table2 with 7 column............................................................"));
       document.add(table2);
       document.close();
       writer.close();
	}
	
	

}
