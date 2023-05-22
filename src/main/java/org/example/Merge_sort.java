package org.example;

public class Merge_sort {
        private int[] ans = new int[100000];

        static void merge_sort(int l,int r , int[] a){
            if(l==r) return;

            int mid=l+r>>1;
            merge_sort(l,mid , a);
            merge_sort(mid+1,r , a);

            int[] h=new int[r-l+1];
            int idx=0;
            int i=l;
            int j=mid+1;
            while(i<=mid&&j<=r){
                if(a[i]<=a[j]) h[idx++]=a[i++];
                else h[idx++]=a[j++];
            }

            while(i<=mid) h[idx++]=a[i++];
            while(j<=r) h[idx++]=a[j++];

            for(int k=0;k<idx;k++){
                a[k+l]=h[k];
            }
        }

        public Merge_sort(int n , int[] q){
            for(int i=0; i<n; i++){ans[i] = q[i];}
            merge_sort(0,n-1 , ans);
        }
        public int[] getAns()
        {
            return ans;
        }
}
