package rikkei.edu.business;

import rikkei.edu.entity.Student;

import java.util.UUID;

public class StudentManager implements IStudent {
    private static final Student[] students;
    private static int size = 0;
    static {
        students = new Student[100];
        students[0] = new Student(UUID.randomUUID().toString(),"Nguyen VAn A",18,"HCM");
        size++;
    }


    // lấy danh sách
    public  Student[] findAll(){
        return students;
    }
    public  int size(){
        return size;
    }

    // lấy theo id
    public  Student findById(String id){
        for (Student student : students) {
            if (student!= null && student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    // thêm mơi
    public boolean add(Student student){
        if(size >= 100){
            System.err.println("Mang da day");
             return false;
        }
        students[size] = student;
        size++;
        return true;
    }
    // cập nhật thông tin
    public boolean update(Student student){
        int indexUpdate = indexById(student.getId());
        if(indexUpdate == -1){
            System.err.println("Khong tim thay id");
            return false;
        }
        students[indexUpdate] = student;
        return true;
    }

    public int indexById(String id){
        for (int i = 0; i < size; i++) {
            if (students[i]!= null && students[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    // xóa
    public  boolean delete(String id){
        int indexDel = indexById(id);
        if(indexDel == -1){
            System.err.println("Khong tim thay id");
            return false;
        }
        for (int i =indexDel ; i< size -1 ; i++){
            students[i] = students[i+1];
        }
        size--;
        return true;
    }


}
