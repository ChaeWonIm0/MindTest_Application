import javax.swing.*;

/** file 이름 : Application_mindtest
 * Created by : icw
 * Created on : Dec 2024
 * Modified on : *
 * Purpose : 조건문과 JOptionpane을 사용해 심리적 조언을 해주는 각본의 초기 모델
 */
public class Application_mindtest {
    public static void main(String[] args) {
        try {
            // Look and Feel 설정
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 옵션 다이얼로그 실행
        OptionManager optionManager = new OptionManager();
        String selectedFeeling = optionManager.askCurrentFeeling();

        if ("매우 불편함".equals(selectedFeeling)) {
            // 매우 불편함을 선택한 경우
            optionManager.askReason_veryUncomfortable(selectedFeeling);
        } else if ("불편함".equals(selectedFeeling)){
            // 불편함을 선택한 경우
            optionManager.askReason_Uncomfortable(selectedFeeling);
        } else if ("그저그럼".equals(selectedFeeling)){
            // 아무렇지도 않음을 선택한 경우
            optionManager.askReason_Soso(selectedFeeling);
        } else if ("편안함".equals(selectedFeeling)){
            // 편안함을 선택한 경우
            optionManager.askReason_comfortable(selectedFeeling);
        } else if ("매우 편안함".equals(selectedFeeling)){
            // 불편함을 선택한 경우
            optionManager.askReason_very_comfortable(selectedFeeling);
        }
        else {
            System.out.println("선택된 감정 상태: " + selectedFeeling);
        }
    }
}


