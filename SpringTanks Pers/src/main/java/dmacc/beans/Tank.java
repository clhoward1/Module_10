/**
 * @author Cory Howard - clhoward1
 * CIS175 - Spring 2024
 * Apr 24, 2024
 */
package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tank {

	@Id
	@GeneratedValue
	private long id;
	private String modelName;
	private int yearIntroduced;
	private int amountMade;
	
	public Tank() {
		super();
		this.setYearIntroduced(1943);
	}
	
	public Tank(String modelName) {
		super();
		this.modelName = modelName;
	}
	
	public Tank(String modelName, int yearIntroduced, int amountMade) {
		super();
		this.modelName = modelName;
		this.yearIntroduced = yearIntroduced;
		this.amountMade = amountMade;
	}

	public Tank(long id, String modelName, int yearIntroduced, int amountMade) {
		super();
		this.id = id;
		this.modelName = modelName;
		this.yearIntroduced = yearIntroduced;
		this.amountMade = amountMade;
	}

	@Override
	public String toString() {
		return "Tank [id=" + id + ", modelName=" + modelName + ", yearIntroduced=" + yearIntroduced + ", amountMade="
				+ amountMade + "]";
	}
	
	
	
}
