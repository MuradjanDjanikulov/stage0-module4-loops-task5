package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        String res = "";
        String a = " ";
        for (int y=1; y<= height; y++){
            if(y==1 || y== height){
                for (int x=1; x<=length;x++){
                    res+=8;}
                System.out.println(res);
                res="";}
            else{
                for (int x=1; x<=length; x++){
                    if(x==1 || x==length){
                        res+=8;}
                    else{
                        res+=a;}}
                System.out.println(res);
                res="";}}

    }
}