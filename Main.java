import view.*;
import java.util.Scanner;

// Main - View - Controller - Service/ServiceImpl(-DTO) -

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner 는 Main 에서 한번만 호출함.

        while (true){
            System.out.println("=== [메인화면] 0-종료 1-회원관리 2-성적표 3-게시판 4-카우프 " +
                    "5-사용자관리(맵) 6-어카운트관리 ===");
            switch (sc.next()){
                case "0": return; //return 은 루프를 탈출하는 명령어. 반드시 걸고 시작할 것
                case "1": AuthView.main(sc);break;
                case "2": GradeView.main(sc); break;
                case "3": BoardView.main(); break;
                case "4": KaupView.main(sc); break;
                case "5": UserView.main(sc); break;         // UserView Class 와 Main 을 이어줌.
                case "6": AccountView.main(sc); break;
            }
        }

    }
}