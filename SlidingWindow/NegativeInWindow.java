import java.util.*;

public class NegativeInWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value of k ");
        int k = sc.nextInt();
        for(int i:firstNegInt(arr, k))
        {
            System.out.print(i);
        }
    }



    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        Queue <Integer> negativeNumbers = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        int windowSize=k;
        int start=0,end=0;
      
      while(end<arr.length)
      {
          if(arr[end]<0)
          {
            negativeNumbers.add(arr[end]);
          }
          if(end-start+1==windowSize)
          {
            if(negativeNumbers.size()==0)
            {
                answer.add(0);
            }
            else
            {
                answer.add(negativeNumbers.peek());
            }
            if(arr[start]<0)
            {
                negativeNumbers.remove();
            }
            start++;
          }
          end++;
      }
      return answer;
    }
    }

