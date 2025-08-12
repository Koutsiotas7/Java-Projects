package springbootJpaHibernate.learn_jpa_and_Hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootJpaHibernate.learn_jpa_and_Hibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> 
{
	List<Course>findByAuthor(String author);
	List<Course>findByName(String name);
}
