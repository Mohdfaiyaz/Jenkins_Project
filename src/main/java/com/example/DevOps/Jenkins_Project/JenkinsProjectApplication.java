package com.example.DevOps.Jenkins_Project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@SpringBootApplication
public class JenkinsProjectApplication {

	public static void main(String[] args) throws MalformedURLException, IOException {
		SpringApplication.run(JenkinsProjectApplication.class, args);
		//Program to create pdf using itext library
		
		// important class in iText library and represent PDF document instance
		Document document = new Document();
	      try
	      {  
	    	  //pdfwriter helps to write whatever data we are adding to output pdf
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Itextpdfdemo.pdf"));
	         document.open();
	         
	         
	         //This Paragraph class represents a indented “paragraph” of text.
	         document.add(new Paragraph("  Hi\nWelcome to BNYM"));
	         
	       
//........................................................................................................................................................
	       
	         //adding pdf details
	         document.addAuthor("Mohd Faiyaz Uddin");
	         document.addTitle("BNYM Documents");
	         document.addSubject("Demo Pdf for implementing itext library concepts");
	         
//........................................................................................................................................................
	         
	         //below code will add images to pdf file
	         document.add(new Paragraph(" \n\nAdding Image........................................................................................... \n"));

	         Image image2 = Image.getInstance("Birdimage.jpg");
	         //Scale to new height and new width of image
	         image2.scaleAbsolute(200, 200);
	         document.add(image2);
//........................................................................................................................................................

	         document.add(new Paragraph(" \n\nAdding Table........................................................................................... \n"));
	         //below i am adding table in pdf
	         
	         PdfPTable table=new PdfPTable(3);// 3 coulmn
	         table.setWidthPercentage(100); //Width 
	         table.setSpacingBefore(30f); //Space before table
	         table.setSpacingAfter(30f); //Space after table
	         
	         
	         PdfPCell cell1 = new PdfPCell(new Paragraph("Employee Name"));
	         cell1.setBorderColor(BaseColor.RED);
	         cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
	         cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
	  
	         PdfPCell cell2 = new PdfPCell(new Paragraph("Emp No"));
	         cell2.setBorderColor(BaseColor.RED);
	         cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
	         cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
	  
	         PdfPCell cell3 = new PdfPCell(new Paragraph("Location"));
	         cell3.setBorderColor(BaseColor.RED);
	         cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
	         cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell cell4 = new PdfPCell(new Paragraph("Mohd Faiyaz Uddin"));
	         cell4.setBorderColor(BaseColor.BLUE);
	         cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
	         cell4.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell cell5 = new PdfPCell(new Paragraph("20090****"));
	         cell5.setBorderColor(BaseColor.BLUE);
	         cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
	         cell5.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         PdfPCell cell6 = new PdfPCell(new Paragraph("Hyderabad"));
	         cell6.setBorderColor(BaseColor.BLUE);
	         cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
	         cell6.setVerticalAlignment(Element.ALIGN_MIDDLE);
	         
	         table.addCell(cell1);
	         table.addCell(cell2);
	         table.addCell(cell3);
	         table.addCell(cell4);
	         table.addCell(cell5);
	         table.addCell(cell6);

	         
	         document.add(table);
//........................................................................................................................................................

	         
	         document.add(new Paragraph(" \n\nAdding List & styling  examples........................................................................................... \n\n\n"));
	         
	         Font red = new Font(FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.RED);
	         document.add(new Paragraph("Hobbies :\n", red)); 
	         
	         //Adding ordered list
	         List orderedList = new List(List.ORDERED);
	         orderedList.add(new ListItem("Playing Cricket"));
	         orderedList.add(new ListItem("Listening to music"));
	         orderedList.add(new ListItem(" Coding\n"));
	         document.add(orderedList);
	         
	         Font blue = new Font(FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.BLUE);
	         document.add(new Paragraph("Cricket Players :\n",blue)); 

	         //Adding unordered list
	         List unorderedList = new List(List.UNORDERED);
	         unorderedList.add(new ListItem("AB Deviliers"));
	         unorderedList.add(new ListItem("Jos Butler"));
	         unorderedList.add(new ListItem("Rohit Sharma"));
	         document.add(unorderedList);
	         
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
	}

}
