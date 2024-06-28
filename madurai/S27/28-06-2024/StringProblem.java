    
    
class StringProblem {
    public static void main(String[] args) {
        String str = "madam";
        printAns(str);
    }

    private static void printAns(String str) {
        int[][] arr = new int[str.length()][str.length()];
        int ri=0,ci=0;
        int totalCount = 0;
        int lpssi = 0, lpsei = 0;
        int spssi = 0, spsei = 0;
        boolean isSpsE = false;
        while(ci < arr.length){
            int cFlag = ci;
            while (cFlag < arr.length){
                if(ri == cFlag){
                    arr[ri][cFlag] = 1;
                    totalCount+=1;
                }else if(Math.abs(ri-cFlag) <=2){
                    if(str.charAt(ri) == str.charAt(cFlag)){
                        arr[ri][cFlag] = 1;
                        totalCount+=1;
                        if((lpsei- lpssi+1) < Math.abs(cFlag-ri)){
                            lpssi = ri;
                            lpsei = cFlag;
                        }
                       if(isSpsE == false){
                        isSpsE =true;
                        spssi = ri;
                        spsei = cFlag;
                       }
                    }
                }else{
                    if(str.charAt(ri) == str.charAt(cFlag)){
                        if( arr[ri+1][cFlag-1] == 1){
                            arr[ri][cFlag] = 1;
                            totalCount+=1;
                            if((lpsei- lpssi+1) < Math.abs(cFlag-ri)){
                                lpssi = ri;
                                lpsei = cFlag;
                            }
                            if(isSpsE == false){
                                isSpsE =true;
                                spssi = ri;
                                spsei = cFlag;
                               }
                        }
                    }
                }
                //System.out.print(arr[ri][cFlag]+" ");
                ri+=1;
                cFlag+=1;
            }
            ri = 0;
            ci+=1;
        }
        System.out.println(totalCount);
        System.out.println(str.substring(lpssi, lpsei+1));
        System.out.println(str.substring(spssi, spsei+1));

    }
}
