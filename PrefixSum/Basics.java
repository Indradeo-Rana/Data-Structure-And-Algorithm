public class Basics {
    public static void main(String[] args) {
        int[] a={1,2,3,4,2};
        int pref[]=new int[a.length];
        int suf[]=new int[a.length];

        pref[0]=a[0];

        for(int i=1;i<a.length;i++){
            pref[i]= pref[i-1]+a[i];
            
        }

        // for (int i : pref) {
        //     System.out.print(i+" ");
        // }
        suf[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            suf[i]=suf[i+1]+a[i];
        }
         for (int i : suf) {
                System.out.print(i+" ");
            }
    }
}
