package OOPS;
class Arraylist{
    int [] arr;
    int idx=0;
    int size=0;
    // fix the capacity
    Arraylist(int capacity){
        arr=new int[capacity];
    }
    //add array ele
    void add(int ele){
        arr[idx++]=ele;
        size++;
    }
    //remove ele
    void RemoveFromEnd(){
        idx--;
        size--;
    }
    //insert array ele from particular idx
    void insert(int idx, int value){
        for(int i=size;i>idx;i--){
            arr[i]=arr[i-1];
        }
        arr[idx]=value;
        size++;
    }
    // remove element from particular idx
    void remove(int idx){
        for(int i=idx;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }
    //increase capacity of arr
    int capacity(){
        if(idx==arr.length){
            increasecapacity();
        }
        return arr.length;
    }
     //increase capacity of arr by creating new array
    void increasecapacity(){
        int[] arr2=new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        arr=arr2;
    }
    //print particular idx ele
     int get(int idx){
        return arr[idx];
    }
    //set ele at particular idx
     void set(int idx,int value){
        arr[idx]=value;
    }
// display array ele 
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
public class OwnArrayList {
    public static void main(String[] args) {
        Arraylist arr=new Arraylist(10);
        arr.add(10); arr.add(20); arr.add(30); arr.add(40);
        System.out.println(arr.size);
        arr.display();
        System.out.println(arr.get(1));
        arr.add(50);arr.add(60);arr.add(70);
        arr.display();
       arr.RemoveFromEnd();
       arr.display();
       arr.insert(2,25);
       arr.display();
       arr.remove(3);
        arr.display();
    }
    
}
