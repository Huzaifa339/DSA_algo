// https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1

class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    { 
       
       
        ArrayList<Long> array=new ArrayList<Long>(){
            
        };
        
         int y=-1;
         int z=-1;

        for(int i=0; i<n ; i++) {
            if(arr[i] == x){
                if(z==-1){
                    z=i;
                }
                y = i;
            }
        }
        
        array.add(Long.valueOf(z));
        array.add(Long.valueOf(y));
        return array;
        
    }
}
