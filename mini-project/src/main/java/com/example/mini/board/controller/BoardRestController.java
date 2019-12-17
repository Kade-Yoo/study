package com.example.mini.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mini.board.model.BoardRequest;
import com.example.mini.board.model.BoardResponse;
import com.example.mini.board.service.BoardService;

/**
 * �Խ��� Rest Api
 * 
 * @author yhm92
 * 2019. 12. 16
 */
@RestController
@RequestMapping("/board")
public class BoardRestController {
	
	@Autowired
	private BoardService service;
	
	/**
	 * get �Խñ� ��ü ���
	 */
	@GetMapping("/get/posts")
	public List<BoardResponse> getPost() {
		return service.getPosts();
	}
	
	/**
	 * �������� �Խñ� ��� �˻�
	 */
	@GetMapping("/search/posts/{boardTitle}")
	public List<BoardResponse> searchPostOfTitle(@PathVariable(value = "boardTitle") String boardTitle) {
		return service.searchPostsOfTitle(boardTitle);
	}
	
	/**
	 * �������� �Խñ� ��� �˻�
	 */
	@GetMapping("/search/posts/{boardContent}")
	public List<BoardResponse> searchPostOfContent(@PathVariable(value = "boardContent") String boardContent) {
		return service.searchPostsOfContent(boardContent);
	}
}
