package ex0212.board;
/**
 * 업로드게시판 비즈니스로직 담당
 */
public class UploadBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("Upload = " + board);
		System.out.println(super.getClass().getSimpleName() + "Insert call");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("Upload = " + board);
		System.out.println(super.getClass().getSimpleName() + "Update call");
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		System.out.println(super.getClass().getSimpleName() + "selectByNo call");
		return new UploadBoard(30,"자료실연습","삼순", "파일첨부.","a.jpg");
	}

}
