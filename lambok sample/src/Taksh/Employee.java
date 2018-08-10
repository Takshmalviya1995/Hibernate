package Taksh;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="lambok")
@Data
public class Employee {
	
	@Id
	@Column(name="id")
	private int id;
	

}
