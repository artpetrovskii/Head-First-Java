public class Song {
   String title;
   public Song(String t) {
	   title = t;
   }
   public void play() {
	   Player player = new Player(title);
	   player.playSound(title);
   }
}
