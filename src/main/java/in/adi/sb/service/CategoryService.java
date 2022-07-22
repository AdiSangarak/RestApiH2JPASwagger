package in.adi.sb.service;

import java.util.List;
import in.adi.sb.entity.Category;

public interface CategoryService {

	List<Category> getCategories();
	Category saveCategory(Category category);
	Category getSingleCategory(int category_id);
	void deleteCategory(int category_id);
	Category updateCategory(Category category);
}