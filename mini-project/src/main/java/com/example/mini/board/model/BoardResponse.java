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
 * �Խñ� Table
 * @author yhm92
 * 2019. 12. 16
 */
// DB Table�̶�� ���� ������ش�.
@Table(name = "tbl_board")
// class�� Entity��� ���� ������ش�.
@Entity
@Getter
public class BoardResponse {

	// Table Id�� ����
	@Id
	// Table Primary Key ���� => DB Sequence ���
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer boardId;

	// board column , not null�� ����
	@Column(name = "board_title", nullable = false)
	private String boardTitle;
	
	@Column(name = "board_content", nullable = false)
	private String boardContent;

	@Column(name = "board_user_id", nullable = false)
	private String boardUserId;

	// Builder�� ������ �� �ִ� �ܾ�� ����������...
	@Builder
	public BoardResponse(String boardTitle, String boardContent, String boardUserId) {
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardUserId = boardUserId;
	}
}
