package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.TutorMapper;
import kr.or.dgit.mybatis_dev.dto.Tutor;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class TutorService {
	private static Log log = LogFactory.getLog(TutorService.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.TutorMapper";
	
	public Tutor findTutorById(int id){
		log.debug("findTutorById()");
		SqlSession sqlSession = MybatisSqlSessionFactory.openSession();
		try{
			TutorMapper tutorMapper = sqlSession.getMapper(TutorMapper.class);
			return tutorMapper.findTutorById(id);
		}finally{
			sqlSession.close();
		}
	}
}
