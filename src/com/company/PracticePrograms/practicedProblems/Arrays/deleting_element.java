package com.company.PracticePrograms.practicedProblems.Arrays;

public class deleting_element {
    public static void main(String args[])
    {
        int prev, next, sum, n;
        prev=next=1;
        for(n=1;n<=10;n++)
        {
            System.out.println(prev);
            sum=prev+next;
            prev=next;
            next=sum;
        }
    }
}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        int index;
//        for (index = 0; index < arr.length; index++) {
//            int element = sc.nextInt();
//            arr[index] = element;
//        }
//        System.out.println(Arrays.toString((arr)));
//        System.out.println("Enter the element to be deleted");
//        int delete_element = sc.nextInt();
//        for (index = 0; index < arr.length - 1; index++) {
//            if (arr[index] == delete_element) {
//
//            }
//        }
//    }