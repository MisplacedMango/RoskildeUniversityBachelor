
public class shortQueue {

    String buffer = null;

        void put (String s){if(buffer==null)buffer=s;}
        String take () {String s = buffer; buffer=null; return s; }
        boolean isFull () {return buffer!=null; }


    }

