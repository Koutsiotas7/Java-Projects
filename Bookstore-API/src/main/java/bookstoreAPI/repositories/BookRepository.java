package bookstoreAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstoreAPI.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>
{

}
