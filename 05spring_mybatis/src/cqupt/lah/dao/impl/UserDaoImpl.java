package cqupt.lah.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import cqupt.lah.dao.UserDao;
import cqupt.lah.vo.User;

public class UserDaoImpl implements UserDao {
	private SqlSessionTemplate sqlSession;
	@Override
	public List<User> selectUser() {
		return sqlSession.selectList("cqupt.lah.vo.user.mapper.selectUser");
	}
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
}
