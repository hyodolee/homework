package ex0212.board;
/**
 * 모든 게시판이 공통으로 갖는 속성 관리 하는 객체(DTO=VO+Domain)
 * 글번호, 제목, 작성자, 내용
 */
public class Board {
	public int no;
	public String Subject;
	public String writer;
	public String content;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Board() {}
	
	public Board(int no, String subject, String writer, String content) {
		super();
		this.no = no;
		Subject = subject;
		this.writer = writer;
		this.content = content;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [no=");
		builder.append(no);
		builder.append(", Subject=");
		builder.append(Subject);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", content=");
		builder.append(content);
		builder.append("]");
		return builder.toString();
	}
}
