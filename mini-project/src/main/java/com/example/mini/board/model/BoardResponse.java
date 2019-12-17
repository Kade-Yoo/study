package com.example.mini.board.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;


/**
 * 게시글 Table
 * @author yhm92
 * 2019. 12. 16
 */
// DB Table이라는 것을 명시해준다.
@Table(name = "tbl_board")
// class가 Entity라는 것을 명시해준다.
@Entity
@Getter
public class BoardResponse {

	// Table Id로 지정
	@Id
	// Table Primary Key 지정 => DB Sequence 사용
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer boardId;

	// board column , not null로 지정
	@Column(name = "board_title", nullable = false)
	private String boardTitle;
	
	@Column(name = "board_content", nullable = false)
	private String boardContent;

	@Column(name = "board_user_id", nullable = false)
	private String boardUserId;

	// Builder를 설명할 수 있는 단어는 뭐가있을까...
	@Builder
	public BoardResponse(String boardTitle, String boardContent, String boardUserId) {
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardUserId = boardUserId;
	}
}
