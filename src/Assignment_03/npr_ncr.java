package Assignment_03;

public class npr_ncr {

   static int nfactorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return n*nfactorial(n-1);
    }


    static int rfactorial(int r)
    {
        if (r == 0)
            return 1;
        else
            return r*nfactorial(r-1);
    }


    static int nrfactorial(int nr)
    {
        if (nr == 0)
            return 1;
        else
            return nr*nfactorial(nr-1);
    }


    public static void main(String[] args) {
        //nCr = n!/r!(n-r)!
        //nPr = n!/(n-r)!

        int n=15,r=2;
        int x=n-r;
         int nfact=  nfactorial(n);
        int rfact=rfactorial(r);
        int nrfact=nrfactorial(x);
        System.out.println(nfact);
        System.out.println(rfact);
        System.out.println(nrfact);
        //int npr=nfact/nrfact;
        //int ncr=npr/rfact  ;
         int ncr = nfact/(rfact*nrfact);
        System.out.println("The Combination(nCr) value is " +ncr);


        //System.out.println("The Permutation(nPr) value is " + npr);



    }

}
