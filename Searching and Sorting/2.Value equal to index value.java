

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> array = new ArrayList<Integer>(){
            
        };
        int y=0;
        for(int i=0; i<n ;i++){
            if(arr[i] == i+1){
                y=i+1;
                array.add(y);
            }
        }
        
        return array;
    }
}