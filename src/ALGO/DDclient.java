package ALGO;

public class DDclient
{
    public static void main(String[] args) {
        DDlinkedlist l=new DDlinkedlist();
       l.addBegin(40);
       l.addBegin(30);
       l.addBegin(20);
       l.addBegin(10);
       l.addLast(50);
       l.addLast(60);
       DDlinkedlist m=new DDlinkedlist();
       m.addLast(70);
       m.addLast(80);
       m.addLast(90);
       m.addLast(100);
      // l.display();
        l.display();
        m.display();
      l.trainProblem(l,m,60,100);
       l.display();
       m.display();
    }
}
