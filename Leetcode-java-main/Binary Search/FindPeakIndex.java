class FindPeakIndex {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // we are in the decreasing part of the mountain
                // this may be the answer, but look left also
                end = mid;
            } else {
                // we are in the ascending part of the mountain
                start = mid + 1;
            }
        }
        // start == end is the peak index
        return start;
    }
}
