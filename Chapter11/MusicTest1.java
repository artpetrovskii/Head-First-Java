import javax.sound.midi.*;

public class MusicTest1 {
   public void play() {
	   try {
	   Sequencer sequencer = MidiSystem.getSequencer();
	   System.out.println("We got synthesizer");
	   } catch(MidiUnavailableException ex) {
		   System.out.println("Unfortune");
      }
   }
   public static void main(String[] args) {
	   MusicTest1 mt = new MusicTest1();
	   mt.play();
   }
}
