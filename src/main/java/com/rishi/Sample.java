package com.rishi;

import com.news.Category;
import com.news.CurrentNews;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Sample {
    public static void main(String args[]) throws IOException {
        CurrentNews.initApi("your api");
    List<Map> list=CurrentNews.getNewsByCategory(Category.BUSINESS);
    for(Map<String,String> news:list)
        System.out.println(news.get("description"));
}}
