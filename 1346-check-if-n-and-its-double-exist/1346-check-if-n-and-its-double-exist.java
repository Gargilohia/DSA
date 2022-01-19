class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> values = new HashSet<>();
        if(arr.length==0||arr.length==1)
            return false;
        for(int i=0;i<arr.length;i++){
            if(values.contains(arr[i]))
                return true;
            values.add(arr[i]*2);
            if(arr[i]%2==0)
                values.add(arr[i]/2);
        }
        return false;
    }
}