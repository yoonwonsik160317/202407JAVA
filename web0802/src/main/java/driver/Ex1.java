package driver;

import board.BoardDAO;
import board.BoardDTO;

public class Ex1 {

	public static void main(String[] args) {
		BoardDTO dto = new BoardDTO(17, "최하나", "최의 글 제목", "최의 글 내용", null, 0);
		BoardDAO dao = new BoardDAO();
		dao.updateBoard(dto);
	}

}
