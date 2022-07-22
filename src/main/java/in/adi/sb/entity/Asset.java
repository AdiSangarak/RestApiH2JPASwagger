package in.adi.sb.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity()
@Table(name="asset")
public class Asset  {

	
	@Column(name="asset_id")
	public @Id @GeneratedValue(strategy=GenerationType.IDENTITY) int asset_id ;
	
	@Column(name="asset_name",nullable=false)
	@NotNull()
	public String asset_name ;
	
	@Column(name="purchase_date",nullable=false)
	@JsonFormat(shape =JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
	public Date purchase_date;
	
	@Column(name="asset_condition_note",nullable=false)
	public String asset_condition_note;
	
	
	@Enumerated(EnumType.STRING)
    public Asset_assigned_status asset_assigned_status;


	public Asset(int asset_id, @NotNull String asset_name, Date purchase_date, String asset_condition_note,
			Asset_assigned_status asset_assigned_status) {
		super();
		this.asset_id = asset_id;
		this.asset_name = asset_name;
		this.purchase_date = purchase_date;
		this.asset_condition_note = asset_condition_note;
		this.asset_assigned_status = asset_assigned_status;
	}


	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAsset_id() {
		return asset_id;
	}


	public void setAsset_id(int asset_id) {
		this.asset_id = asset_id;
	}


	public String getAsset_name() {
		return asset_name;
	}


	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}


	public Date getPurchase_date() {
		return purchase_date;
	}


	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}


	public String getAsset_condition_note() {
		return asset_condition_note;
	}


	public void setAsset_condition_note(String asset_condition_note) {
		this.asset_condition_note = asset_condition_note;
	}


	public Asset_assigned_status getAsset_assigned_status() {
		return asset_assigned_status;
	}


	public void setAsset_assigned_status(Asset_assigned_status asset_assigned_status) {
		this.asset_assigned_status = asset_assigned_status;
	}


	@Override
	public String toString() {
		return "Asset [asset_id=" + asset_id + ", asset_name=" + asset_name + ", purchase_date=" + purchase_date
				+ ", asset_condition_note=" + asset_condition_note + ", asset_assigned_status=" + asset_assigned_status
				+ "]";
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	

