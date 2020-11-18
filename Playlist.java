import java.util.ArrayList;
import java.util.*;

class Playlist {
  
  public static void main(String[] args) {
 ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
 desertIslandPlaylist.add("suriya son krishna");
 desertIslandPlaylist.add("AR Rehman");
 desertIslandPlaylist.add("DSP");
 desertIslandPlaylist.add("Thaman");
 desertIslandPlaylist.add("Melody");
 desertIslandPlaylist.add("Old ones");
 System.out.println(desertIslandPlaylist);
System.out.println(desertIslandPlaylist.size());
System.out.println(desertIslandPlaylist.remove(3));
 System.out.println(desertIslandPlaylist);
 System.out.println(desertIslandPlaylist.size());
  System.out.println(desertIslandPlaylist.indexOf("DSP"));
   System.out.println(desertIslandPlaylist.indexOf("Melody"));
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