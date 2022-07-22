package in.adi.sb.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.adi.sb.entity.Category;
import in.adi.sb.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService cs;
	
	@GetMapping("/categories")
	public List<Category> getCategories()
	{
		return cs.getCategories();
	}
	
	@GetMapping("/category/{c_id}")
	public Category getCategory(@PathVariable("c_id") int c_id)
	{
		
		return cs.getSingleCategory(c_id);
	}
	
	@DeleteMapping("/category/{c_id}")
	public void deleteCategory(@PathVariable("c_id") int c_id)
	{
		cs.deleteCategory(c_id);
	}
	
	@PostMapping("/category")
	public Category saveCategory(@Valid @RequestBody Category category)
	{
		return cs.saveCategory(category);
	}
	
	@PutMapping("/category/{c_id}")
	public Category updateCategory(@PathVariable int c_id ,@RequestBody Category category)
	{
		category.setCategory_id(c_id);
		return cs.updateCategory(category);
	}
	
	
}
