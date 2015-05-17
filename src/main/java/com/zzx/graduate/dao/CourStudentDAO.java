package com.zzx.graduate.dao;

import com.zzx.graduate.entity.CourStudentBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.util.List;

/**
 * Created by glacier on 15-5-14.
 */
public class CourStudentDAO {

    private static Logger logger = Logger.getLogger(CourseClassDAO.class.getName());
    private static Reader reader;
    private static SqlSessionFactory sessionFactory;
    private static SqlSession session;
    private static MysqlOperation mapper;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
    }

    public static CourStudentBean getCourStudentByID(Integer selCourID) {
        try{
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            CourStudentBean bean = mapper.getCourStudentByID(selCourID);
            session.commit();
            session.close();
            return bean;
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public static List<CourStudentBean> getCourStudentByStuID(Integer stuID) {
        try{
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<CourStudentBean> beans = mapper.getCourStudentByStuID(stuID);
            session.commit();
            session.close();
            return beans;
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public static List<CourStudentBean> getCourStudentByCourClassID(Integer courClassID) {
        try{
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<CourStudentBean> beans = mapper.getCourStudentByCourClassID(courClassID);
            session.commit();
            session.close();
            return beans;
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

}
