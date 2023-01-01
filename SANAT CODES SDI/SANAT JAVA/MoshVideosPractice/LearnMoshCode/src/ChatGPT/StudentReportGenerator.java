package ChatGPT;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class StudentReportGenerator {
    public static void generateReport(String studentName, String className, String grade) throws DocumentException, IOException {
        // Create a document object
        Document document = new Document();

        // Create a PDF writer object
        PdfWriter.getInstance(document, new FileOutputStream("student_report.pdf"));
        // Open the document
        document.open();

        // Add content to the document
        document.add(new Paragraph("Student Name: " + studentName));
        document.add(new Paragraph("Class Name: " + className));
        document.add(new Paragraph("Grade: " + grade));

        // Close the document
        document.close();
    }
}
