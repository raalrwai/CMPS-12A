class PermutationTest{

     public static void main(String[] args){
             int[] A = {6,5,4,8,7,3,2,1};
                   int[] B = {1,2,3,4};

                    Queens.printArray(A);
                          Queens.nextPermutation(A);
                                Queens.printArray(A);
                                 System.out.println();
                                  Queens.printArray(B);
                                        for(int i=0; i<24; i++){  // note that 4! = 24
                                                   Queens.nextPermutation(B);
                                                            Queens.printArray(B);
                                                                  }
                                           }
}
