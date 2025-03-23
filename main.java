
import org.python.util.PythonInterpreter;
public class Main {
<<<<<<< Updated upstream
  public static void main(String[] args) {
    System.out.println("Hello World Now");
  }
}
=======

  

  public class PythonInJava {
      public static void main(String[] args) {
          PythonInterpreter interpreter = new PythonInterpreter();
          interpreter.zexec("print('Hello from Python!')");
      }
  }
  
}
>>>>>>> Stashed changes
