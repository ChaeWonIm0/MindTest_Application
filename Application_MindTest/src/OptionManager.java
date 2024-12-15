/** file 이름 : OptionManager.java
 * Created by : icw
 * Created on : Dec 2024
 * Modified on : *
 * Purpose : 초기 모델의 선택지 옵션 관리
 */

import javax.swing.*;

public class OptionManager {
    // 상태 옵션 배열 (감정 상태)
    private final String[] feelings = {
            "매우 편안함",
            "편안함",
            "그저 그럼",
            "불편함",
            "매우 불편함"
    };

    // 이유 옵션 배열 (매우 불편함의 원인)
    private final String[] very_uncomfortable = {
            "나도 알 수 없는 이유로 크게 불안함",
            "인간관계가 원인이 되어 크게 불안함",
            "환경 문제로 크게 불안함",
            "감정 문제로 크게 불안함",
            "경제 문제로 크게 불안함",
            "사회적 여건으로 크게 불안함",
            "신체, 건강상태가 크게 불안함"
    };

    private final String[] uncomfortable = {
            "나도 알 수 없는 이유로 불안함",
            "인간관계가 원인이 되어 불안함",
            "환경 문제로 불안함",
            "감정 문제로 불안함",
            "경제적 문제로 불안함",
            "신체, 건강상태가 불안함"
    };
    private final String[] comfortable = {
            "나도 알 수 없는 이유",
            "인간관계",
            "환경에 관한 문제",
            "감정에 관한 문제",
            "경제적 문제",
            "신체, 건강상태"
    };

    // 현재 감정 상태를 묻는 팝업
    public String askCurrentFeeling() {
        int choice = JOptionPane.showOptionDialog(
                null,
                "당신의 현재 기분상태는 어떠십니까?",
                "Application_mindtest",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                feelings,
                feelings
        );

        if (choice >= 0) {
            return feelings[choice];
        } else {
            return "선택 안 함";
        }
    }

    // 매우 불편함의 이유를 묻는 팝업
    public void askReason_veryUncomfortable(String currentFeeling) {
        int choice = JOptionPane.showOptionDialog(
                null,
                "어떠한 이유로 여러분은 " + currentFeeling + "을 겪고 있습니까?",
                "Application_mindtest",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                very_uncomfortable,
                very_uncomfortable
        );

        if (choice >= 0) {
            System.out.println("선택된 이유: " + very_uncomfortable[choice]);
        } else {
            System.out.println("이유를 선택하지 않았습니다.");
        }
    }
    // 불편함의 이유를 묻는 팝업
    public void askReason_Uncomfortable(String currentFeeling) {
        int choice = JOptionPane.showOptionDialog(
                null,
                "어떠한 이유로 여러분은 " + currentFeeling + "을 겪고 있습니까?",
                "Application_mindtest",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                uncomfortable,
                uncomfortable
        );

        if (choice >= 0) {
            System.out.println("선택된 이유: " + uncomfortable[choice]);
        } else {
            System.out.println("이유를 선택하지 않았습니다.");
        }
    }

    public void askReason_Soso(String currentFeeling) {
        int choice = JOptionPane.showOptionDialog(
                null,
                "어떠한 이유로 여러분은 " + currentFeeling + "을 겪고 있습니까?",
                "Application_mindtest",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                uncomfortable,
                uncomfortable
        );

        if (choice >= 0) {
            System.out.println("선택된 이유: " + uncomfortable[choice]);
        } else {
            System.out.println("이유를 선택하지 않았습니다.");
        }
    }
    public void askReason_comfortable(String currentFeeling) {
        int choice = JOptionPane.showOptionDialog(
                null,
                "다행히 " + currentFeeling + "을 겪고 있군요.\n과거, 혹은 가까운 미래에 조금이라도 불안함을 느끼는 것이 있습니까?",
                "Application_mindtest",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                comfortable,
                comfortable
        );

        if (choice >= 0) {
            System.out.println("선택된 이유: " + comfortable[choice]);
        } else {
            System.out.println("이유를 선택하지 않았습니다.");
        }
    }
    public void askReason_very_comfortable(String currentFeeling) {
        JOptionPane.showMessageDialog(
                null,
                currentFeeling + "을 겪고 있다면 아무 문제 없습니다. 현재의 마음가짐을 계속 유지하시기 바랍니다.",
                "Application_mindtest",
                JOptionPane.INFORMATION_MESSAGE
        );



        System.out.println("종료");


    }
}