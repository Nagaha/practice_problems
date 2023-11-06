class SeatManager {
    boolean arr[];
    
    public SeatManager(int n) {
        arr=new boolean[n];

    }
    
    public int reserve() {
        int seatNo=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(!arr[i]){
              seatNo=(i+1);
              arr[i]=true;
              break;
            }
        }
        return seatNo;
    }
    public void unreserve(int seatNumber) {
        arr[seatNumber-1]=false;
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
