package com.javarush.task.task12.task1226;

/* 
Fly, Run, Climb для классов Cat, Dog, Tiger, Duck
*/

public class Solution {
    public interface Fly{
        void fly();
    }
    public interface Climb{
        void climb();
    }
    public interface Run{
        void run();
    }

    public class Cat implements Climb, Run{
        public void climb(){}//не забываем, что методы в интерфейсах - автоматом паблик, поэтому при переопределении нужно писать паблик
        public void run(){}
    }

    public class Dog implements Run{
        public void run(){}
    }

    public class Tiger extends Cat {//так как тигр наследник кота, он унаследует и методы из интерфейса кота
    }

    public class Duck implements Run, Fly{
        public void run(){}
        public void fly(){}
    }
}
