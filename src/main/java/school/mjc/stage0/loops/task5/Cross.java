package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        String res = "";
        String a = " ";
        int dil = sideLength/2 +1;
        for (int y=1; y<=sideLength; y++){
            if(y== dil){
                for (int x=1; x<=sideLength;x++){
                    res+=8;}
                System.out.println(res);
                res="";}
            else{
                for (int x=1; x<=sideLength; x++){
                    if(x == dil){
                        res+=8;}
                    else{
                        res+=a;}}
                System.out.println(res);
                res="";}}
    }
}