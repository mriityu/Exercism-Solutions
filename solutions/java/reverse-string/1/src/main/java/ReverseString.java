class ReverseString {

    String reverse(String inputString) {
        char[] arr = inputString.toCharArray();
        int len = arr.length;

        for (int i = 0; i < len / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }

        return new String(arr);
    }
    
}
