

package burbuja;


public class BURBUJA {

    
    public static void main(String[] args) {
        
        int a[]={9,5,1,0,3,8};
        int aux=0, out=0;
        
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
        
        System.out.println("------------------------------");
        
        for (int i = 0; i < a.length-1; i++) {
            out=0;
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
                    out=1;
                }
            }
            if(out==0)
                break;
        
        }
        
        
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
        
        
    }
}
