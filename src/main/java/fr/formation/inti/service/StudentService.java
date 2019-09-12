package fr.formation.inti.service;

import java.util.List;

import fr.formation.inti.dao.StudentDaoImpl;
import fr.formation.inti.entities.StudentRecord;

public class StudentService {
	
	private static StudentDaoImpl dao;
	
	public StudentService() {
		dao = new StudentDaoImpl();
	}
	public void persist(StudentRecord e) {
        dao.openCurrentSessionwithTransaction();
        dao.persist(e);
        dao.closeCurrentSessionwithTransaction();
    }
	public Integer save(StudentRecord e) {
		Integer id;
        dao.openCurrentSessionwithTransaction();
        id = dao.save(e);
        dao.closeCurrentSessionwithTransaction();
        return id;
    }
    public void update(StudentRecord e) {
        dao.openCurrentSessionwithTransaction();
        dao.update(e);
        dao.closeCurrentSessionwithTransaction();
    }
 
    public StudentRecord findById(Integer id) {
        dao.openCurrentSession();
        StudentRecord emp = dao.findById(id);
        dao.closeCurrentSession();
        return emp;
    }
 
    public void delete(Integer id) {
        dao.openCurrentSessionwithTransaction();
        StudentRecord emp = dao.findById(id);
        dao.delete(emp);
        dao.closeCurrentSessionwithTransaction();
    }
    public List<StudentRecord> findAll() {
        dao.openCurrentSession();
        List<StudentRecord> students = dao.getAll();
        dao.closeCurrentSession();
        return students;
    }

 
    public StudentDaoImpl StudentDao() {
        return dao;
    }
}
