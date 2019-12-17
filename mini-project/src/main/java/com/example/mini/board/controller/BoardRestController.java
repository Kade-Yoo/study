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
 * 게시판 Rest Api
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
	 * get 게시글 전체 목록
	 */
	@GetMapping("/get/posts")
	public List<BoardResponse> getPost() {
		return service.getPosts();
	}
	
	/**
	 * 제목으로 게시글 목록 검색
	 */
	@GetMapping("/search/posts/{boardTitle}")
	public List<BoardResponse> searchPostOfTitle(@PathVariable(value = "boardTitle") String boardTitle) {
		return service.searchPostsOfTitle(boardTitle);
	}
	
	/**
	 * 내용으로 게시글 목록 검색
	 */
	@GetMapping("/search/posts/{boardContent}")
	public List<BoardResponse> searchPostOfContent(@PathVariable(value = "boardContent") String boardContent) {
		return service.searchPostsOfContent(boardContent);
	}
}
