package com.priya;




import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface EmployRepository extends PagingAndSortingRepository<Employ, Integer>{

	
	
	@Query("SELECT e FROM Employ e WHERE dept=?1 AND desig=?2")
	List<Employ> findByDeptAndDesig(String department,String designation);
	
	@Query("SELECT e FROM Employ e WHERE desig=?1")
	List<Employ> findByDesig(String designation);
	
	@Query("SELECT e FROM Employ e WHERE desig=?1 AND  basic>?2")
	List<Employ> findByDesigAndSalary(String designation,int basic);
	
	@Query("SELECT e FROM Employ e WHERE desig=?1 AND name LIKE 'h%'")
	List<Employ> findByDesigAndName(String designation);
	
	@Query("SELECT e FROM Employ e WHERE desig=?1 order by ?2 desc")
	List<Employ> sortByDesig(String designation,String salary);
	
	@Query("SELECT e FROM Employ e WHERE desig=?1  AND name LIKE 'h%' order by ?2")
	List<Employ> sortByDesigdeptandname(String designation,String salary);

	
	
	
	
	 
	
}
