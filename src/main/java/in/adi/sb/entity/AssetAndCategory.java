package in.adi.sb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asset_and_category")
public class AssetAndCategory {
	@Column(name="asset_id")
	@Id int asset_id;
	
	
	@Column(name="category_id")
	int category_id;


	public int getAsset_id() {
		return asset_id;
	}


	public void setAsset_id(int asset_id) {
		this.asset_id = asset_id;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public AssetAndCategory(int asset_id, int category_id) {
		super();
		this.asset_id = asset_id;
		this.category_id = category_id;
	}


	public AssetAndCategory() {
		super();
	}


	@Override
	public String toString() {
		return "AssetAndCategory [asset_id=" + asset_id + ", category_id=" + category_id + "]";
	}
	
	
}

