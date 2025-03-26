package rikkei.edu.business;

import rikkei.edu.entity.Student;

public interface IBusiness<T,E> {
    T[] findAll();
    int size();

    // lấy theo id
    Student findById(E id);
    // thêm mơi
    boolean add(T s);
    // cập nhật thông tin
    boolean update(T s);

    int indexById(E id);
    // xóa
    boolean delete(E id);
}
