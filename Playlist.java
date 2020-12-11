/*program to add our 
favourite songs as playlist */

import java.util.ArrayList;
import java.util.*;

class Playlist {
  
  public static void main(String[] args) {
    /* Creating an arraylist */ 
 ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    // adding the elements to the playlist "desertIslandPlaylist 
 desertIslandPlaylist.add("suriya son krishna");
 desertIslandPlaylist.add("AR Rehman");
 desertIslandPlaylist.add("DSP");
 desertIslandPlaylist.add("Thaman");
 desertIslandPlaylist.add("Melody");
 desertIslandPlaylist.add("Old ones");
 //printing the list which has songs
System.out.println(desertIslandPlaylist);
 /*Finding the size of the list
 removing the song based on the index value
 */
System.out.println(desertIslandPlaylist.size());
System.out.println(desertIslandPlaylist.remove(3));
 System.out.println(desertIslandPlaylist);
 System.out.println(desertIslandPlaylist.size());
  System.out.println(desertIslandPlaylist.indexOf("DSP"));
   System.out.println(desertIslandPlaylist.indexOf("Melody"));
/* swapping the playlists */
  int indexA = desertIslandPlaylist.indexOf("DSP");
  int indexB = desertIslandPlaylist.indexOf("Melody");
String tempA = "DSP";
 desertIslandPlaylist.set(indexA,"Melody");
  desertIslandPlaylist.set(indexB,tempA);
  System.out.println(desertIslandPlaylist);

  }
  
}


  }
  
}
