/* Creates a function called sock Mechant with
 inputs being n and ar */

function sockMerchant(n, ar) {
    var res = 0;
        ar.sort();
        for(let i=0; i<n;i++){
            if(ar[i] == ar[i+1]){
                i++;
                      res++;
               }
        }
    return res;
    }