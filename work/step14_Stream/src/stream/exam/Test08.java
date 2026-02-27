package stream.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 90점 이상 학생의 전공(Major)을 대문자로 변환하여 출력 (filter + map + collect)
 * List<Student>에서 90점 이상인 학생들의 전공(Major)을 대문자로 변환하여 리스트로 출력하시오.
 */
public class Test08 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("희정", 22, 88.5, "Computer Science"),
                new Student("가현", 24, 76.2, "Mathematics"),
                new Student("찬범", 23, 92.3, "Computer Science"),
                new Student("현솔", 25, 81.7, "Physics"));

        List<String> stu = students.stream()
                .filter((s) -> s.getScore() >= 90)
                .map((s) -> s.getMajor().toUpperCase())
                .collect(Collectors.toList());

        stu.forEach((s) -> System.out.println(s));

    }
}
// * package stream.exam;
// * 
// * import java.util.Arrays;
// * import java.util.List;
// * import java.util.stream.Collectors;
// * 
// * /**
// * 90점 이상 학생의 전공(Major)을 대문자로 변환하여 출력 (filter + map + collect)
// * List<Student>에서 90점 이상인 학생들의 전공(Major)을 대문자로 변환하여 리스트로 출력하시오.
// */
//public class Test08 {
//    public static void main(String[] args) {
//        // 프로그램 시작 지점: Test08 객체를 생성하고 실행합니다.
//        new Test08().run();
//    }
//
//    public void run() {
//        // 1. 학생 데이터 준비
//        List<Student> students = getStudents();
//
//        // 2. 조건에 맞는 데이터 가공 (스트림 활용)
//        List<String> stu = getProcessedMajors(students);
//
//        // 3. 콘솔 출력
//        stu.forEach((s) -> System.out.println(s));
//
//        // 4. GUI 화면 출력 (Swing 구성 요소는 이벤트 분배 스레드에서 생성하는 것이 안전합니다)
//        javax.swing.SwingUtilities.invokeLater(() -> createAndShowGUI(stu));
//    }
//
//    /**
//     * 학생 초기 데이터를 생성하여 반환합니다.
//     */
//    private List<Student> getStudents() {
//        return Arrays.asList(
//                new Student("희정", 22, 88.5, "Computer Science"),
//                new Student("가현", 24, 76.2, "Mathematics"),
//                new Student("찬범", 23, 92.3, "Computer Science"),
//                new Student("현솔", 25, 81.7, "Physics"));
//    }
//
//    /**
//     * 특정 조건(예: 점수 60 이상)을 만족하는 학생의 전공을 대문자로 변환하여 반환합니다.
//     */
//    private List<String> getProcessedMajors(List<Student> students) {
//        return students.stream()
//                .filter((s) -> s.getScore() >= 60)
//                .map((s) -> s.getMajor().toUpperCase())
//                .collect(Collectors.toList());
//    }
//
//    /**
//     * 리스트 데이터를 기반으로 Swing GUI 창을 생성하고 보여줍니다.
//     */
//    private void createAndShowGUI(List<String> dataList) {
//        javax.swing.JFrame frame = new javax.swing.JFrame("90점 이상 학생 전공 목록");
//        javax.swing.JList<String> list = new javax.swing.JList<>(dataList.toArray(new String[0]));
//
//        frame.add(new javax.swing.JScrollPane(list));
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//
//        // 리스트 더블 클릭 감지 이벤트 적용
//        addDoubleClickEvent(list, frame);
//
//        frame.setVisible(true);
//    }
//
//    /**
//     * JList의 항목을 더블 클릭했을 때 정보를 팝업으로 보여주는 이벤트를 등록합니다.
//     */
//    private void addDoubleClickEvent(javax.swing.JList<String> list, javax.swing.JFrame parentFrame) {
//        list.addMouseListener(new java.awt.event.MouseAdapter() {
//            @Override
//            public void mouseClicked(java.awt.event.MouseEvent e) {
//                if (e.getClickCount() == 2) { // 더블 클릭 확인
//                    String selectedValue = list.getSelectedValue();
//                    if (selectedValue != null) {
//                        javax.swing.JOptionPane.showMessageDialog(parentFrame, selectedValue);
//                    }
//                }
//            }
//        });
//    }
//}