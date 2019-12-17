package com.example.mini.board.service;

import java.util.List;

import com.example.mini.board.model.BoardResponse;

/**
 * °Ô½Ã±Û Service
 * @author yhm92
 * 2019. 12. 16
 */
public interface BoardService {
	
	List<BoardResponse> getPosts();
	List<BoardResponse> searchPosts(String boardTitle, String boardContent);
}
