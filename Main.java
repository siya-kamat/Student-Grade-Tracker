class Main {
  public static void main(String[] args) {
    Student siya = new Student("Siya");
    System.out.println("Name: " + siya.getName());

    siya.addQuiz(85);
    siya.addQuiz(90);
    siya.addQuiz(70);

    System.out.println("Total quiz score: " + siya.getTotalScore());

    System.out.println("Average quiz score: " + siya.getAverageScore());

  }
}

/*
Name: Siya
Total quiz score: 245.0
Average quiz score: 81.66666666666667
*/
