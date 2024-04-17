class Solution {
    boolean solution(String s) {
        
        /*
            조건1. 대문자, 소문자 구별 안함
            조건2. P,Y가 둘다 없을 경우 TRUE 
            조건3. P,Y 개수가 같을 경우 TRUE 아닐 경우 FALSE
        */
        
        boolean answer = true;
        String upperStr = s.toUpperCase();
        char[] charAry = upperStr.toCharArray();
        
        int pcnt = 0;
        int ycnt = 0;
        
        for(int i=0; i<charAry.length; i++){
            if(charAry[i]=='P') pcnt++;
            else if(charAry[i]=='Y') ycnt++;
        }
            
       if(pcnt != ycnt) answer = false;
        
        return answer;
    }
}