package activities;

public class Activity2 {

    public static void main(String args[]){

        //Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]


        int arr[]={10, 77, 10, 54, -11, 10};

        Activity2 obj=new Activity2();
        boolean resultSum=obj.result(arr);

        //Find the 10's in the array and add them
        //Check if value is equal to 30.
        if(resultSum==true)
            System.out.println("Sum  of 10's in array is exactly 30");
        else
            System.out.println("Sum  of 10's in array is not 30");



    }

    public boolean result(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==10)
                sum+=arr[i];
        }

        if(sum==30){
            return true;
        }
        return false;

    }

}
