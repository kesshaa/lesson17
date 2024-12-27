public class Main {
    public static void main(String[] args) {

        String start = "Привет! Меня зовут ";

        StringBuilder hello = new StringBuilder();
        hello.append("Никита. ");
        hello.append("Я из города ");
        hello.append("Зеленодольск.");



        String asString = start + hello.toString();
        System.out.println(asString);
    }
}