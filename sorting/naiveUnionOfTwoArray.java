class naivUnionOfTwoArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
      // code here
      ArrayList<Integer> list = new ArrayList<>();
      int n=a.length;
      int m = b.length;
      int temp[] = new int[n+m];
      int k=0;
      for(int i=0;i<n;i++){
          temp[k] = a[i];
          k++;
      }
      for(int j=0;j<m;j++){
          temp[k] = b[j];
          k++;
      }
      Arrays.sort(temp);
      for(int i=0;i<(n+m);i++){
        if(i==0 || temp[i] != temp[i-1]){
            list.add(temp[i]);
        }
      }
      return list;
    }
}
