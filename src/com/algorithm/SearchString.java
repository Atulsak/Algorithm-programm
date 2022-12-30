package com.algorithm;

public class SearchString {

	  static int binarySearch(String[] list, String x)
	    {
	        int l = 0, r = list.length - 1;
	        while (l <= r) {
	            int m = l + (r - l) / 2;

	            int res = x.compareTo(list[m]);
	            if (res == 0)
	                return m;
	            if (res > 0)
	                l = m + 1;
	            else
	                r = m - 1;
	        }

	        return -1;
	    }

	    public static void main(String[] args) {

	        String[] list = { "Apple", "banana", "mango", "anannas"};
	        String x = "mango";
	        int result = binarySearch(list, x);

	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at "
	                    + "index " + result);
	    }
}
