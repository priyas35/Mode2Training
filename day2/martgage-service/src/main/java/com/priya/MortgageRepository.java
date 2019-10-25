package com.priya;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MortgageRepository extends CrudRepository<Mortgageapp, Integer>{


	/*
	 * public Mortgageapp findAccountByUserid(int userid); public Mortgageapp
	 * findAccountByAccountno(int accountno);
	 */

	

}
