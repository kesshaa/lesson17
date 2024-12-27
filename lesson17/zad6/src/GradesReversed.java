import java.util.ArrayList;
import java.util.List;
public class GradesReversed {

    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        List<String> result = new ArrayList<>();
        for (String gradeLine : grades) {
            String[] parts = gradeLine.split(" — ");
            if (parts.length >= 2) {
                String[] studentParts = parts[0].split(" ");
                String name = studentParts[0].toLowerCase();
                String surname = studentParts[1].toLowerCase();
                String subject = parts[1].toLowerCase();
                String grade = gradeStringToInt(parts[1]);

                if (studentParts.length >= 2 && grade != null) {
                    result.add(String.join(",", name, surname, subject, grade));
                }
            }
        }
        return String.join(";", result);
    }

}
