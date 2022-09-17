package net.javaguides.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lastbook")
public class book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idlastbook")
	private Integer id;
	@Column(name = "lastbookTitle")
	private String lastbooktitle;
	private String lastbookauther;
	private float lastbookprice;

	public book() {
		super();
	}

	public book(Integer id, String lastbooktitle, String lastbookauther, float lastbookprice) {
		super();
		this.id = id;
		this.lastbooktitle = lastbooktitle;
		this.lastbookauther = lastbookauther;
		this.lastbookprice = lastbookprice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastbooktitle() {
		return lastbooktitle;
	}

	public void setLastbooktitle(String lastbooktitle) {
		this.lastbooktitle = lastbooktitle;
	}

	public String getLastbookauther() {
		return lastbookauther;
	}

	public void setLastbookauther(String lastbookauther) {
		this.lastbookauther = lastbookauther;
	}

	public float getLastbookprice() {
		return lastbookprice;
	}

	public void setLastbookprice(float lastbookprice) {
		this.lastbookprice = lastbookprice;
	}

}
