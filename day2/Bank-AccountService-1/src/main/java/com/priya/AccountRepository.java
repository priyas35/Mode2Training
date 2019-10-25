package com.priya;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{


   public Account findAccountByUserid(int userid);
   public Account findAccountByAccountno(int accountno);

	

}
