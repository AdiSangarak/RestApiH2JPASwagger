
package in.adi.sb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ASSET_AND_EMPLOYEE")
public class AssetAndEmployee {
		@Column(name="asset_id")
		@Id int asset_id;
		
		
		@Column(name="employee_id")
		int employee_id;
		
		public int getAsset_id() {
			return asset_id;
		}


		public void setAsset_id(int asset_id) {
			this.asset_id = asset_id;
		}


		public int getEmployee_id() {
			return employee_id;
		}


		public void setEmployee_id(int employee_id) {
			this.employee_id = employee_id;
		}


		public AssetAndEmployee(int asset_id, int employee_id) {
			super();
			this.asset_id = asset_id;
			this.employee_id = employee_id;
		}


		public AssetAndEmployee() {
			super();
		}

		@Override
		public String toString() {
			return "AssetAndEmployee [asset_id=" + asset_id + ", employee_id=" + employee_id + "]";
		}
}


	
