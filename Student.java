public class Student {
  // instance variables
  private String name;
  private double score;
  private double average;
  private double numOfQuiz;

  // constructors
  public Student(String initialName) {
    name = initialName;
    score = 0;
    average = 0;
    numOfQuiz = 0;
  }

  // methods
  /** gets name of student
   * @return student's name
   */
  public String getName() {
    return name;
  }

  /**
   * adds another quiz score to original score
   * adds 1 to number of quizzes every time a new score is entered
   * @param score - new quiz score
   */
  public void addQuiz(int initialScore) {
    score = score + initialScore;
    numOfQuiz = numOfQuiz + 1;
  }

  /**
   * gets total of all scores entered
   * @return score - total score
   */
  public double getTotalScore() {
    return score;
  }

  /**
   * gets the average score by dividing total score by the number of quizzes entered 
   * @return average - average score
   */
  public double getAverageScore() {
    average = score / numOfQuiz;
    return average;

  }
}
