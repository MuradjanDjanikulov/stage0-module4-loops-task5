package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String res = "";
        String a = " ";

        for (int y=1; y<= sideLength; y++){
            if(y==1 || y== sideLength){
                for (int x=1; x<=sideLength;x++){
                    res+=8;}
                System.out.println(res);
                res="";}
            else{
                for (int x=1; x<=sideLength;x++){
                    if(x==1 || x==sideLength){
                        res+=8;}
                    else{
                        res+=a;}}
                System.out.println(res);
                res="";}}
    }
}