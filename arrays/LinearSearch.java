class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 3};
        int key = 9;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if(!found)
            System.out.println("Element not found");
    }
}
