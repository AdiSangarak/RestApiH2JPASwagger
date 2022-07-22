package in.adi.sb;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import in.adi.sb.dao.AssetAndCategoryRepository;
import in.adi.sb.dao.AssetAndEmployeeRepository;
import in.adi.sb.dao.AssetRepository;
import in.adi.sb.dao.CategoryRepository;
import in.adi.sb.dao.EmployeeRepository;
import in.adi.sb.entity.Asset;
import in.adi.sb.entity.AssetAndCategory;
import in.adi.sb.entity.AssetAndEmployee;
import in.adi.sb.entity.Asset_assigned_status;
import in.adi.sb.entity.Category;
import in.adi.sb.entity.Employee;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.SimpleDateFormat;


@SpringBootApplication
@EnableSwagger2
public class SbAppH2JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAppH2JpaApplication.class, args);
	}
	
	@Component
	class AdiCommandLineRunner implements CommandLineRunner{
		

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	
	@Autowired
	AssetRepository assetRepository;
	
	@Autowired
	AssetAndCategoryRepository assetAndCategoryRepository;
	
	@Autowired
	AssetAndEmployeeRepository assetAndEmployeeRepository;
	
	
	@Override
	public void run(String... args) throws Exception {

		Employee employee;
		employee = new Employee();
		employee.setEmployee_name("ADITYA");
		employee.setEmployee_designation("Junior Software Developer");
		employeeRepository.save(employee);
		
		employee = new Employee();
		employee.setEmployee_name("SANGARAK");
		employee.setEmployee_designation("");
		employeeRepository.save(employee);
		
		employee = new Employee();
		employee.setEmployee_name("KRISHNA");
		employee.setEmployee_designation("");
		employeeRepository.save(employee);
		
		employee = new Employee();
		employee.setEmployee_name("RAMESH");
		employee.setEmployee_designation("");
		employeeRepository.save(employee);
		

		Category category ;
		category = new Category();
		category.setCategory_name("LAPTOP");
		category.setCategory_info("A battery powered compact personal computer");
		categoryRepository.save(category);

		category = new Category();
		category.setCategory_name("STATIONARY");
		category.setCategory_info("Objects Like PEN, PENCIL, ERASER etc");
		categoryRepository.save(category);

		category = new Category();
		category.setCategory_name("FURNITURE");
		category.setCategory_info("Objects like Table, Chair, Sofa etc");
		categoryRepository.save(category);

		category = new Category();
		category.setCategory_name("MOBILE");
		category.setCategory_info("A portable telephone receiver capable of radio calling");
		categoryRepository.save(category);
		
		Asset asset ;
		asset = new Asset();
		asset.setAsset_name("HP_PENCIL");
		asset.setPurchase_date(new SimpleDateFormat("dd/MM/yyyy").parse("03/05/2021"));
		asset.setAsset_condition_note("EXCELLENT CONDITIION");
		asset.setAsset_assigned_status(Asset_assigned_status.AVAILABLE);
		assetRepository.save(asset);
		
		asset = new Asset();
		asset.setAsset_name("VIVO_PHONE");
		asset.setPurchase_date(new SimpleDateFormat("dd/MM/yyyy").parse("06/02/2022"));
		asset.setAsset_condition_note("GOOD CONDTION");
		asset.setAsset_assigned_status(Asset_assigned_status.ASSIGNED);
		assetRepository.save(asset);
		
		asset = new Asset();
		asset.setAsset_name("ASUS_LAPTOP");
		asset.setPurchase_date(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2020"));
		asset.setAsset_condition_note("OK CONDITION");
		asset.setAsset_assigned_status(Asset_assigned_status.RECOVERED);
		assetRepository.save(asset);
		

		asset = new Asset();
		asset.setAsset_name("FLUID_CHAIR");
		asset.setPurchase_date(new SimpleDateFormat("dd/MM/yyyy").parse("05/01/2021"));
		asset.setAsset_condition_note("POOR");
		asset.setAsset_assigned_status(Asset_assigned_status.AVAILABLE);
		assetRepository.save(asset);
		
		
		AssetAndCategory assetAndCategory;
		assetAndCategory = new AssetAndCategory();
		assetAndCategory.setAsset_id(1);
		assetAndCategory.setCategory_id(2);
		assetAndCategoryRepository.save(assetAndCategory);
		

		assetAndCategory = new AssetAndCategory();
		assetAndCategory.setAsset_id(2);
		assetAndCategory.setCategory_id(4);
		assetAndCategoryRepository.save(assetAndCategory);
		
		assetAndCategory = new AssetAndCategory();
		assetAndCategory.setAsset_id(3);
		assetAndCategory.setCategory_id(1);
		assetAndCategoryRepository.save(assetAndCategory);
		
		assetAndCategory = new AssetAndCategory();
		assetAndCategory.setAsset_id(4);
		assetAndCategory.setCategory_id(3);
		assetAndCategoryRepository.save(assetAndCategory);

		AssetAndEmployee assetAndEmployee;
		assetAndEmployee = new AssetAndEmployee();
		assetAndEmployee.setAsset_id(1);
		assetAndEmployee.setEmployee_id(3);
		assetAndEmployeeRepository.save(assetAndEmployee);
		
		assetAndEmployee = new AssetAndEmployee();
		assetAndEmployee.setAsset_id(2);
		assetAndEmployee.setEmployee_id(2);
		assetAndEmployeeRepository.save(assetAndEmployee);

		assetAndEmployee = new AssetAndEmployee();
		assetAndEmployee.setAsset_id(3);
		assetAndEmployee.setEmployee_id(4);
		assetAndEmployeeRepository.save(assetAndEmployee);

		assetAndEmployee = new AssetAndEmployee();
		assetAndEmployee.setAsset_id(4);
		assetAndEmployee.setEmployee_id(1);
		assetAndEmployeeRepository.save(assetAndEmployee);
		
		
		
		
		
	}
	}

}
