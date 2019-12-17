package com.example.mini.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.mini.board.model.BoardResponse;
import com.example.mini.board.repository.BoardRepository;
import com.example.mini.board.service.BoardService;


/**
 * �Խñ� ServiceImpl
 * @author yhm92
 * 2019. 12. 16
 */
@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardRepository repository;
	
	// ��ü �Խñ� ��� �˻�
	@Override
	public List<BoardResponse> getPosts() {
		return repository.findAll();
	}

	// ���� or �������� �˻�
	public List<BoardResponse> searchPosts(String boardTitle, String boardContent) {
		List<BoardResponse> boards = null;
		
		// boardTitle, boardContent�� �˻�
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
