package com.zzx.graduate.dao;

import com.zzx.graduate.entity.ExpTaskBean;
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
public class ExpTaskDAO {

    private static Logger logger = Logger.getLogger(ExpTaskDAO.class.getName());
    private static Reader reader;
    private static SqlSessionFactory sessionFactory;
    private static SqlSession session;
    private static MysqlOperation mapper;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            sessionFactory.getConfiguration().addMapper(MysqlOperation.class);
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
        } catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
    }

    public static ExpTaskBean getExpTaskByID(Integer taskID) {
        try {
            ExpTaskBean bean = mapper.getExpTaskByID(taskID);
            session.commit();
            return bean;
        } catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public static List<ExpTaskBean> getExpTaskByExpID(Integer expID) {
        try {
            List<ExpTaskBean> beans = mapper.getExpTaskByExpID(expID);
            session.commit();
            return beans;
        } catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public static List<ExpTaskBean> getExpTaskByTaskIndex(Integer taskIndex) {
        try {
            List<ExpTaskBean> beans = mapper.getExpTaskByTaskIndex(taskIndex);
            session.commit();
            return beans;
        } catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public static List<ExpTaskBean> getExpTaskByStartTime(String startTime) {
        try {
            List<ExpTaskBean> beans = mapper.getExpTaskByStartTime(startTime);
            session.commit();
            return beans;
        } catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public static List<ExpTaskBean> getExpTaskByEndTime(String endTime) {
        try {
            List<ExpTaskBean> beans = mapper.getExpTaskByEndTime(endTime);
            session.commit();
            return beans;
        } catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

}
