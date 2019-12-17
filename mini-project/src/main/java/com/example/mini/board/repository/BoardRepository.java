package com.example.mini.board.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mini.board.model.BoardResponse;

/**
 * �Խ��� Repository
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
	 * title�� �Խñ� ��� �˻�
	 * 
	 * DB Query�� �ۼ��� �� �ֵ��� ��.
	 * mybatis ó�� ���ǹ��� �����°ǰ�???
	 */
	@Query (value = SELECT_POSTS_OF_TITLE)
	List<BoardResponse> selectPostsOfTitle(@Param("boardTitle") String boardTitle);

	/**
	 * content�� �Խñ� ��� �˻�
	 */
	@Query (value = SELECT_POSTS_OF_CONTENT)
	List<BoardResponse> selectPostsOfContent(@Param("boardContent") String boardContent);
}
