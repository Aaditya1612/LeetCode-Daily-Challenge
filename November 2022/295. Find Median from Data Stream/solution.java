// Asked on 12-11-2022 (DD-MM-YYYY)
// Language: JAVA

class MedianFinder {
  private PriorityQueue < Integer > first;
  private PriorityQueue < Integer > second;
  private boolean isEven = true;
  public MedianFinder() {
    this.first = new PriorityQueue < > (Collections.reverseOrder());
    this.second = new PriorityQueue < > ();

  }

  public void addNum(int num) {
    if (isEven) {
      second.offer(num);
      first.offer(second.poll());
    } else {
      first.offer(num);
      second.offer(first.poll());
    }
    isEven = !isEven;
  }

  public double findMedian() {
    if (!isEven) {
      return first.peek();
    } else {
      return ((first.peek() + second.peek()) / 2.0);
    }
  }
}
