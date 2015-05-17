package com.zzx.graduate.dao;

import com.zzx.graduate.entity.ExpGroupMemBean;
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
public class ExpGroupMemDAO {

    private static Logger logger = Logger.getLogger(ExpGroupMemDAO.class.getName());
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

    public static ExpGroupMemBean getExpGroupMemByID(Integer groupMemID) {
        try {
            ExpGroupMemBean bean = mapper.getExpGroupMemByID(groupMemID);
            session.commit();
            return bean;
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public static List<ExpGroupMemBean> getExpGroupMemByGroupID(Integer groupID) {
        try {
            List<ExpGroupMemBean> beans = mapper.getExpGroupMemByGroupID(groupID);
            session.commit();
            return beans;
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public static List<ExpGroupMemBean> getExpGroupMemByStuID(Integer stuID) {
        try {
            List<ExpGroupMemBean> beans = mapper.getExpGroupMemByStuID(stuID);
            session.commit();
            return beans;
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }
}
