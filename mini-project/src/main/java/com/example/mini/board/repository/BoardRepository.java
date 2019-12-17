package com.example.mini.board.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mini.board.model.BoardResponse;

/**
 * 게시판 Repository
 * 
 * @author yhm92
 * 2019. 12. 16
 */
@Repository
public interface BoardRepository extends JpaRepository<BoardResponse, Integer>{
	
	String SELECT_POSTS_OF_TITLE = "SELECT * "
								+ "FROM tbl_board "
								+ "WHERE board_title = (:boardTitle)";
	String SELECT_POSTS_OF_CONTENT = "SELECT *"
									+ "FROM tbl_board"
									+ "WHERE board_content = (:boardContent)";
	
	/**
	 * title로 게시글 목록 검색
	 * 
	 * DB Query를 작성할 수 있도록 함.
	 * mybatis 처럼 조건문은 못쓰는건가???
	 */
	@Query (value = SELECT_POSTS_OF_TITLE)
	List<BoardResponse> selectPostsOfTitle(@Param("boardTitle") String boardTitle);

	/**
	 * content로 게시글 목록 검색
	 */
	@Query (value = SELECT_POSTS_OF_CONTENT)
	List<BoardResponse> selectPostsOfContent(@Param("boardContent") String boardContent);
}
