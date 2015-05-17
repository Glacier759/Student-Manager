package com.zzx.graduate.dao;

import com.zzx.graduate.entity.ExperimentBean;
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
public class ExperimentDAO {

    private static Logger logger = Logger.getLogger(ExperimentDAO.class.getName());
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

    public static ExperimentBean getExperimentByID(int expID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            ExperimentBean bean = mapper.getExperimentByID(expID);
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

    public static List<ExperimentBean> getExperimentByClassID(int courClassID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<ExperimentBean> beans = mapper.getExperimentByClassID(courClassID);
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

    public static List<ExperimentBean> getExperimentByDictID(int dictID) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<ExperimentBean> beans = mapper.getExperimentByDictID(dictID);
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

    public static List<ExperimentBean> getExperimentByCreateTime(String createTime) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<ExperimentBean> beans = mapper.getExperimentByCreateTime(createTime);
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

    public static List<ExperimentBean> getExperimentBeforeTime(String beforeTime) {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<ExperimentBean> beans = mapper.getExperimentBeforeTime(beforeTime);
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

    public static List<ExperimentBean> getAllExperiment() {
        try {
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<ExperimentBean> beans = mapper.getAllExperiments();
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
