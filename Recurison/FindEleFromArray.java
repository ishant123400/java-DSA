package Recurison;

public class FindEleFromArray {
    public static void main(String[] args) {
        int []arr={2,3,1,4,5,6};
        int ele=2;
        arrele(arr,ele,0);
        System.out.println(arrele(arr,ele,0));
    }
    public static boolean arrele(int []arr,int ele,int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==ele) return true;
          return arrele(arr,ele,idx+1);
    }
    
}
