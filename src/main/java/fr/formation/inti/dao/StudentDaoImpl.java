package fr.formation.inti.dao;

import fr.formation.inti.entities.StudentRecord;

/**
 * Notre classe EmployeeDaoImpl suit le modèle de conception Singleton qui
 * garantit qu'une seule instance de cette classe sera créée dans l'application.
 * Lors de la première création de classe, la méthode getEntityManager () est
 * chargée de créer une instance de EntityManager.
 * 
 * @author 
 *
 */
public class StudentDaoImpl extends GenericDaoImpl<StudentRecord, Integer> implements IStudentDao{

	public StudentDaoImpl() {
		setClazz(StudentRecord.class);
	}

}
