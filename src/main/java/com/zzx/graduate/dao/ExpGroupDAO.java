package com.zzx.graduate.dao;

import com.zzx.graduate.entity.ExpGroupBean;
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
public class ExpGroupDAO {

    private static Logger logger = Logger.getLogger(ExpGroupDAO.class.getName());
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

    public static ExpGroupBean getExpGroupByID(Integer groupID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            ExpGroupBean bean = mapper.getExpGroupByID(groupID);
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

    public static List<ExpGroupBean> getExpGroupByExpID(Integer expID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<ExpGroupBean> beans = mapper.getExpGroupByExpID(expID);
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

    public static void insertExpGroup(ExpGroupBean expGroupBean) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            mapper.insertExpGroup(expGroupBean);
            session.commit();
            session.close();
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
    }

    public static void uploadFileByExpGroup(ExpGroupBean expGroupBean) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            mapper.uploadFileByExpGroup(expGroupBean);
            session.commit();
            session.close();
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
    }

    public static List<ExpGroupBean> getExperimentByStuSN(String stuSN) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<ExpGroupBean> beans = mapper.getExperimentByStuSN(stuSN);
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
