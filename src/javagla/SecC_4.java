package javagla;

//import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.*;


        abstract class Person{
            abstract void eat();
        }
        class TestAnonymousInner{
            public static void main(String args[]){
                Person p=new Person(){
                    void eat()
                    {System.out.println("nice fruits");
                    }
                };
                p.eat();
            }
        }



