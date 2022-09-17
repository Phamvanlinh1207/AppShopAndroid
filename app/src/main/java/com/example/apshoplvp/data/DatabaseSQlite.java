package com.example.apshoplvp.data;

import android.content.Context;

import com.example.apshoplvp.data.dao.CategoryDao;
import com.example.apshoplvp.data.implement.CategoryDaoImplement;

public class DatabaseSQlite extends DatabaseDao{
    private Context context;

    public DatabaseSQlite(Context context){
        this.context = context;
    }
    @Override
    public CategoryDao getCategoryDao() {
        return new CategoryDaoImplement(context);
    }



}
