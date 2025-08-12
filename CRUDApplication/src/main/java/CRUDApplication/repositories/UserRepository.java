package CRUDApplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import CRUDApplication.entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}
