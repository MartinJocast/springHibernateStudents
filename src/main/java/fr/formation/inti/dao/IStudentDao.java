package fr.formation.inti.dao;

import java.util.List;

import fr.formation.inti.entities.StudentRecord;

public interface IStudentDao {

	
	public List<StudentRecord> getAll();
	
	public void persist(StudentRecord e);
	
	public Integer save(StudentRecord e);
	
	public void update(StudentRecord e);
	
	public void delete(StudentRecord e);
	
	public void deleteByID(Integer id);
	
	public StudentRecord findById(Integer id);
	
	public void close();
	
}
