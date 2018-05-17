import java.util.ArrayList;

public class MinIntHeap {
    private ArrayList<Integer> items = new ArrayList<>();

    public int peek() {
        return items.get(0);
    }

    public int poll() {
        int item = items.remove(0);
        swap(0, items.size() - 1);
        heapifyDown();
        return item;
    }

    public boolean add(int value) {
        items.add(value);
        heapifyUp();
        return true;
    }

    public boolean remove(int value) {
        return true;
    }

    public int size() {
        return this.items.size();
    }

    private void heapifyUp() {
        int index = size() - 1;
        while(hasParent(index) && (parent(index) > items.get(index))){
            swap(getParentIndex(index), index);
        }
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int parent(int index) {
        return items.get(getParentIndex(index));
    }

    private boolean hasParent(int index) {
         return getParentIndex(index) >= 0;
    }

    private void heapifyDown() {
        int index = 0;
        while(hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && (rightChild(index) < leftChild(index))){
                smallerChildIndex = getRightChildIndex(index);
            }
            if(items.get(index) < items.get(smallerChildIndex)) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    private int leftChild(int index) {
        return items.get(getLeftChildIndex(index));
    }

    private int rightChild(int index) {
        return items.get(getRightChildIndex(index));
    }

    private int getRightChildIndex(int index) {
        return index * 2 + 2;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < items.size() - 1;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < items.size() - 1;
    }

    private int getLeftChildIndex(int index) {
        return index * 2 + 1;
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = items.get(indexOne);
        items.set(indexOne, items.get(indexTwo));
        items.set(indexTwo, temp);
    }

}
