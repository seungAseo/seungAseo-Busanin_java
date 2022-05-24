package test;

public class StudentScore {

	public static void main(String[] args) {
		String name[] = {"1번 학생:", "2번 학생:", "3번 학생:", "4번 학생:", "5번 학생:"};
		int [][] scores = {
				{80,60,70}, {90,95,80}, {75,80,100}, {80,70,95}, {100,65,80}
		};
		int[] sum_private = new int[5];    
        float[] average = new float[5];    
       
        for(int i=0; i<scores.length; i++){  
            for(int j=0;j<scores[1].length;j++){    
            	sum_private[i]+=scores[i][j]; 
                average[i]=(float)sum_private[i]/scores[1].length; 
            }  
        } 
	
    System.out.println("학생번호\t국어\t영어\t수학\t총점\t평균\n" +  
            "===============================================");  
    for(int i=0; i<scores.length; i++){  
        System.out.print(name[i]+"\t"+" "); 
        for(int j=0; j<scores[1].length; j++){  
            System.out.print(scores[i][j]+"\t");  
        }  
        System.out.print(sum_private[i]+"\t");  
        System.out.print(Math.floor(average[i]));   
        System.out.println("");
    	}
    }    

}
