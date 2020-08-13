package com.room.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * @ClassName: MybatisUtils
 * @Description:
 * @author: ��Խ��
 * @date: 2020��4��14�� ����8:42:38
 * @param:
 */
public class MybatisUtils {
	public static SqlSession getFactory(){
		String resource = "conf.xml"; 
		
		InputStream reader=MybatisUtils.class.getClassLoader().getResourceAsStream(resource);
		 
		
SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		
SqlSession session = factory.openSession(true);
		return session;
	}
}