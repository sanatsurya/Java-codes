package ProgramPractice;

import ChatGPT.StudentReportGenerator;

public class Test {


    public int simpleIntrest(int principal, int time, int rate){
        int intrest = (principal*time*rate)/100;
        return principal+intrest;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        StudentReportGenerator.generateReport("raghav","10th","A+");
    }
}
