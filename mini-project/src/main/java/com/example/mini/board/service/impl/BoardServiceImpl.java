package com.example.mini.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.mini.board.model.BoardResponse;
import com.example.mini.board.repository.BoardRepository;
import com.example.mini.board.service.BoardService;


/**
 * 게시글 ServiceImpl
 * @author yhm92
 * 2019. 12. 16
 */
@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardRepository repository;
	
	// 전체 게시글 목록 검색
	@Override
	public List<BoardResponse> getPosts() {
		return repository.findAll();
	}

	// 제목 or 내용으로 검색
	public List<BoardResponse> searchPosts(String boardTitle, String boardContent) {
		List<BoardResponse> boards = null;
		
		// boardTitle, boardContent로 검색
		if(StringUtils.isEmpty(boardTitle) == true && 
				StringUtils.isEmpty(boardContent) == false) {
			boards = repository.selectPostsOfContent(boardContent);
		} else if (StringUtils.isEmpty(boardContent) == true && 
						StringUtils.isEmpty(boardTitle) == false) {
			boards = repository.selectPostsOfTitle(boardTitle);
		}
		
		return boards;
	}
	
}
