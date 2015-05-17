package com.zzx.graduate.dao;

import com.zzx.graduate.entity.CourseClassBean;
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
public class CourseClassDAO {

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

    public static CourseClassBean getCourseClassByID(Integer courClassID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            CourseClassBean bean = mapper.getCourseClassByID(courClassID);
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

    public static List<CourseClassBean> getCourseClassByCourID(Integer courID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<CourseClassBean> beans = mapper.getCourseClassByCourID(courID);
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

    public static List<CourseClassBean> getCourseClassByDictID(Integer dictID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<CourseClassBean> beans = mapper.getCourseClassByDictID(dictID);
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

    public static List<CourseClassBean> getCourseClassByTeachID(Integer teachID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<CourseClassBean> beans = mapper.getCourseClassByTeachID(teachID);
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
