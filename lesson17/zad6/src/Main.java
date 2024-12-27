public class Main {
    public static void main(String[] args) {
        GradesReversed gr = new GradesReversed();
        String[] grades = {
                "Вероника Чехова физика — Безупречно",
                "Анна Строкова математика — Потрясающе",
                "Иван Петров геометрия — Безупречно"
        };
        String serializedGrades = gr.serializeGrades(grades);
        System.out.println(serializedGrades);
    }
}