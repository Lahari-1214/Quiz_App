public class Main {
    public static void main(String[] args) {
        // Create a Question object
        Question question = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");

        // Display the question and options
        System.out.println("Question ID: " + question.getId());
        System.out.println("Question: " + question.getQuestion());
        System.out.println("Option 1: " + question.getOpt1());
        System.out.println("Option 2: " + question.getOpt2());
        System.out.println("Option 3: " + question.getOpt3());
        System.out.println("Option 4: " + question.getOpt4());
        System.out.println("Answer: " + question.getAnswer());
    }
}