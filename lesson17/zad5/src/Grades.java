public class Grades {

    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        String[] data = grades.split(";");

        for (String item : data) {
            String[] info = item.split(",");
            String name = capitalize(info[0]);
            String surname = capitalize(info[1]);
            String subject = info[2].toLowerCase();
            String grade = gradeToString(info[3]);
            System.out.println(String.join(" ", name, surname, subject, "-", grade));

        }
    }


}