package org.kh.meme.rank.service.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.meme.rank.domain.QuizRank;
import org.kh.meme.rank.service.RankService;
import org.kh.meme.rank.store.RankStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankServiceImpl implements RankService{
	
	@Autowired
	private RankStore rStore;
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<QuizRank> printQuizRank() {
		List<QuizRank> quizRankList = rStore.selectQuizRank(sqlSession);
		return quizRankList;
	}

}
