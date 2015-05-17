package com.zzx.graduate.dao;

import com.zzx.graduate.entity.TaskResultBean;
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
public class TaskResultDAO {

    private static Logger logger = Logger.getLogger(TaskResultDAO.class.getName());
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

    public static TaskResultBean getTaskResultByID(Integer resultID) {
        try{
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            TaskResultBean bean = mapper.getTaskResultByID(resultID);
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

    public static List<TaskResultBean> getTaskResultByTaskID(Integer taskID) {
        try{
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<TaskResultBean> beans = mapper.getTaskResultByTaskID(taskID);
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

    public static List<TaskResultBean> getTaskResultBySubmitterID(Integer submitterID) {
        try{
            session = sessionFactory.openSession();
            mapper = session.getMapper(MysqlOperation.class);
            List<TaskResultBean> beans = mapper.getTaskResultBySubmitterID(submitterID);
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
