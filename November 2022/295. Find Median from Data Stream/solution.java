// Asked on 12-11-2022 (DD-MM-YYYY)
// Language: JAVA

class MedianFinder {
  private PriorityQueue < Integer > first;
  private PriorityQueue < Integer > second;

  private boolean isEven;

  public MedianFinder() {
    this.first = new PriorityQueue < > (Collections.reverseOrder());
    this.second = new PriorityQueue < > ();
    this.isEven = true;
  }

  public void addNum(int num) {
    if (this.isEven) {
      second.offer(num);
      first.offer(second.poll());
    } else {
      first.offer(num);
      second.offer(first.poll());
    }
    this.isEven = !(this.isEven);
  }

  public double findMedian() {
    if (!(this.isEven)) {
      return first.peek();
    } else {
      return ((first.peek() + second.peek()) / 2.0);
    }
  }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
