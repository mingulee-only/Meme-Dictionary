package org.kh.meme.rank.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.kh.meme.HomeController;
import org.kh.meme.rank.domain.QuizRank;
import org.kh.meme.rank.service.RankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RankController {
	
	@Autowired
	private RankService rService;

	@RequestMapping(value="/rank/list.do", method = RequestMethod.GET)
	public String ranklist() {
		return "layout/rank";
	}
	
	@RequestMapping(value="/quiz/rank.do", method=RequestMethod.GET)
	public String quizRankList(Model model) {
		
		List<QuizRank> quizRankList = rService.printQuizRank();
		if(!quizRankList.isEmpty()) {
			model.addAttribute("quizRankList", quizRankList);
			return "layout/rank";
		} else {
			model.addAttribute("msg", "게시글 전체 조회 실패");
			return "error";
		}
		
		
	}
	
}