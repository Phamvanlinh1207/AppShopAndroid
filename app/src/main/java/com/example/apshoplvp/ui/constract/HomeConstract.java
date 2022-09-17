package com.example.apshoplvp.ui.constract;

import com.example.apshoplvp.data.model.Category;
import java.util.List;

public interface HomeConstract {
    interface IView{
        void setCategoryListToView(List<Category> categoryList);
        void showCategory(Category category);
    }

    interface IPresenter{
        void setView(IView view);
        void getCategoryList();
        void getCategory(int categoryId);
    }
}
