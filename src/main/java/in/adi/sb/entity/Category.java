package in.adi.sb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity()
@Table(name="category")
public class Category{

	@Column(name="category_id")
	public @Id @GeneratedValue(strategy=GenerationType.IDENTITY) int category_id;
	
	@Column(name="category_name",nullable=false)
	@NotNull()
	public String category_name ;
	
	@Column(name="category_info",nullable=false)
	@NotNull()
	public String category_info;
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCategory_info() {
		return category_info;
	}
	public void setCategory_info(String category_info) {
		this.category_info = category_info;
	}
	public Category(int category_id, String category_name, String category_info) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_info = category_info;
	}
	public Category() {
		super();
	}
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", category_info="
				+ category_info + "]";
	}
	
	
}
