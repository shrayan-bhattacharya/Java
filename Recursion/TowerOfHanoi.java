
public class TowerOfHanoi {
    public static void TofHanoi(int n, String src, String helper, String dest) {
        if(n==1){
            System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
            return;     
        }
        TofHanoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
        TofHanoi(n-1, helper, src, dest);        
    }
    public static void main(String[] args) {
        int n=3;
        TofHanoi(n,"S","H", "D");
    }    
}              