package com.example.DevOps.Jenkins_Project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
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
	         document.add(new Paragraph("  Hi\nWelcome to BNYM(POD 18)"));
	         
	         //adding pdf details
	         
	         document.addAuthor("Mohd Faiyaz Uddin");
	         document.addTitle("BNYM Documents");
	         document.addSubject("Demo Pdf for implementing itext library concepts");
	         
	         
	         //below code will add images to pdf file
	         
	         document.add(new Paragraph(" \n\nAdding Image \n"));

	         Image image2 = Image.getInstance("Birdimage.jpg");
	         //Scale to new height and new width of image
	         image2.scaleAbsolute(200, 200);
	         document.add(image2);
	         
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
