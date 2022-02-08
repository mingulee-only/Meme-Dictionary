package org.kh.meme.meme.service;

import java.util.List;

import org.kh.meme.meme.domain.Meme;
import org.kh.meme.meme.domain.PageInfo;

public interface MemeService {
	
	public int getListCount();
	public List<Meme> printAll(PageInfo pi);
	//사전 등록
	public int registerMeme(Meme meme);
	//사전 검색
	public Meme printOneByMeme(String memeName);
	//사전 조회수
	public int memeCountUpdate(int memeNo);

}