
package montalvo;


public class Grades {
    
    private int studentId;
    private String studentName;
    private double prelim, midterm, preFinal, finalExam;
    
    
    public void addGrades(int studentId, String studentName, double prelim, double midterm, double preFinal, double finalExam) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.prelim = prelim;
        this.midterm = midterm;
        this.preFinal = preFinal;
        this.finalExam = finalExam;
    }
    
    
    public void viewGrades() {
        double average = (this.prelim + this.midterm + this.preFinal + this.finalExam) / 4;
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s%n",
                this.studentId, this.studentName, this.prelim, this.midterm, this.preFinal, this.finalExam,
       
               average, remarks);
    }

    void addGrades() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   
    
   
}

    

