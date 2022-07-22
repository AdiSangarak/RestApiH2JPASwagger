package in.adi.sb.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import in.adi.sb.dao.CategoryRepository;
import in.adi.sb.entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository cr;

	@Override
	public List<Category> getCategories() {
		return cr.findAll();
	}



	@Override
	public Category saveCategory(Category category) {
		return cr.save(category);
	}
		
	@Override 
	public Category getSingleCategory(int category_id)
	{
		Optional<Category> category = cr.findById(category_id);
		if(category.isPresent())
			return category.get();
		else
			throw new RuntimeException("Category is not found for the id:"+category_id);
	}
	
	@Override
	public void deleteCategory(int category_id)
	{
		cr.deleteById(category_id);
	}

	@Override
	public Category updateCategory(Category category) {
		return cr.save(category);
	}
}
