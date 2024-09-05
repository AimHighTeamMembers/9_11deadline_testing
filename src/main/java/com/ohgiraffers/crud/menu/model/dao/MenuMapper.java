package com.ohgiraffers.crud.menu.model.dao;

import org.apache.ibatis.annotations.Mapper;

// MyBatis의 Mapper 인터페이스임을 나타내는  org.apache.ibatis.annotation 소속의 어노테이션.
// 이 어노테이션이 정의된 인터페이스는 MyBatis와 연동되어 SQL 매핑을 처리함.
@Mapper
public interface MenuMapper {

    void deleteMenu(int code);
    void registNewMenu(MenuDTO newMenu);
}
