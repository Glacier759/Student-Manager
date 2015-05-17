package com.zzx.graduate.dao;

import com.zzx.graduate.entity.StudentBean;
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
public class StudentDAO {

    private static Logger logger = Logger.getLogger(StudentDAO.class.getName());
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

    public static StudentBean getStudentByID(Integer stuID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            StudentBean bean = mapper.getStudentByID(stuID);
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

    public static List<StudentBean> getStudentByClassID(Integer classID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<StudentBean> beans = mapper.getStudentByClassID(classID);
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

    public static StudentBean getStudentByStuSN(String stuSN) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            StudentBean bean = mapper.getStudentByStuSN(stuSN);
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

    public static StudentBean getStudentByIndex(Integer stuIndex) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            StudentBean bean = mapper.getStudentByIndex(stuIndex);
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

    public static List<StudentBean> getStudentByName(String name) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<StudentBean> beans = mapper.getStudentByName(name);
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
