import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
    
    // Instantiates a DataScene object to play in the Theater
    DataScene scene = new DataScene();
    
    // Calls any DataScene methods to display
    scene.drawScene();
    
    // Plays the DataScene in the theater
    Theater.playScenes(scene);
    
  }
}