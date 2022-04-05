package org.wrj.allspring.jpainternal.respository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRespository<Student,Long> extends CrudRepository<Student,Long> {

    Student findByIdNum(String idNum);


    List<Student> findByFullName(String fullName);


}
