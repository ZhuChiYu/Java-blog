package com.example.springbootdemo.mapper;

import com.example.springbootdemo.model.Question;
import com.example.springbootdemo.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {
    int incView(Question record);

}