package kr.or.dgit.mybatis_dev.services;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.UserPicMapper;
import kr.or.dgit.mybatis_dev.dao.UserPicMapperImpl;
import kr.or.dgit.mybatis_dev.dto.UserPic;
import kr.or.dgit.mybatis_dev.util.MybatisSqlSessionFactory;

public class UserPicService {
	private static Log log = LogFactory.getLog(UserPicService.class);
	private String namespace = "kr.or.dgit.mybatis_dev.dao.TutorMapper";
	
	public UserPic findUserPicById(int id){
		
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			return userPicMapper.selectUserPicById(id);
		}
	}
	
	public int insertUserPic(UserPic userPic){
		
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){			
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			int res=userPicMapper.insertUserPic(userPic);
			sqlSession.commit();
			return res;
		}
	}
}
