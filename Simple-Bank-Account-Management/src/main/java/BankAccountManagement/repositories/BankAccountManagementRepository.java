package BankAccountManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import BankAccountManagement.entities.BankAccount;

public interface BankAccountManagementRepository extends JpaRepository<BankAccount, Long>
{
	BankAccount findByAccountNumber(String accountNumber);
}
