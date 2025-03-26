package rikkei.edu.business;

import rikkei.edu.entity.Classes;
import rikkei.edu.entity.Student;

public class ClassesManager implements IBusiness<Classes, Integer>{
    @Override
    public Classes[] findAll() {
        return new Classes[0];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public boolean add(Classes s) {
        return false;
    }

    @Override
    public boolean update(Classes s) {
        return false;
    }

    @Override
    public int indexById(Integer id) {
        return 0;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
