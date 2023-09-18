package Java;

class Game{
    Game(String st){
        System.out.println("Most popular Game is : "+st);
    }
    public void play(){
        System.out.println("Game playing");
    }
}
class Indoor extends Game{
    Indoor(){
        super("pubg");
    }
    @Override
    public void play() {
        super.play();
        System.out.println("Play games but inside");
    }

    public void playinside()
    {
        System.out.println("playing Indoor Games");
    }

    public void playonline()
    {  System.out.println("playing online inside Games");  }

    public void playoffline()
    {  System.out.println("playing offline inside Games"); }

}
class Online extends Indoor {
    @Override
    public void playinside(){
          System.out.println("play game online but inside");
    }

    public void playonline(){
        System.out.println("playing online inside Games");
    }
}


class Offline extends Indoor{
    public void playoffline(){
        System.out.println("playing offline inside Games");
    }
}

class Outdoor extends Game{
    Outdoor(){
        super("cricket");
    }
    public void playoutside()
    {
        System.out.println("playing Outdoor Games");
    }

    public void playhockey(){
        System.out.println("playing hockey");
    }

    public void playcricket(){
        System.out.println("playing cricket");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Indoor i1 = new Indoor();
        Outdoor o1 = new Outdoor();

     //   g.play();
        i1.play();
        i1.playinside();
        i1.playonline();
        i1.playoffline();
        o1.playoutside();
        o1.playhockey();
        o1.playcricket();
    }
}
