class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        
        int i = 0, j = 0, k = 0;
        
        // Merge both arrays in sorted order
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        
        // Copy remaining elements of nums1, if any
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        
        // Copy remaining elements of nums2, if any
        while (j < n) {
            merged[k++] = nums2[j++];
        }
        
        // Find the median
        int totalLength = m + n;
        if (totalLength % 2 == 1) {
            // Odd length: return the middle element
            return merged[totalLength / 2];
        } else {
            // Even length: return average of the two middle elements
            return (merged[(totalLength / 2) - 1] + merged[totalLength / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solver = new Solution();

        // Test Case 1: Odd total length (Result should be 2.0)
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double median1 = solver.findMedianSortedArrays(nums1, nums2);
        System.out.println("Test Case 1 Median: " + median1);

        // Test Case 2: Even total length (Result should be 2.5)
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        double median2 = solver.findMedianSortedArrays(nums3, nums4);
        System.out.println("Test Case 2 Median: " + median2);
    }
}
