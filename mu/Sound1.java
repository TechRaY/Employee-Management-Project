

import java.io.*;
import sun.audio.*;
import javax.sound.sampled.*;
import javax.sound.*;

public class Sound1
{
	public static void success()
	{
		
		try{
			String songFile="success.wav";
			InputStream in=new FileInputStream(songFile);
			AudioStream audioStream=new AudioStream(in);
			AudioPlayer.player.start(audioStream);
		}
        catch(Exception e)
        {

		System.out.println(e);
	  }

}
	
	


public static void failure()
{
	try
	{
	String songFile="failure.wav";
	InputStream in = new FileInputStream(songFile);
	AudioStream audioStream=new AudioStream(in);
	AudioPlayer.player.start(audioStream);
    }
	catch(Exception e)
	{
		System.out.println(e);
	}
}


  public static void main(String args[])
  {
  	Sound1 s=new Sound1();
  	s.success();

  }


}