package com.app.services;

import com.app.dao.CatalogDao;
import com.app.model.Category;
import com.app.model.Subcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private CatalogDao catalogDao;

    public List<Category> getCategories() {
        return catalogDao.getCategories();
    }

    public void storeCategory(Category category) {
        //Здесь могла бы быть ваша валидация :)
        catalogDao.storeCategory(category);
    }

    public List<Subcategory> getSubcategories() {
        return catalogDao.getSubcategories();
    }

    public void storeSubcategory(Subcategory subcategory) {
        //Здесь могла бы быть ваша валидация :)
        catalogDao.storeSubcategory(subcategory);
    }
}
