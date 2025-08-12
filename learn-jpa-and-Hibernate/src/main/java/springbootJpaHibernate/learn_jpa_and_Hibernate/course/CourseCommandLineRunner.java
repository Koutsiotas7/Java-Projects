package springbootJpaHibernate.learn_jpa_and_Hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import springbootJpaHibernate.learn_jpa_and_Hibernate.course.Course;
import springbootJpaHibernate.learn_jpa_and_Hibernate.course.jdbc.CoursejdbcRepository;
import springbootJpaHibernate.learn_jpa_and_Hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CoursejdbcRepository repository;
	
//	@Autowired
//	private CoursejpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception 
	{
		repository.save(new Course(1,"Learn AWS JPA","in28minutes"));
		repository.save(new Course(2,"Learn CSS JPA","in28minutes"));
		repository.save(new Course(3,"Learn PHP JPA","in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByName("Learn PHP JPA"));
	}

}
