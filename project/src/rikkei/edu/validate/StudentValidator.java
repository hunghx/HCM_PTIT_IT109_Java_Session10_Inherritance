package rikkei.edu.validate;

public class StudentValidator {
    public static boolean validateStudentName(String studentName){
        if(studentName.isBlank()){
            System.err.println("Khng được dể trống");
            return false;
        }

        if(studentName.length()< 6){
            System.err.println("Tên phải có ít nhất 6 ký tự");
            return false;
        }
        return true;
    }



}
